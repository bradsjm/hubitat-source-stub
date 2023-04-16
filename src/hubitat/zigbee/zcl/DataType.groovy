package hubitat.zigbee.zcl;

abstract class DataType {
    static final int NO_DATA = 0x00
    static final int DATA8 = 0x08
    static final int DATA16 = 0x09
    static final int DATA24 = 0x0a
    static final int DATA32 = 0x0b
    static final int DATA40 = 0x0c
    static final int DATA48 = 0x0d
    static final int DATA56 = 0x0e
    static final int DATA64 = 0x0f
    static final int BOOLEAN = 0x10
    static final int BITMAP8 = 0x18
    static final int BITMAP16 = 0x19
    static final int BITMAP24 = 0x1a
    static final int BITMAP32 = 0x1b
    static final int BITMAP40 = 0x1c
    static final int BITMAP48 = 0x1d
    static final int BITMAP56 = 0x1e
    static final int BITMAP64 = 0x1f
    static final int UINT8 = 0x20
    static final int UINT16 = 0x21
    static final int UINT24 = 0x22
    static final int UINT32 = 0x23
    static final int UINT40 = 0x24
    static final int UINT48 = 0x25
    static final int UINT56 = 0x26
    static final int UINT64 = 0x27
    static final int INT8 = 0x28
    static final int INT16 = 0x29
    static final int INT24 = 0x2a
    static final int INT32 = 0x2b
    static final int INT40 = 0x2c
    static final int INT48 = 0x2d
    static final int INT56 = 0x2e
    static final int INT64 = 0x2f
    static final int ENUM8 = 0x30
    static final int ENUM16 = 0x31
    static final int FLOAT2 = 0x38
    static final int FLOAT4 = 0x39
    static final int FLOAT8 = 0x3a
    static final int STRING_OCTET = 0x41
    static final int STRING_CHAR = 0x42
    static final int STRING_LONG_OCTET = 0x43
    static final int STRING_LONG_CHAR = 0x44
    static final int ARRAY = 0x48
    static final int STRUCTURE = 0x4c
    static final int SET = 0x50
    static final int BAG = 0x51
    static final int TIME_OF_DAY = 0xe0
    static final int DATE = 0xe1
    static final int UTCTIME = 0xe2
    static final int CLUSTER_ID = 0xe8
    static final int ATTRIBUTE_ID = 0xe9
    static final int BACNET_OID = 0xea
    static final int IEEE_ADDRESS = 0xf0
    static final int SECKEY128 = 0xf1
    static final int UNKNOWN = 0xff

    abstract int getLength(int dataType)

    abstract boolean isVariableLength(int dataType)

    abstract boolean isDiscreet(int dataType)

    abstract String pack(data, int type, boolean littleEndian = false)
}
