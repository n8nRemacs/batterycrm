package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.databind.util.C36500f;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class JsonParser implements Closeable, r {

    /* renamed from: c, reason: collision with root package name */
    public static final com.fasterxml.jackson.core.util.i<StreamReadCapability> f341054c = com.fasterxml.jackson.core.util.i.a(StreamReadCapability.values());

    /* renamed from: b, reason: collision with root package name */
    public int f341055b;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);


        /* renamed from: b, reason: collision with root package name */
        public final boolean f341072b;

        /* renamed from: c, reason: collision with root package name */
        public final int f341073c = 1 << ordinal();

        Feature(boolean z12) {
            this.f341072b = z12;
        }

        public final boolean a(int i12) {
            return (i12 & this.f341073c) != 0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NumberType {

        /* renamed from: b, reason: collision with root package name */
        public static final NumberType f341074b;

        /* renamed from: c, reason: collision with root package name */
        public static final NumberType f341075c;

        /* renamed from: d, reason: collision with root package name */
        public static final NumberType f341076d;

        /* renamed from: e, reason: collision with root package name */
        public static final NumberType f341077e;

        /* renamed from: f, reason: collision with root package name */
        public static final NumberType f341078f;

        /* renamed from: g, reason: collision with root package name */
        public static final NumberType f341079g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ NumberType[] f341080h;

        static {
            NumberType numberType = new NumberType("INT", 0);
            f341074b = numberType;
            NumberType numberType2 = new NumberType("LONG", 1);
            f341075c = numberType2;
            NumberType numberType3 = new NumberType("BIG_INTEGER", 2);
            f341076d = numberType3;
            NumberType numberType4 = new NumberType("FLOAT", 3);
            f341077e = numberType4;
            NumberType numberType5 = new NumberType("DOUBLE", 4);
            f341078f = numberType5;
            NumberType numberType6 = new NumberType("BIG_DECIMAL", 5);
            f341079g = numberType6;
            f341080h = new NumberType[]{numberType, numberType2, numberType3, numberType4, numberType5, numberType6};
        }

        public NumberType() {
            throw null;
        }

        public static NumberType valueOf(String str) {
            return (NumberType) Enum.valueOf(NumberType.class, str);
        }

        public static NumberType[] values() {
            return (NumberType[]) f341080h.clone();
        }
    }

    public abstract long A();

    public abstract NumberType B();

    public abstract Number D();

    public Number F() {
        return D();
    }

    public Object G() {
        return null;
    }

    public abstract g H();

    public com.fasterxml.jackson.core.util.i<StreamReadCapability> I() {
        return f341054c;
    }

    public short J() throws InputCoercionException {
        int iZ2 = z();
        if (iZ2 >= -32768 && iZ2 <= 32767) {
            return (short) iZ2;
        }
        String strK = AK.c.k("Numeric value (", L(), ") out of range of Java short");
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        throw new InputCoercionException(this, strK);
    }

    public abstract String L();

    public abstract char[] M();

    public abstract int N();

    public abstract int O();

    public abstract e P();

    public Object Q() {
        return null;
    }

    public int R() {
        return S();
    }

    public int S() {
        return 0;
    }

    public long T() {
        return U();
    }

    public long U() {
        return 0L;
    }

    public String V() {
        return W();
    }

    public abstract String W();

    public abstract boolean X();

    public abstract boolean Y(JsonToken jsonToken);

    public abstract boolean Z();

    public boolean a() {
        return false;
    }

    public boolean a0() {
        return f() == JsonToken.VALUE_NUMBER_INT;
    }

    public boolean b() {
        return false;
    }

    public boolean b0() {
        return f() == JsonToken.START_ARRAY;
    }

    public abstract void c();

    public boolean c0() {
        return f() == JsonToken.START_OBJECT;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public String d() {
        return n();
    }

    public boolean d0() {
        return false;
    }

    public String e0() {
        if (g0() == JsonToken.FIELD_NAME) {
            return n();
        }
        return null;
    }

    public JsonToken f() {
        return o();
    }

    public String f0() {
        if (g0() == JsonToken.VALUE_STRING) {
            return L();
        }
        return null;
    }

    public int g() {
        return p();
    }

    public abstract JsonToken g0();

    public abstract BigInteger h();

    public abstract JsonToken h0();

    public abstract byte[] i(Base64Variant base64Variant);

    public int i0(Base64Variant base64Variant, C36500f c36500f) {
        throw new UnsupportedOperationException("Operation not supported by parser of type ".concat(getClass().getName()));
    }

    public byte j() throws InputCoercionException {
        int iZ2 = z();
        if (iZ2 >= -128 && iZ2 <= 255) {
            return (byte) iZ2;
        }
        String strK = AK.c.k("Numeric value (", L(), ") out of range of Java byte");
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        throw new InputCoercionException(this, strK);
    }

    public boolean j0() {
        return false;
    }

    public abstract j k();

    public void k0(Object obj) {
        g gVarH = H();
        if (gVarH != null) {
            gVarH.g(obj);
        }
    }

    public abstract JsonParser l0();

    public abstract e m();

    public abstract String n();

    public abstract JsonToken o();

    @Deprecated
    public abstract int p();

    public abstract BigDecimal q();

    public abstract double u();

    public Object x() {
        return null;
    }

    public abstract float y();

    public abstract int z();
}
