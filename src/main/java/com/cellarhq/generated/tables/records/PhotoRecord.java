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
public class PhotoRecord extends org.jooq.impl.UpdatableRecordImpl<com.cellarhq.generated.tables.records.PhotoRecord> implements org.jooq.Record12<java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.Short, java.lang.String, java.lang.Short, java.lang.Short, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = 797847992;

	/**
	 * Setter for <code>public.photo.id</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.photo.id</code>.
	 */
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.photo.version</code>.
	 */
	public void setVersion(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.photo.version</code>.
	 */
	public java.lang.Integer getVersion() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.photo.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.photo.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.photo.original_url</code>.
	 */
	public void setOriginalUrl(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.photo.original_url</code>.
	 */
	public java.lang.String getOriginalUrl() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.photo.thumb_url</code>.
	 */
	public void setThumbUrl(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.photo.thumb_url</code>.
	 */
	public java.lang.String getThumbUrl() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.photo.thumb_width</code>.
	 */
	public void setThumbWidth(java.lang.Short value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.photo.thumb_width</code>.
	 */
	public java.lang.Short getThumbWidth() {
		return (java.lang.Short) getValue(5);
	}

	/**
	 * Setter for <code>public.photo.thumb_height</code>.
	 */
	public void setThumbHeight(java.lang.Short value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.photo.thumb_height</code>.
	 */
	public java.lang.Short getThumbHeight() {
		return (java.lang.Short) getValue(6);
	}

	/**
	 * Setter for <code>public.photo.large_url</code>.
	 */
	public void setLargeUrl(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.photo.large_url</code>.
	 */
	public java.lang.String getLargeUrl() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>public.photo.large_width</code>.
	 */
	public void setLargeWidth(java.lang.Short value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.photo.large_width</code>.
	 */
	public java.lang.Short getLargeWidth() {
		return (java.lang.Short) getValue(8);
	}

	/**
	 * Setter for <code>public.photo.large_height</code>.
	 */
	public void setLargeHeight(java.lang.Short value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.photo.large_height</code>.
	 */
	public java.lang.Short getLargeHeight() {
		return (java.lang.Short) getValue(9);
	}

	/**
	 * Setter for <code>public.photo.created_date</code>.
	 */
	public void setCreatedDate(java.sql.Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.photo.created_date</code>.
	 */
	public java.sql.Timestamp getCreatedDate() {
		return (java.sql.Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>public.photo.modified_date</code>.
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.photo.modified_date</code>.
	 */
	public java.sql.Timestamp getModifiedDate() {
		return (java.sql.Timestamp) getValue(11);
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
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.Short, java.lang.String, java.lang.Short, java.lang.Short, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.Short, java.lang.String, java.lang.Short, java.lang.Short, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.cellarhq.generated.tables.Photo.PHOTO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.cellarhq.generated.tables.Photo.PHOTO.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.cellarhq.generated.tables.Photo.PHOTO.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.cellarhq.generated.tables.Photo.PHOTO.ORIGINAL_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.cellarhq.generated.tables.Photo.PHOTO.THUMB_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field6() {
		return com.cellarhq.generated.tables.Photo.PHOTO.THUMB_WIDTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field7() {
		return com.cellarhq.generated.tables.Photo.PHOTO.THUMB_HEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.cellarhq.generated.tables.Photo.PHOTO.LARGE_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field9() {
		return com.cellarhq.generated.tables.Photo.PHOTO.LARGE_WIDTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field10() {
		return com.cellarhq.generated.tables.Photo.PHOTO.LARGE_HEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return com.cellarhq.generated.tables.Photo.PHOTO.CREATED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field12() {
		return com.cellarhq.generated.tables.Photo.PHOTO.MODIFIED_DATE;
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
	public java.lang.String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getOriginalUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getThumbUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value6() {
		return getThumbWidth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value7() {
		return getThumbHeight();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getLargeUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value9() {
		return getLargeWidth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value10() {
		return getLargeHeight();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value11() {
		return getCreatedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value12() {
		return getModifiedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value2(java.lang.Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value3(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value4(java.lang.String value) {
		setOriginalUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value5(java.lang.String value) {
		setThumbUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value6(java.lang.Short value) {
		setThumbWidth(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value7(java.lang.Short value) {
		setThumbHeight(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value8(java.lang.String value) {
		setLargeUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value9(java.lang.Short value) {
		setLargeWidth(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value10(java.lang.Short value) {
		setLargeHeight(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value11(java.sql.Timestamp value) {
		setCreatedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord value12(java.sql.Timestamp value) {
		setModifiedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhotoRecord values(java.lang.Long value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Short value6, java.lang.Short value7, java.lang.String value8, java.lang.Short value9, java.lang.Short value10, java.sql.Timestamp value11, java.sql.Timestamp value12) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PhotoRecord
	 */
	public PhotoRecord() {
		super(com.cellarhq.generated.tables.Photo.PHOTO);
	}

	/**
	 * Create a detached, initialised PhotoRecord
	 */
	public PhotoRecord(java.lang.Long id, java.lang.Integer version, java.lang.String description, java.lang.String originalUrl, java.lang.String thumbUrl, java.lang.Short thumbWidth, java.lang.Short thumbHeight, java.lang.String largeUrl, java.lang.Short largeWidth, java.lang.Short largeHeight, java.sql.Timestamp createdDate, java.sql.Timestamp modifiedDate) {
		super(com.cellarhq.generated.tables.Photo.PHOTO);

		setValue(0, id);
		setValue(1, version);
		setValue(2, description);
		setValue(3, originalUrl);
		setValue(4, thumbUrl);
		setValue(5, thumbWidth);
		setValue(6, thumbHeight);
		setValue(7, largeUrl);
		setValue(8, largeWidth);
		setValue(9, largeHeight);
		setValue(10, createdDate);
		setValue(11, modifiedDate);
	}
}
