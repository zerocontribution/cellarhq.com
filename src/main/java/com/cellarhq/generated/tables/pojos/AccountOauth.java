/**
 * This class is generated by jOOQ
 */
package com.cellarhq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "account_oauth", schema = "public", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"client", "username"})
})
public class AccountOauth implements java.io.Serializable {

	private static final long serialVersionUID = 515390888;

	private java.lang.Long     id;
	private java.lang.Integer  version;
	private java.lang.Long     cellarId;
	private java.lang.String   client;
	private java.lang.String   username;
	private java.sql.Timestamp createdDate;
	private java.sql.Timestamp modifiedDate;

	public AccountOauth() {}

	public AccountOauth(
		java.lang.Long     id,
		java.lang.Integer  version,
		java.lang.Long     cellarId,
		java.lang.String   client,
		java.lang.String   username,
		java.sql.Timestamp createdDate,
		java.sql.Timestamp modifiedDate
	) {
		this.id = id;
		this.version = version;
		this.cellarId = cellarId;
		this.client = client;
		this.username = username;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 64)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "version", nullable = false, precision = 32)
	public java.lang.Integer getVersion() {
		return this.version;
	}

	public void setVersion(java.lang.Integer version) {
		this.version = version;
	}

	@javax.persistence.Column(name = "cellar_id", nullable = false, precision = 64)
	public java.lang.Long getCellarId() {
		return this.cellarId;
	}

	public void setCellarId(java.lang.Long cellarId) {
		this.cellarId = cellarId;
	}

	@javax.persistence.Column(name = "client", nullable = false, length = 20)
	public java.lang.String getClient() {
		return this.client;
	}

	public void setClient(java.lang.String client) {
		this.client = client;
	}

	@javax.persistence.Column(name = "username", nullable = false, length = 100)
	public java.lang.String getUsername() {
		return this.username;
	}

	public void setUsername(java.lang.String username) {
		this.username = username;
	}

	@javax.persistence.Column(name = "created_date", nullable = false)
	public java.sql.Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(java.sql.Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	@javax.persistence.Column(name = "modified_date", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
