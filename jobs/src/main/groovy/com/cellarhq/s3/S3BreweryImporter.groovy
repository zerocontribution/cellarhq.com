package com.cellarhq.s3

import com.amazonaws.services.simpledb.model.Item
import com.cellarhq.generated.tables.pojos.Organization
import com.cellarhq.generated.tables.records.OrganizationRecord
import org.jooq.DSLContext
import org.jooq.exception.DataAccessException

import static com.cellarhq.generated.Tables.ORGANIZATION

class S3BreweryImporter {
    String selectAllBeersQuery = 'select * from cellar_PROD_breweries limit 2500'

    S3ItemRetriever s3ItemRetriever = new S3ItemRetriever()
    S3ToOrganizationMapper organizationMapper = new S3ToOrganizationMapper()
    AmazonHelper helper = new AmazonHelper()

    void importBeersFromS3(DSLContext dslContext) {
        s3ItemRetriever.withEachItem(selectAllBeersQuery) { Item item ->
            Organization organization = organizationMapper.mapItemToOrganization(dslContext, item)

            OrganizationRecord organizationRecord = dslContext.newRecord(ORGANIZATION, organization)
            organizationRecord.reset(ORGANIZATION.ID)
            organizationRecord.reset(ORGANIZATION.DATA)

            if (!organizationRecord.createdDate) organizationRecord.reset(ORGANIZATION.CREATED_DATE)
            if (!organizationRecord.modifiedDate) organizationRecord.reset(ORGANIZATION.MODIFIED_DATE)

            try {
                organizationRecord.store()
            } catch (DataAccessException e) {
                println "Error inserting because ${e.message} with ${organizationRecord}"
            }
        }
    }

}
