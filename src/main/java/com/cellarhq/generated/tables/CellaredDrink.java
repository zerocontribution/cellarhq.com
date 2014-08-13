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
public class CellaredDrink extends org.jooq.impl.TableImpl<com.cellarhq.generated.tables.records.CellaredDrinkRecord> {

	private static final long serialVersionUID = 888200317;

	/**
	 * The singleton instance of <code>public.cellared_drink</code>
	 */
	public static final com.cellarhq.generated.tables.CellaredDrink CELLARED_DRINK = new com.cellarhq.generated.tables.CellaredDrink();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.cellarhq.generated.tables.records.CellaredDrinkRecord> getRecordType() {
		return com.cellarhq.generated.tables.records.CellaredDrinkRecord.class;
	}

	/**
	 * The column <code>public.cellared_drink.id</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.cellared_drink.version</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.lang.Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.cellared_drink.cellar_id</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.lang.Long> CELLAR_ID = createField("cellar_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.cellared_drink.drink_id</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.lang.Long> DRINK_ID = createField("drink_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.cellared_drink.style_id</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.lang.Long> STYLE_ID = createField("style_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.cellared_drink.bottle_date</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.sql.Date> BOTTLE_DATE = createField("bottle_date", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>public.cellared_drink.size</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.lang.String> SIZE = createField("size", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>public.cellared_drink.quantity</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.lang.Integer> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.cellared_drink.notes</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.lang.String> NOTES = createField("notes", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.cellared_drink.drink_by_date</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.sql.Date> DRINK_BY_DATE = createField("drink_by_date", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>public.cellared_drink.private</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.lang.Boolean> PRIVATE = createField("private", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.cellared_drink.created_date</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.sql.Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.cellared_drink.modified_date</code>.
	 */
	public final org.jooq.TableField<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.sql.Timestamp> MODIFIED_DATE = createField("modified_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>public.cellared_drink</code> table reference
	 */
	public CellaredDrink() {
		this("cellared_drink", null);
	}

	/**
	 * Create an aliased <code>public.cellared_drink</code> table reference
	 */
	public CellaredDrink(java.lang.String alias) {
		this(alias, com.cellarhq.generated.tables.CellaredDrink.CELLARED_DRINK);
	}

	private CellaredDrink(java.lang.String alias, org.jooq.Table<com.cellarhq.generated.tables.records.CellaredDrinkRecord> aliased) {
		this(alias, aliased, null);
	}

	private CellaredDrink(java.lang.String alias, org.jooq.Table<com.cellarhq.generated.tables.records.CellaredDrinkRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.cellarhq.generated.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.cellarhq.generated.tables.records.CellaredDrinkRecord, java.lang.Long> getIdentity() {
		return com.cellarhq.generated.Keys.IDENTITY_CELLARED_DRINK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.cellarhq.generated.tables.records.CellaredDrinkRecord> getPrimaryKey() {
		return com.cellarhq.generated.Keys.PK_CELLARED_DRINK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.cellarhq.generated.tables.records.CellaredDrinkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.cellarhq.generated.tables.records.CellaredDrinkRecord>>asList(com.cellarhq.generated.Keys.PK_CELLARED_DRINK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.cellarhq.generated.tables.records.CellaredDrinkRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.cellarhq.generated.tables.records.CellaredDrinkRecord, ?>>asList(com.cellarhq.generated.Keys.CELLARED_DRINK__FK_CELLARED_DRINK_CELLAR_ID, com.cellarhq.generated.Keys.CELLARED_DRINK__FK_CELLARED_DRINK_DRINK_ID, com.cellarhq.generated.Keys.CELLARED_DRINK__FK_CELLARED_DRINK_STYLE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.cellarhq.generated.tables.CellaredDrink as(java.lang.String alias) {
		return new com.cellarhq.generated.tables.CellaredDrink(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.cellarhq.generated.tables.CellaredDrink rename(java.lang.String name) {
		return new com.cellarhq.generated.tables.CellaredDrink(name, null);
	}
}
