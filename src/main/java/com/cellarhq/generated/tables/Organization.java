/**
 * This class is generated by jOOQ
 */
package com.cellarhq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Organization extends org.jooq.impl.TableImpl<com.cellarhq.generated.tables.records.OrganizationRecord> {

	private static final long serialVersionUID = 1327264505;

	/**
	 * The singleton instance of <code>public.organization</code>
	 */
	public static final com.cellarhq.generated.tables.Organization ORGANIZATION = new com.cellarhq.generated.tables.Organization();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.cellarhq.generated.tables.records.OrganizationRecord> getRecordType() {
		return com.cellarhq.generated.tables.records.OrganizationRecord.class;
	}

	/**
	 * The column <code>public.organization.id</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.organization.version</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.organization.photo_id</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.Long> PHOTO_ID = createField("photo_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.organization.type</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false), this, "");

	/**
	 * The column <code>public.organization.slug</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> SLUG = createField("slug", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>public.organization.name</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>public.organization.description</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.organization.established</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.sql.Date> ESTABLISHED = createField("established", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>public.organization.phone</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>public.organization.website</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> WEBSITE = createField("website", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.organization.address</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.organization.address2</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> ADDRESS2 = createField("address2", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.organization.locality</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> LOCALITY = createField("locality", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.organization.postal_code</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> POSTAL_CODE = createField("postal_code", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>public.organization.country</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.organization.searchable</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.Boolean> SEARCHABLE = createField("searchable", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.organization.brewery_db_id</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.String> BREWERY_DB_ID = createField("brewery_db_id", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>public.organization.brewery_db_last_updated</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.sql.Timestamp> BREWERY_DB_LAST_UPDATED = createField("brewery_db_last_updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.organization.locked</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.Boolean> LOCKED = createField("locked", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>public.organization.needs_moderation</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.Boolean> NEEDS_MODERATION = createField("needs_moderation", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.organization.created_date</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.sql.Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.organization.modified_date</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.OrganizationRecord, java.sql.Timestamp> MODIFIED_DATE = createField("modified_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>public.organization</code> table reference
	 */
	public Organization() {
		this("organization", null);
	}

	/**
	 * Create an aliased <code>public.organization</code> table reference
	 */
	public Organization(java.lang.String alias) {
		this(alias, com.cellarhq.generated.tables.Organization.ORGANIZATION);
	}

	private Organization(java.lang.String alias, org.jooq.Table<com.cellarhq.generated.tables.records.OrganizationRecord> aliased) {
		this(alias, aliased, null);
	}

	private Organization(java.lang.String alias, org.jooq.Table<com.cellarhq.generated.tables.records.OrganizationRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.cellarhq.generated.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.cellarhq.generated.tables.records.OrganizationRecord, java.lang.Long> getIdentity() {
		return com.cellarhq.generated.Keys.IDENTITY_ORGANIZATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.cellarhq.generated.tables.records.OrganizationRecord> getPrimaryKey() {
		return com.cellarhq.generated.Keys.PK_ORGANIZATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.cellarhq.generated.tables.records.OrganizationRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.cellarhq.generated.tables.records.OrganizationRecord>>asList(com.cellarhq.generated.Keys.PK_ORGANIZATION, com.cellarhq.generated.Keys.UNQ_ORGANIZATION_SLUG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.cellarhq.generated.tables.records.OrganizationRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.cellarhq.generated.tables.records.OrganizationRecord, ?>>asList(com.cellarhq.generated.Keys.ORGANIZATION__FK_ORGANIZATION_PHOTO_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.cellarhq.generated.tables.Organization as(java.lang.String alias) {
		return new com.cellarhq.generated.tables.Organization(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.cellarhq.generated.tables.Organization rename(java.lang.String name) {
		return new com.cellarhq.generated.tables.Organization(name, null);
	}
}
