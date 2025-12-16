package defpackage;

import org.msgpack.core.MessageFormatException;

/* loaded from: classes2.dex */
public enum qj9 {
    POSFIXINT(3),
    FIXMAP(8),
    FIXARRAY(7),
    FIXSTR(5),
    NIL(1),
    NEVER_USED(0),
    BOOLEAN(2),
    BIN8(6),
    BIN16(6),
    BIN32(6),
    EXT8(9),
    EXT16(9),
    EXT32(9),
    FLOAT32(4),
    FLOAT64(4),
    UINT8(3),
    UINT16(3),
    UINT32(3),
    UINT64(3),
    INT8(3),
    INT16(3),
    INT32(3),
    INT64(3),
    FIXEXT1(9),
    FIXEXT2(9),
    FIXEXT4(9),
    FIXEXT8(9),
    FIXEXT16(9),
    STR8(5),
    STR16(5),
    STR32(5),
    ARRAY16(7),
    ARRAY32(7),
    MAP16(8),
    MAP32(8),
    NEGFIXINT(3);

    public static final qj9[] V0 = new qj9[256];
    public final int a;

    static {
        qj9 qj9Var;
        for (int i = 0; i <= 255; i++) {
            byte b = (byte) i;
            if ((b & (-128)) != 0) {
                int i2 = b & (-32);
                if (i2 == -32) {
                    qj9Var = NEGFIXINT;
                } else if (i2 != -96) {
                    int i3 = b & (-16);
                    if (i3 == -112) {
                        qj9Var = FIXARRAY;
                    } else if (i3 != -128) {
                        switch (b) {
                            case -64:
                                qj9Var = NIL;
                                break;
                            case -63:
                            default:
                                qj9Var = NEVER_USED;
                                break;
                            case -62:
                            case -61:
                                qj9Var = BOOLEAN;
                                break;
                            case -60:
                                qj9Var = BIN8;
                                break;
                            case -59:
                                qj9Var = BIN16;
                                break;
                            case -58:
                                qj9Var = BIN32;
                                break;
                            case -57:
                                qj9Var = EXT8;
                                break;
                            case -56:
                                qj9Var = EXT16;
                                break;
                            case -55:
                                qj9Var = EXT32;
                                break;
                            case -54:
                                qj9Var = FLOAT32;
                                break;
                            case -53:
                                qj9Var = FLOAT64;
                                break;
                            case -52:
                                qj9Var = UINT8;
                                break;
                            case -51:
                                qj9Var = UINT16;
                                break;
                            case -50:
                                qj9Var = UINT32;
                                break;
                            case -49:
                                qj9Var = UINT64;
                                break;
                            case -48:
                                qj9Var = INT8;
                                break;
                            case -47:
                                qj9Var = INT16;
                                break;
                            case -46:
                                qj9Var = INT32;
                                break;
                            case -45:
                                qj9Var = INT64;
                                break;
                            case -44:
                                qj9Var = FIXEXT1;
                                break;
                            case -43:
                                qj9Var = FIXEXT2;
                                break;
                            case -42:
                                qj9Var = FIXEXT4;
                                break;
                            case -41:
                                qj9Var = FIXEXT8;
                                break;
                            case -40:
                                qj9Var = FIXEXT16;
                                break;
                            case -39:
                                qj9Var = STR8;
                                break;
                            case -38:
                                qj9Var = STR16;
                                break;
                            case -37:
                                qj9Var = STR32;
                                break;
                            case -36:
                                qj9Var = ARRAY16;
                                break;
                            case -35:
                                qj9Var = ARRAY32;
                                break;
                            case -34:
                                qj9Var = MAP16;
                                break;
                            case -33:
                                qj9Var = MAP32;
                                break;
                        }
                    } else {
                        qj9Var = FIXMAP;
                    }
                } else {
                    qj9Var = FIXSTR;
                }
            } else {
                qj9Var = POSFIXINT;
            }
            V0[i] = qj9Var;
        }
    }

    qj9(int i) {
        this.a = i;
    }

    public final int a() {
        if (this != NEVER_USED) {
            return this.a;
        }
        throw new MessageFormatException("Cannot convert NEVER_USED to ValueType");
    }
}
