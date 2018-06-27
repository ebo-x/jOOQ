/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema;


import javax.annotation.Generated;

import org.jooq.util.h2.information_schema.tables.Columns;
import org.jooq.util.h2.information_schema.tables.Constraints;
import org.jooq.util.h2.information_schema.tables.CrossReferences;
import org.jooq.util.h2.information_schema.tables.FunctionAliases;
import org.jooq.util.h2.information_schema.tables.FunctionColumns;
import org.jooq.util.h2.information_schema.tables.Indexes;
import org.jooq.util.h2.information_schema.tables.Schemata;
import org.jooq.util.h2.information_schema.tables.Sequences;
import org.jooq.util.h2.information_schema.tables.TypeInfo;


/**
 * Convenience access to all tables in INFORMATION_SCHEMA
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table INFORMATION_SCHEMA.FUNCTION_COLUMNS
	 */
	public static final FunctionColumns FUNCTION_COLUMNS = org.jooq.util.h2.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS;

	/**
	 * The table INFORMATION_SCHEMA.CONSTRAINTS
	 */
	public static final Constraints CONSTRAINTS = org.jooq.util.h2.information_schema.tables.Constraints.CONSTRAINTS;

	/**
	 * The table INFORMATION_SCHEMA.CROSS_REFERENCES
	 */
	public static final CrossReferences CROSS_REFERENCES = org.jooq.util.h2.information_schema.tables.CrossReferences.CROSS_REFERENCES;

	/**
	 * The table INFORMATION_SCHEMA.SCHEMATA
	 */
	public static final Schemata SCHEMATA = org.jooq.util.h2.information_schema.tables.Schemata.SCHEMATA;

	/**
	 * The table INFORMATION_SCHEMA.FUNCTION_ALIASES
	 */
	public static final FunctionAliases FUNCTION_ALIASES = org.jooq.util.h2.information_schema.tables.FunctionAliases.FUNCTION_ALIASES;

	/**
	 * The table INFORMATION_SCHEMA.SEQUENCES
	 */
	public static final Sequences SEQUENCES = org.jooq.util.h2.information_schema.tables.Sequences.SEQUENCES;

	/**
	 * The table INFORMATION_SCHEMA.TYPE_INFO
	 */
	public static final TypeInfo TYPE_INFO = org.jooq.util.h2.information_schema.tables.TypeInfo.TYPE_INFO;

	/**
	 * The table INFORMATION_SCHEMA.INDEXES
	 */
	public static final Indexes INDEXES = org.jooq.util.h2.information_schema.tables.Indexes.INDEXES;

	/**
	 * The table INFORMATION_SCHEMA.COLUMNS
	 */
	public static final Columns COLUMNS = org.jooq.util.h2.information_schema.tables.Columns.COLUMNS;

	/**
	 * The table INFORMATION_SCHEMA.TABLES
	 */
	public static final org.jooq.util.h2.information_schema.tables.Tables TABLES = org.jooq.util.h2.information_schema.tables.Tables.TABLES;
}