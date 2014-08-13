/**
 * This class is generated by jOOQ
 */
package com.cellarhq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StyleRecord extends org.jooq.impl.UpdatableRecordImpl<com.cellarhq.generated.tables.records.StyleRecord> implements org.jooq.Record10<java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = -1278510931;

	/**
	 * Setter for <code>public.style.id</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.style.id</code>.
	 */
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.style.version</code>.
	 */
	public void setVersion(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.style.version</code>.
	 */
	public java.lang.Integer getVersion() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.style.category_id</code>.
	 */
	public void setCategoryId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.style.category_id</code>.
	 */
	public java.lang.Long getCategoryId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>public.style.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.style.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.style.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.style.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.style.searchable</code>.
	 */
	public void setSearchable(java.lang.Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.style.searchable</code>.
	 */
	public java.lang.Boolean getSearchable() {
		return (java.lang.Boolean) getValue(5);
	}

	/**
	 * Setter for <code>public.style.brewery_db_id</code>.
	 */
	public void setBreweryDbId(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.style.brewery_db_id</code>.
	 */
	public java.lang.String getBreweryDbId() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>public.style.brewery_db_last_updated</code>.
	 */
	public void setBreweryDbLastUpdated(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.style.brewery_db_last_updated</code>.
	 */
	public java.sql.Timestamp getBreweryDbLastUpdated() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>public.style.created_date</code>.
	 */
	public void setCreatedDate(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.style.created_date</code>.
	 */
	public java.sql.Timestamp getCreatedDate() {
		return (java.sql.Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>public.style.modified_date</code>.
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.style.modified_date</code>.
	 */
	public java.sql.Timestamp getModifiedDate() {
		return (java.sql.Timestamp) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.cellarhq.generated.tables.Style.STYLE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.cellarhq.generated.tables.Style.STYLE.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return com.cellarhq.generated.tables.Style.STYLE.CATEGORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.cellarhq.generated.tables.Style.STYLE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.cellarhq.generated.tables.Style.STYLE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field6() {
		return com.cellarhq.generated.tables.Style.STYLE.SEARCHABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.cellarhq.generated.tables.Style.STYLE.BREWERY_DB_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return com.cellarhq.generated.tables.Style.STYLE.BREWERY_DB_LAST_UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return com.cellarhq.generated.tables.Style.STYLE.CREATED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return com.cellarhq.generated.tables.Style.STYLE.MODIFIED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value6() {
		return getSearchable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getBreweryDbId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getBreweryDbLastUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getCreatedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getModifiedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord value2(java.lang.Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord value3(java.lang.Long value) {
		setCategoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord value4(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord value5(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord value6(java.lang.Boolean value) {
		setSearchable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord value7(java.lang.String value) {
		setBreweryDbId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord value8(java.sql.Timestamp value) {
		setBreweryDbLastUpdated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord value9(java.sql.Timestamp value) {
		setCreatedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord value10(java.sql.Timestamp value) {
		setModifiedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRecord values(java.lang.Long value1, java.lang.Integer value2, java.lang.Long value3, java.lang.String value4, java.lang.String value5, java.lang.Boolean value6, java.lang.String value7, java.sql.Timestamp value8, java.sql.Timestamp value9, java.sql.Timestamp value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StyleRecord
	 */
	public StyleRecord() {
		super(com.cellarhq.generated.tables.Style.STYLE);
	}

	/**
	 * Create a detached, initialised StyleRecord
	 */
	public StyleRecord(java.lang.Long id, java.lang.Integer version, java.lang.Long categoryId, java.lang.String name, java.lang.String description, java.lang.Boolean searchable, java.lang.String breweryDbId, java.sql.Timestamp breweryDbLastUpdated, java.sql.Timestamp createdDate, java.sql.Timestamp modifiedDate) {
		super(com.cellarhq.generated.tables.Style.STYLE);

		setValue(0, id);
		setValue(1, version);
		setValue(2, categoryId);
		setValue(3, name);
		setValue(4, description);
		setValue(5, searchable);
		setValue(6, breweryDbId);
		setValue(7, breweryDbLastUpdated);
		setValue(8, createdDate);
		setValue(9, modifiedDate);
	}
}
