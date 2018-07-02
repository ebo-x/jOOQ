/*
 * This file is generated by jOOQ.
*/
package org.jooq.meta.mysql.information_schema;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.meta.mysql.information_schema.tables.Columns;
import org.jooq.meta.mysql.information_schema.tables.KeyColumnUsage;
import org.jooq.meta.mysql.information_schema.tables.Parameters;
import org.jooq.meta.mysql.information_schema.tables.ReferentialConstraints;
import org.jooq.meta.mysql.information_schema.tables.Routines;
import org.jooq.meta.mysql.information_schema.tables.Schemata;
import org.jooq.meta.mysql.information_schema.tables.Statistics;
import org.jooq.meta.mysql.information_schema.tables.TableConstraints;
import org.jooq.meta.mysql.information_schema.tables.Tables;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends SchemaImpl {

    private static final long serialVersionUID = 621475927;

    /**
     * The reference instance of <code>information_schema</code>
     */
    public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

    /**
     * The table <code>information_schema.COLUMNS</code>.
     */
    public final Columns COLUMNS = org.jooq.meta.mysql.information_schema.tables.Columns.COLUMNS;

    /**
     * The table <code>information_schema.KEY_COLUMN_USAGE</code>.
     */
    public final KeyColumnUsage KEY_COLUMN_USAGE = org.jooq.meta.mysql.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.PARAMETERS</code>.
     */
    public final Parameters PARAMETERS = org.jooq.meta.mysql.information_schema.tables.Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.REFERENTIAL_CONSTRAINTS</code>.
     */
    public final ReferentialConstraints REFERENTIAL_CONSTRAINTS = org.jooq.meta.mysql.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.ROUTINES</code>.
     */
    public final Routines ROUTINES = org.jooq.meta.mysql.information_schema.tables.Routines.ROUTINES;

    /**
     * The table <code>information_schema.SCHEMATA</code>.
     */
    public final Schemata SCHEMATA = org.jooq.meta.mysql.information_schema.tables.Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.STATISTICS</code>.
     */
    public final Statistics STATISTICS = org.jooq.meta.mysql.information_schema.tables.Statistics.STATISTICS;

    /**
     * The table <code>information_schema.TABLES</code>.
     */
    public final Tables TABLES = org.jooq.meta.mysql.information_schema.tables.Tables.TABLES;

    /**
     * The table <code>information_schema.TABLE_CONSTRAINTS</code>.
     */
    public final TableConstraints TABLE_CONSTRAINTS = org.jooq.meta.mysql.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;

    /**
     * No further instances allowed
     */
    private InformationSchema() {
        super("information_schema", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Columns.COLUMNS,
            KeyColumnUsage.KEY_COLUMN_USAGE,
            Parameters.PARAMETERS,
            ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
            Routines.ROUTINES,
            Schemata.SCHEMATA,
            Statistics.STATISTICS,
            Tables.TABLES,
            TableConstraints.TABLE_CONSTRAINTS);
    }
}