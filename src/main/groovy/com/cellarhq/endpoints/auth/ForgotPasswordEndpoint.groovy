package com.cellarhq.endpoints.auth

import static ratpack.handlebars.Template.handlebarsTemplate

import com.cellarhq.Messages
import com.cellarhq.domain.jooq.EmailAccount
import com.cellarhq.services.JooqAccountService
import com.cellarhq.services.email.EmailService
import com.cellarhq.util.LogUtil
import com.cellarhq.util.SessionUtil
import com.google.inject.Inject
import groovy.util.logging.Slf4j
import ratpack.form.Form
import ratpack.groovy.handling.GroovyContext
import ratpack.groovy.handling.GroovyHandler

@SuppressWarnings('NestedBlockDepth')
@Slf4j
class ForgotPasswordEndpoint extends GroovyHandler {

    private final JooqAccountService accountService
    private final EmailService emailService

    @Inject
    ForgotPasswordEndpoint(JooqAccountService accountService, EmailService emailService) {
        this.accountService = accountService
        this.emailService = emailService
    }

    @Override
    protected void handle(GroovyContext context) {
        context.with {
            byMethod {
                get {
                    render handlebarsTemplate('forgot-password.html',
                            title: 'Forgot Password',
                            action: '/forgot-password',
                            method: 'post',
                            error: request.queryParams.error ?: '',
                            errorMessages: SessionUtil.getFlashMessages(request).collect { [message: it] },
                            pageId: 'forgot-password',
                            loggedIn: false)
                }
                post {
                    Form form = parse(Form)

                    blocking {
                        String recoveryHash = null
                        EmailAccount emailAccount = accountService.findByEmail(form.email)
                        if (emailAccount) {
                            recoveryHash = accountService.startPasswordRecovery(emailAccount)
                        }
                        recoveryHash
                    } onError { Throwable t ->
                        log.error(LogUtil.toLog('ForgotPasswordFailure', [
                                exception: t.toString()
                        ]), t)

                        redirect(500, '/forgot-password?error=' + Messages.UNEXPECTED_SERVER_ERROR)
                    } then { String recoveryHash ->
                        if (recoveryHash) {
                            // TODO: We should definitely do HTML emails as well.
                            emailService.sendEmail(form.email, 'CellarHQ: Password recovery', """\
                                | Hey there!
                                |
                                | Forgot your password, huh? Don't worry, we'll help you change it: Follow the link
                                | below to change it. It will only be valid for 24 hours, so make it quick!
                                |
                                | http://www.cellarhq.com/forgot-password/${recoveryHash}
                                |
                                | Cheers!
                                | Kyle and Rob
                            """.stripMargin())
                            redirect('/?success=' + Messages.FORGOT_PASSWORD_EMAIL_SENT_NOTICE)
                        } else {
                            redirect('/forgot-password?error=' + Messages.FORGOT_PASSWORD_ERROR)
                        }
                    }
                }
            }
        }
    }
}
