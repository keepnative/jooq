package org.jooq.util.sqlserver;

import org.jooq.DataType;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.UUID;

public class SqlServerDataType {

    public static final DataType<Byte> TINYINT = new DefaultDataType<Byte>(SQLDialect.SQL_SERVER, SQLDataType.TINYINT, "tinyint", "signed");
    public static final DataType<UByte> TINYINTUNSIGNED = new DefaultDataType<UByte>(SQLDialect.SQL_SERVER, SQLDataType.TINYINTUNSIGNED, "tinyint unsigned", "unsigned");
    public static final DataType<Short> SMALLINT = new DefaultDataType<Short>(SQLDialect.SQL_SERVER, SQLDataType.SMALLINT, "smallint", "signed");
    public static final DataType<UShort> SMALLINTUNSIGNED = new DefaultDataType<UShort>(SQLDialect.SQL_SERVER, SQLDataType.SMALLINTUNSIGNED, "smallint unsigned", "unsigned");
    public static final DataType<Integer> INT = new DefaultDataType<Integer>(SQLDialect.SQL_SERVER, SQLDataType.INTEGER, "int", "signed");
    public static final DataType<UInteger> INTUNSIGNED = new DefaultDataType<UInteger>(SQLDialect.SQL_SERVER, SQLDataType.INTEGERUNSIGNED, "int unsigned", "unsigned");
    public static final DataType<Integer> MEDIUMINT = new DefaultDataType<Integer>(SQLDialect.SQL_SERVER, SQLDataType.INTEGER, "mediumint", "signed");
    public static final DataType<UInteger> MEDIUMINTUNSIGNED = new DefaultDataType<UInteger>(SQLDialect.SQL_SERVER, SQLDataType.INTEGERUNSIGNED, "mediumint unsigned", "unsigned");
    public static final DataType<Integer> INTEGER = new DefaultDataType<Integer>(SQLDialect.SQL_SERVER, SQLDataType.INTEGER, "int", "signed");
    public static final DataType<UInteger> INTEGERUNSIGNED = new DefaultDataType<UInteger>(SQLDialect.SQL_SERVER, SQLDataType.INTEGERUNSIGNED, "integer unsigned", "unsigned");
    public static final DataType<Long> BIGINT = new DefaultDataType<Long>(SQLDialect.SQL_SERVER, SQLDataType.BIGINT, "bigint", "signed");
    public static final DataType<ULong> BIGINTUNSIGNED = new DefaultDataType<ULong>(SQLDialect.SQL_SERVER, SQLDataType.BIGINTUNSIGNED, "bigint unsigned", "unsigned");
    public static final DataType<Double> DOUBLE = new DefaultDataType<Double>(SQLDialect.SQL_SERVER, SQLDataType.DOUBLE, "double", "decimal");
    public static final DataType<Double> FLOAT = new DefaultDataType<Double>(SQLDialect.SQL_SERVER, SQLDataType.FLOAT, "float", "decimal");
    public static final DataType<Float> REAL = new DefaultDataType<Float>(SQLDialect.SQL_SERVER, SQLDataType.REAL, "real", "decimal");
    public static final DataType<Boolean> BOOLEAN = new DefaultDataType<Boolean>(SQLDialect.SQL_SERVER, SQLDataType.BOOLEAN, "bit", "unsigned");
    public static final DataType<Boolean> BOOL = new DefaultDataType<Boolean>(SQLDialect.SQL_SERVER, SQLDataType.BOOLEAN, "bit", "unsigned");
    public static final DataType<Boolean> BIT = new DefaultDataType<Boolean>(SQLDialect.SQL_SERVER, SQLDataType.BIT, "bit", "unsigned");
    public static final DataType<BigDecimal> DECIMAL = new DefaultDataType<BigDecimal>(SQLDialect.SQL_SERVER, SQLDataType.DECIMAL, "numeric", "decimal");
    public static final DataType<BigDecimal> DEC = new DefaultDataType<BigDecimal>(SQLDialect.SQL_SERVER, SQLDataType.DECIMAL, "dec", "decimal");
    public static final DataType<String> VARCHAR = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.VARCHAR, "varchar", "char");
    public static final DataType<String> CHAR = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.CHAR, "char", "char");
    public static final DataType<byte[]> BLOB = new DefaultDataType<byte[]>(SQLDialect.SQL_SERVER, SQLDataType.BLOB, "blob", "binary");
    public static final DataType<byte[]> BINARY = new DefaultDataType<byte[]>(SQLDialect.SQL_SERVER, SQLDataType.BINARY, "binary", "binary");
    public static final DataType<byte[]> VARBINARY = new DefaultDataType<byte[]>(SQLDialect.SQL_SERVER, SQLDataType.VARBINARY, "varbinary", "binary");
    public static final DataType<Date> DATE = new DefaultDataType<Date>(SQLDialect.SQL_SERVER, SQLDataType.DATE, "date", "date");
    public static final DataType<Time> TIME = new DefaultDataType<Time>(SQLDialect.SQL_SERVER, SQLDataType.TIME, "time", "time");
    public static final DataType<Timestamp> TIMESTAMP = new DefaultDataType<Timestamp>(SQLDialect.SQL_SERVER, SQLDataType.TIMESTAMP, "datetime2", "datetime");
    public static final DataType<Timestamp> DATETIME = new DefaultDataType<Timestamp>(SQLDialect.SQL_SERVER, SQLDataType.TIMESTAMP, "datetime2", "datetime");

    protected static final DataType<String> __NCHAR = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.NCHAR, "char", "char");
    protected static final DataType<String> __NCLOB = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.NCLOB, "clob", "char");
    protected static final DataType<String> __LONGNVARCHAR = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.LONGNVARCHAR, "varchar", "char");
    protected static final DataType<BigDecimal> __NUMERIC = new DefaultDataType<BigDecimal>(SQLDialect.SQL_SERVER, SQLDataType.NUMERIC, "decimal", "decimal");
    protected static final DataType<String> __NVARCHAR = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.NVARCHAR, "varchar", "char");
    protected static final DataType<String> __LONGVARCHAR = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.LONGVARCHAR, "varchar", "char");
    protected static final DataType<byte[]> __LONGVARBINARY = new DefaultDataType<byte[]>(SQLDialect.SQL_SERVER, SQLDataType.LONGVARBINARY, "varbinary", "binary");

    protected static final DataType<BigInteger> __BIGINTEGER = new DefaultDataType<BigInteger>(SQLDialect.SQL_SERVER, SQLDataType.DECIMAL_INTEGER, "decimal", "decimal");
    protected static final DataType<UUID> __UUID = new DefaultDataType<UUID>(SQLDialect.SQL_SERVER, SQLDataType.UUID, "varchar", "char");

    public static final DataType<String> TINYTEXT = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.CLOB, "tinytext", "char");
    public static final DataType<String> MEDIUMTEXT = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.CLOB, "mediumtext", "char");
    public static final DataType<String> TEXT = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.CLOB, "text", "char");
    public static final DataType<String> LONGTEXT = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.CLOB, "varchar(MAX)", "char");
    public static final DataType<String> ENUM = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.VARCHAR, "enum", "char");
    public static final DataType<String> SET = new DefaultDataType<String>(SQLDialect.SQL_SERVER, SQLDataType.VARCHAR, "set", "char");
    public static final DataType<byte[]> TINYBLOB = new DefaultDataType<byte[]>(SQLDialect.SQL_SERVER, SQLDataType.BLOB, "tinyblob", "binary");
    public static final DataType<byte[]> MEDIUMBLOB = new DefaultDataType<byte[]>(SQLDialect.SQL_SERVER, SQLDataType.BLOB, "mediumblob", "binary");
    public static final DataType<byte[]> LONGBLOB = new DefaultDataType<byte[]>(SQLDialect.SQL_SERVER, SQLDataType.BLOB, "varbinary(MAX)", "binary");
    public static final DataType<Date> YEAR = new DefaultDataType<Date>(SQLDialect.SQL_SERVER, SQLDataType.DATE, "year", "date");

}
