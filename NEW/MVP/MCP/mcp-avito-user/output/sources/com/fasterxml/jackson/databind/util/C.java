package com.fasterxml.jackson.databind.util;

import androidx.compose.foundation.H;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import lX0.AbstractC43700c;
import oX0.C44705e;

/* compiled from: TokenBuffer.java */
/* loaded from: classes4.dex */
public class C extends JsonGenerator {

    /* renamed from: q, reason: collision with root package name */
    public static final int f342542q = JsonGenerator.Feature.a();

    /* renamed from: c, reason: collision with root package name */
    public com.fasterxml.jackson.core.j f342543c;

    /* renamed from: d, reason: collision with root package name */
    public com.fasterxml.jackson.core.g f342544d;

    /* renamed from: e, reason: collision with root package name */
    public int f342545e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f342546f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f342547g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f342548h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f342549i;

    /* renamed from: j, reason: collision with root package name */
    public c f342550j;

    /* renamed from: k, reason: collision with root package name */
    public c f342551k;

    /* renamed from: l, reason: collision with root package name */
    public int f342552l;

    /* renamed from: m, reason: collision with root package name */
    public Object f342553m;

    /* renamed from: n, reason: collision with root package name */
    public Object f342554n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f342555o;

    /* renamed from: p, reason: collision with root package name */
    public C44705e f342556p;

    /* compiled from: TokenBuffer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342557a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f342558b;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            f342558b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342558b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342558b[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342558b[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342558b[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f342557a = iArr2;
            try {
                iArr2[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f342557a[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f342557a[JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f342557a[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f342557a[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f342557a[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f342557a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f342557a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f342557a[JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f342557a[JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f342557a[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f342557a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: TokenBuffer.java */
    public static final class b extends AbstractC43700c {

        /* renamed from: n, reason: collision with root package name */
        public final com.fasterxml.jackson.core.j f342559n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f342560o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f342561p;

        /* renamed from: q, reason: collision with root package name */
        public c f342562q;

        /* renamed from: r, reason: collision with root package name */
        public int f342563r;

        /* renamed from: s, reason: collision with root package name */
        public D f342564s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f342565t;

        /* renamed from: u, reason: collision with root package name */
        public transient com.fasterxml.jackson.core.util.c f342566u;

        /* renamed from: v, reason: collision with root package name */
        public com.fasterxml.jackson.core.e f342567v;

        public b(c cVar, com.fasterxml.jackson.core.j jVar, boolean z12, boolean z13, com.fasterxml.jackson.core.g gVar) {
            super(0);
            this.f342567v = null;
            this.f342562q = cVar;
            this.f342563r = -1;
            this.f342559n = jVar;
            this.f342564s = gVar == null ? new D() : new D(gVar);
            this.f342560o = z12;
            this.f342561p = z13;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final long A() {
            Number numberD = this.f413872d == JsonToken.VALUE_NUMBER_INT ? (Number) B0() : D();
            if ((numberD instanceof Long) || (numberD instanceof Integer) || (numberD instanceof Short) || (numberD instanceof Byte)) {
                return numberD.longValue();
            }
            if (numberD instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) numberD;
                if (AbstractC43700c.f413866h.compareTo(bigInteger) > 0 || AbstractC43700c.f413867i.compareTo(bigInteger) < 0) {
                    y0();
                    throw null;
                }
            } else {
                if ((numberD instanceof Double) || (numberD instanceof Float)) {
                    double dDoubleValue = numberD.doubleValue();
                    if (dDoubleValue >= -9.223372036854776E18d && dDoubleValue <= 9.223372036854776E18d) {
                        return (long) dDoubleValue;
                    }
                    y0();
                    throw null;
                }
                if (!(numberD instanceof BigDecimal)) {
                    com.fasterxml.jackson.core.util.r.c();
                    throw null;
                }
                BigDecimal bigDecimal = (BigDecimal) numberD;
                if (AbstractC43700c.f413868j.compareTo(bigDecimal) > 0 || AbstractC43700c.f413869k.compareTo(bigDecimal) < 0) {
                    y0();
                    throw null;
                }
            }
            return numberD.longValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final JsonParser.NumberType B() throws JsonParseException {
            Number numberD = D();
            boolean z12 = numberD instanceof Integer;
            JsonParser.NumberType numberType = JsonParser.NumberType.f341074b;
            if (z12) {
                return numberType;
            }
            if (numberD instanceof Long) {
                return JsonParser.NumberType.f341075c;
            }
            if (numberD instanceof Double) {
                return JsonParser.NumberType.f341078f;
            }
            if (numberD instanceof BigDecimal) {
                return JsonParser.NumberType.f341079g;
            }
            if (numberD instanceof BigInteger) {
                return JsonParser.NumberType.f341076d;
            }
            if (numberD instanceof Float) {
                return JsonParser.NumberType.f341077e;
            }
            if (numberD instanceof Short) {
                return numberType;
            }
            return null;
        }

        public final Object B0() {
            c cVar = this.f342562q;
            return cVar.f342571c[this.f342563r];
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Number D() throws JsonParseException {
            JsonToken jsonToken = this.f413872d;
            if (jsonToken == null || !jsonToken.f341102h) {
                throw new JsonParseException(this, "Current token (" + this.f413872d + ") not numeric, cannot use numeric value accessors");
            }
            Object objB0 = B0();
            if (objB0 instanceof Number) {
                return (Number) objB0;
            }
            if (objB0 instanceof String) {
                String str = (String) objB0;
                return str.indexOf(46) >= 0 ? Double.valueOf(Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
            }
            if (objB0 == null) {
                return null;
            }
            throw new IllegalStateException("Internal error: entry should be a Number, but is of type ".concat(objB0.getClass().getName()));
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Object G() {
            return this.f342562q.c(this.f342563r);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final com.fasterxml.jackson.core.g H() {
            return this.f342564s;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final com.fasterxml.jackson.core.util.i<StreamReadCapability> I() {
            return JsonParser.f341054c;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final String L() {
            JsonToken jsonToken = this.f413872d;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object objB0 = B0();
                if (objB0 instanceof String) {
                    return (String) objB0;
                }
                Annotation[] annotationArr = g.f342596a;
                if (objB0 == null) {
                    return null;
                }
                return objB0.toString();
            }
            if (jsonToken == null) {
                return null;
            }
            int iOrdinal = jsonToken.ordinal();
            if (iOrdinal != 8 && iOrdinal != 9) {
                return this.f413872d.f341096b;
            }
            Object objB02 = B0();
            Annotation[] annotationArr2 = g.f342596a;
            if (objB02 == null) {
                return null;
            }
            return objB02.toString();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final char[] M() {
            String strL = L();
            if (strL == null) {
                return null;
            }
            return strL.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final int N() {
            String strL = L();
            if (strL == null) {
                return 0;
            }
            return strL.length();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final int O() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Object Q() {
            c cVar = this.f342562q;
            int i12 = this.f342563r;
            TreeMap<Integer, Object> treeMap = cVar.f342572d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i12 + i12));
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final boolean X() {
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final boolean a() {
            return this.f342561p;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final boolean b() {
            return this.f342560o;
        }

        @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f342565t) {
                return;
            }
            this.f342565t = true;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final String d() {
            JsonToken jsonToken = this.f413872d;
            return (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) ? this.f342564s.f342573c.a() : this.f342564s.f342575e;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final boolean d0() {
            if (this.f413872d != JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object objB0 = B0();
            if (objB0 instanceof Double) {
                Double d12 = (Double) objB0;
                return d12.isNaN() || d12.isInfinite();
            }
            if (!(objB0 instanceof Float)) {
                return false;
            }
            Float f12 = (Float) objB0;
            return f12.isNaN() || f12.isInfinite();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final String e0() {
            c cVar;
            if (this.f342565t || (cVar = this.f342562q) == null) {
                return null;
            }
            int i12 = this.f342563r + 1;
            if (i12 < 16) {
                JsonToken jsonTokenD = cVar.d(i12);
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (jsonTokenD == jsonToken) {
                    this.f342563r = i12;
                    this.f413872d = jsonToken;
                    String str = this.f342562q.f342571c[i12];
                    String string = str instanceof String ? str : str.toString();
                    this.f342564s.f342575e = string;
                    return string;
                }
            }
            if (g0() == JsonToken.FIELD_NAME) {
                return d();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final JsonToken g0() {
            c cVar;
            if (this.f342565t || (cVar = this.f342562q) == null) {
                return null;
            }
            int i12 = this.f342563r + 1;
            this.f342563r = i12;
            if (i12 >= 16) {
                this.f342563r = 0;
                c cVar2 = cVar.f342569a;
                this.f342562q = cVar2;
                if (cVar2 == null) {
                    return null;
                }
            }
            JsonToken jsonTokenD = this.f342562q.d(this.f342563r);
            this.f413872d = jsonTokenD;
            if (jsonTokenD == JsonToken.FIELD_NAME) {
                Object objB0 = B0();
                this.f342564s.f342575e = objB0 instanceof String ? (String) objB0 : objB0.toString();
            } else if (jsonTokenD == JsonToken.START_OBJECT) {
                D d12 = this.f342564s;
                d12.f341142b++;
                this.f342564s = new D(d12, 2);
            } else if (jsonTokenD == JsonToken.START_ARRAY) {
                D d13 = this.f342564s;
                d13.f341142b++;
                this.f342564s = new D(d13, 1);
            } else if (jsonTokenD == JsonToken.END_OBJECT || jsonTokenD == JsonToken.END_ARRAY) {
                D d14 = this.f342564s;
                com.fasterxml.jackson.core.g gVar = d14.f342573c;
                this.f342564s = gVar instanceof D ? (D) gVar : gVar == null ? new D() : new D(gVar, d14.f342574d);
            } else {
                this.f342564s.f341142b++;
            }
            return this.f413872d;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final BigInteger h() throws JsonParseException {
            Number numberD = D();
            return numberD instanceof BigInteger ? (BigInteger) numberD : B() == JsonParser.NumberType.f341079g ? ((BigDecimal) numberD).toBigInteger() : BigInteger.valueOf(numberD.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final byte[] i(Base64Variant base64Variant) throws JsonParseException {
            if (this.f413872d == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object objB0 = B0();
                if (objB0 instanceof byte[]) {
                    return (byte[]) objB0;
                }
            }
            if (this.f413872d != JsonToken.VALUE_STRING) {
                throw new JsonParseException(this, "Current token (" + this.f413872d + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String strL = L();
            if (strL == null) {
                return null;
            }
            com.fasterxml.jackson.core.util.c cVar = this.f342566u;
            if (cVar == null) {
                cVar = new com.fasterxml.jackson.core.util.c((com.fasterxml.jackson.core.util.a) null, 100);
                this.f342566u = cVar;
            } else {
                cVar.f();
            }
            m0(strL, cVar, base64Variant);
            return cVar.g();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final int i0(Base64Variant base64Variant, C36500f c36500f) throws JsonParseException {
            byte[] bArrI = i(base64Variant);
            if (bArrI == null) {
                return 0;
            }
            c36500f.write(bArrI, 0, bArrI.length);
            return bArrI.length;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final com.fasterxml.jackson.core.j k() {
            return this.f342559n;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final com.fasterxml.jackson.core.e m() {
            com.fasterxml.jackson.core.e eVar = this.f342567v;
            return eVar == null ? com.fasterxml.jackson.core.e.f341122h : eVar;
        }

        @Override // lX0.AbstractC43700c
        public final void o0() {
            com.fasterxml.jackson.core.util.r.c();
            throw null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final BigDecimal q() throws JsonParseException {
            Number numberD = D();
            if (numberD instanceof BigDecimal) {
                return (BigDecimal) numberD;
            }
            int iOrdinal = B().ordinal();
            return (iOrdinal == 0 || iOrdinal == 1) ? BigDecimal.valueOf(numberD.longValue()) : iOrdinal != 2 ? BigDecimal.valueOf(numberD.doubleValue()) : new BigDecimal((BigInteger) numberD);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final double u() {
            return D().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Object x() {
            if (this.f413872d == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return B0();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final float y() {
            return D().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final int z() {
            Number numberD = this.f413872d == JsonToken.VALUE_NUMBER_INT ? (Number) B0() : D();
            if ((numberD instanceof Integer) || (numberD instanceof Short) || (numberD instanceof Byte)) {
                return numberD.intValue();
            }
            if (numberD instanceof Long) {
                long jLongValue = numberD.longValue();
                int i12 = (int) jLongValue;
                if (i12 == jLongValue) {
                    return i12;
                }
                x0();
                throw null;
            }
            if (numberD instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) numberD;
                if (AbstractC43700c.f413864f.compareTo(bigInteger) > 0 || AbstractC43700c.f413865g.compareTo(bigInteger) < 0) {
                    x0();
                    throw null;
                }
            } else {
                if ((numberD instanceof Double) || (numberD instanceof Float)) {
                    double dDoubleValue = numberD.doubleValue();
                    if (dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
                        return (int) dDoubleValue;
                    }
                    x0();
                    throw null;
                }
                if (!(numberD instanceof BigDecimal)) {
                    com.fasterxml.jackson.core.util.r.c();
                    throw null;
                }
                BigDecimal bigDecimal = (BigDecimal) numberD;
                if (AbstractC43700c.f413870l.compareTo(bigDecimal) > 0 || AbstractC43700c.f413871m.compareTo(bigDecimal) < 0) {
                    x0();
                    throw null;
                }
            }
            return numberD.intValue();
        }
    }

    /* compiled from: TokenBuffer.java */
    public static final class c {

        /* renamed from: e, reason: collision with root package name */
        public static final JsonToken[] f342568e;

        /* renamed from: a, reason: collision with root package name */
        public c f342569a;

        /* renamed from: b, reason: collision with root package name */
        public long f342570b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f342571c = new Object[16];

        /* renamed from: d, reason: collision with root package name */
        public TreeMap<Integer, Object> f342572d;

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            f342568e = jsonTokenArr;
            JsonToken[] jsonTokenArrValues = JsonToken.values();
            System.arraycopy(jsonTokenArrValues, 1, jsonTokenArr, 1, Math.min(15, jsonTokenArrValues.length - 1));
        }

        public final c a(int i12, JsonToken jsonToken) {
            if (i12 >= 16) {
                c cVar = new c();
                this.f342569a = cVar;
                cVar.f342570b = jsonToken.ordinal() | cVar.f342570b;
                return this.f342569a;
            }
            long jOrdinal = jsonToken.ordinal();
            if (i12 > 0) {
                jOrdinal <<= i12 << 2;
            }
            this.f342570b |= jOrdinal;
            return null;
        }

        public final void b(int i12, Object obj, Object obj2) {
            if (this.f342572d == null) {
                this.f342572d = new TreeMap<>();
            }
            if (obj != null) {
                this.f342572d.put(Integer.valueOf(i12 + i12 + 1), obj);
            }
            if (obj2 != null) {
                this.f342572d.put(Integer.valueOf(i12 + i12), obj2);
            }
        }

        public final Object c(int i12) {
            TreeMap<Integer, Object> treeMap = this.f342572d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i12 + i12 + 1));
        }

        public final JsonToken d(int i12) {
            long j12 = this.f342570b;
            if (i12 > 0) {
                j12 >>= i12 << 2;
            }
            return f342568e[((int) j12) & 15];
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void A() {
        c cVarA = this.f342551k.a(this.f342552l, JsonToken.END_ARRAY);
        if (cVarA == null) {
            this.f342552l++;
        } else {
            this.f342551k = cVarA;
            this.f342552l = 1;
        }
        C44705e c44705e = this.f342556p.f419833c;
        if (c44705e != null) {
            this.f342556p = c44705e;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void B() {
        c cVarA = this.f342551k.a(this.f342552l, JsonToken.END_OBJECT);
        if (cVarA == null) {
            this.f342552l++;
        } else {
            this.f342551k = cVarA;
            this.f342552l = 1;
        }
        C44705e c44705e = this.f342556p.f419833c;
        if (c44705e != null) {
            this.f342556p = c44705e;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void F(com.fasterxml.jackson.core.l lVar) throws JsonGenerationException {
        this.f342556p.m(lVar.getValue());
        m0(lVar);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void G(String str) throws JsonGenerationException {
        this.f342556p.m(str);
        m0(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void H() {
        p0(JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void I(double d12) {
        r0(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d12));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void J(float f12) {
        r0(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f12));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void L(int i12) {
        r0(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i12));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void M(long j12) {
        r0(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j12));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void N(String str) {
        r0(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void O(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            H();
        } else {
            r0(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void P(BigInteger bigInteger) {
        if (bigInteger == null) {
            H();
        } else {
            r0(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void Q(short s5) {
        r0(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s5));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void S(Object obj) {
        this.f342554n = obj;
        this.f342555o = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void U(char c12) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void V(int i12, char[] cArr) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void W(com.fasterxml.jackson.core.l lVar) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void X(String str) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void Z(String str) {
        JsonToken jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        x xVar = new x();
        xVar.f342646b = str;
        r0(jsonToken, xVar);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void a0() {
        this.f342556p.n();
        o0(JsonToken.START_ARRAY);
        this.f342556p = this.f342556p.i();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void b0(int i12, Object obj) {
        this.f342556p.n();
        o0(JsonToken.START_ARRAY);
        this.f342556p = this.f342556p.j(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void c0(Object obj) {
        this.f342556p.n();
        o0(JsonToken.START_ARRAY);
        this.f342556p = this.f342556p.j(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean d() {
        return this.f342547g;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void e0() {
        this.f342556p.n();
        o0(JsonToken.START_OBJECT);
        this.f342556p = this.f342556p.k();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean f() {
        return this.f342546f;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void f0(Object obj) {
        this.f342556p.n();
        o0(JsonToken.START_OBJECT);
        this.f342556p = this.f342556p.l(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final com.fasterxml.jackson.core.g g() {
        return this.f342556p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void g0(Object obj) {
        this.f342556p.n();
        o0(JsonToken.START_OBJECT);
        this.f342556p = this.f342556p.l(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void h0(com.fasterxml.jackson.core.l lVar) {
        if (lVar == null) {
            H();
        } else {
            r0(JsonToken.VALUE_STRING, lVar);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean i(JsonGenerator.Feature feature) {
        return (feature.f341052c & this.f342545e) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i0(String str) {
        if (str == null) {
            H();
        } else {
            r0(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void j0(char[] cArr, int i12, int i13) {
        i0(new String(cArr, i12, i13));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void l0(Object obj) {
        this.f342553m = obj;
        this.f342555o = true;
    }

    public final void m0(Object obj) {
        c cVar = null;
        if (this.f342555o) {
            c cVar2 = this.f342551k;
            int i12 = this.f342552l;
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            Object obj2 = this.f342554n;
            Object obj3 = this.f342553m;
            if (i12 < 16) {
                cVar2.f342571c[i12] = obj;
                long jOrdinal = jsonToken.ordinal();
                if (i12 > 0) {
                    jOrdinal <<= i12 << 2;
                }
                cVar2.f342570b = jOrdinal | cVar2.f342570b;
                cVar2.b(i12, obj2, obj3);
            } else {
                cVar2.getClass();
                c cVar3 = new c();
                cVar2.f342569a = cVar3;
                cVar3.f342571c[0] = obj;
                cVar3.f342570b = jsonToken.ordinal() | cVar3.f342570b;
                cVar3.b(0, obj2, obj3);
                cVar = cVar2.f342569a;
            }
        } else {
            c cVar4 = this.f342551k;
            int i13 = this.f342552l;
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (i13 < 16) {
                cVar4.f342571c[i13] = obj;
                long jOrdinal2 = jsonToken2.ordinal();
                if (i13 > 0) {
                    jOrdinal2 <<= i13 << 2;
                }
                cVar4.f342570b |= jOrdinal2;
            } else {
                cVar4.getClass();
                c cVar5 = new c();
                cVar4.f342569a = cVar5;
                cVar5.f342571c[0] = obj;
                cVar5.f342570b = jsonToken2.ordinal() | cVar5.f342570b;
                cVar = cVar4.f342569a;
            }
        }
        if (cVar == null) {
            this.f342552l++;
        } else {
            this.f342551k = cVar;
            this.f342552l = 1;
        }
    }

    public final void n0(StringBuilder sb2) {
        Object objC = this.f342551k.c(this.f342552l - 1);
        if (objC != null) {
            sb2.append("[objectId=");
            sb2.append(String.valueOf(objC));
            sb2.append(']');
        }
        c cVar = this.f342551k;
        int i12 = this.f342552l - 1;
        TreeMap<Integer, Object> treeMap = cVar.f342572d;
        Object obj = treeMap == null ? null : treeMap.get(Integer.valueOf(i12 + i12));
        if (obj != null) {
            sb2.append("[typeId=");
            sb2.append(String.valueOf(obj));
            sb2.append(']');
        }
    }

    public final void o0(JsonToken jsonToken) {
        c cVarA;
        if (this.f342555o) {
            c cVar = this.f342551k;
            int i12 = this.f342552l;
            Object obj = this.f342554n;
            Object obj2 = this.f342553m;
            cVar.getClass();
            if (i12 < 16) {
                long jOrdinal = jsonToken.ordinal();
                if (i12 > 0) {
                    jOrdinal <<= i12 << 2;
                }
                cVar.f342570b = jOrdinal | cVar.f342570b;
                cVar.b(i12, obj, obj2);
                cVarA = null;
            } else {
                c cVar2 = new c();
                cVar.f342569a = cVar2;
                cVar2.f342570b = jsonToken.ordinal() | cVar2.f342570b;
                cVar2.b(0, obj, obj2);
                cVarA = cVar.f342569a;
            }
        } else {
            cVarA = this.f342551k.a(this.f342552l, jsonToken);
        }
        if (cVarA == null) {
            this.f342552l++;
        } else {
            this.f342551k = cVarA;
            this.f342552l = 1;
        }
    }

    public final void p0(JsonToken jsonToken) {
        c cVarA;
        this.f342556p.n();
        if (this.f342555o) {
            c cVar = this.f342551k;
            int i12 = this.f342552l;
            Object obj = this.f342554n;
            Object obj2 = this.f342553m;
            cVar.getClass();
            if (i12 < 16) {
                long jOrdinal = jsonToken.ordinal();
                if (i12 > 0) {
                    jOrdinal <<= i12 << 2;
                }
                cVar.f342570b = jOrdinal | cVar.f342570b;
                cVar.b(i12, obj, obj2);
                cVarA = null;
            } else {
                c cVar2 = new c();
                cVar.f342569a = cVar2;
                cVar2.f342570b = jsonToken.ordinal() | cVar2.f342570b;
                cVar2.b(0, obj, obj2);
                cVarA = cVar.f342569a;
            }
        } else {
            cVarA = this.f342551k.a(this.f342552l, jsonToken);
        }
        if (cVarA == null) {
            this.f342552l++;
        } else {
            this.f342551k = cVarA;
            this.f342552l = 1;
        }
    }

    public final void r0(JsonToken jsonToken, Object obj) {
        this.f342556p.n();
        c cVar = null;
        if (this.f342555o) {
            c cVar2 = this.f342551k;
            int i12 = this.f342552l;
            Object obj2 = this.f342554n;
            Object obj3 = this.f342553m;
            if (i12 < 16) {
                cVar2.f342571c[i12] = obj;
                long jOrdinal = jsonToken.ordinal();
                if (i12 > 0) {
                    jOrdinal <<= i12 << 2;
                }
                cVar2.f342570b = jOrdinal | cVar2.f342570b;
                cVar2.b(i12, obj2, obj3);
            } else {
                cVar2.getClass();
                c cVar3 = new c();
                cVar2.f342569a = cVar3;
                cVar3.f342571c[0] = obj;
                cVar3.f342570b = jsonToken.ordinal() | cVar3.f342570b;
                cVar3.b(0, obj2, obj3);
                cVar = cVar2.f342569a;
            }
        } else {
            c cVar4 = this.f342551k;
            int i13 = this.f342552l;
            if (i13 < 16) {
                cVar4.f342571c[i13] = obj;
                long jOrdinal2 = jsonToken.ordinal();
                if (i13 > 0) {
                    jOrdinal2 <<= i13 << 2;
                }
                cVar4.f342570b = jOrdinal2 | cVar4.f342570b;
            } else {
                cVar4.getClass();
                c cVar5 = new c();
                cVar4.f342569a = cVar5;
                cVar5.f342571c[0] = obj;
                cVar5.f342570b = jsonToken.ordinal() | cVar5.f342570b;
                cVar = cVar4.f342569a;
            }
        }
        if (cVar == null) {
            this.f342552l++;
        } else {
            this.f342551k = cVar;
            this.f342552l = 1;
        }
    }

    public final void s0(JsonParser jsonParser) {
        Object objQ = jsonParser.Q();
        this.f342553m = objQ;
        if (objQ != null) {
            this.f342555o = true;
        }
        Object objG = jsonParser.G();
        this.f342554n = objG;
        if (objG != null) {
            this.f342555o = true;
        }
    }

    public final void t0(JsonParser jsonParser) throws JsonGenerationException {
        int i12 = 1;
        while (true) {
            JsonToken jsonTokenG0 = jsonParser.g0();
            if (jsonTokenG0 == null) {
                return;
            }
            int iOrdinal = jsonTokenG0.ordinal();
            if (iOrdinal == 1) {
                if (this.f342548h) {
                    s0(jsonParser);
                }
                e0();
            } else if (iOrdinal == 2) {
                B();
                i12--;
                if (i12 == 0) {
                    return;
                }
            } else if (iOrdinal == 3) {
                if (this.f342548h) {
                    s0(jsonParser);
                }
                a0();
            } else if (iOrdinal == 4) {
                A();
                i12--;
                if (i12 == 0) {
                    return;
                }
            } else if (iOrdinal != 5) {
                u0(jsonParser, jsonTokenG0);
            } else {
                if (this.f342548h) {
                    s0(jsonParser);
                }
                G(jsonParser.d());
            }
            i12++;
        }
    }

    public final String toString() {
        StringBuilder sbR = H.r("[TokenBuffer: ");
        b bVarX0 = x0(this.f342543c);
        int i12 = 0;
        boolean z12 = this.f342546f || this.f342547g;
        while (true) {
            try {
                JsonToken jsonTokenG0 = bVarX0.g0();
                if (jsonTokenG0 == null) {
                    break;
                }
                if (z12) {
                    n0(sbR);
                }
                if (i12 < 100) {
                    if (i12 > 0) {
                        sbR.append(", ");
                    }
                    sbR.append(jsonTokenG0.toString());
                    if (jsonTokenG0 == JsonToken.FIELD_NAME) {
                        sbR.append('(');
                        sbR.append(bVarX0.d());
                        sbR.append(')');
                    }
                }
                i12++;
            } catch (IOException e12) {
                throw new IllegalStateException(e12);
            }
        }
        if (i12 >= 100) {
            sbR.append(" ... (truncated ");
            sbR.append(i12 - 100);
            sbR.append(" entries)");
        }
        sbR.append(']');
        return sbR.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final int u(Base64Variant base64Variant, InputStream inputStream, int i12) {
        throw new UnsupportedOperationException();
    }

    public final void u0(JsonParser jsonParser, JsonToken jsonToken) {
        if (this.f342548h) {
            s0(jsonParser);
        }
        switch (jsonToken.ordinal()) {
            case 6:
                writeObject(jsonParser.x());
                return;
            case 7:
                if (jsonParser.X()) {
                    j0(jsonParser.M(), jsonParser.O(), jsonParser.N());
                    return;
                } else {
                    i0(jsonParser.L());
                    return;
                }
            case 8:
                int iOrdinal = jsonParser.B().ordinal();
                if (iOrdinal == 0) {
                    L(jsonParser.z());
                    return;
                } else if (iOrdinal != 2) {
                    M(jsonParser.A());
                    return;
                } else {
                    P(jsonParser.h());
                    return;
                }
            case 9:
                if (this.f342549i) {
                    O(jsonParser.q());
                    return;
                } else {
                    r0(JsonToken.VALUE_NUMBER_FLOAT, jsonParser.F());
                    return;
                }
            case 10:
                y(true);
                return;
            case 11:
                y(false);
                return;
            case 12:
                H();
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    public final void v0(C c12) throws JsonGenerationException {
        if (!this.f342546f) {
            this.f342546f = c12.f342546f;
        }
        if (!this.f342547g) {
            this.f342547g = c12.f342547g;
        }
        this.f342548h = this.f342546f || this.f342547g;
        b bVarX0 = c12.x0(c12.f342543c);
        while (bVarX0.g0() != null) {
            y0(bVarX0);
        }
    }

    public final b w0(JsonParser jsonParser) {
        b bVar = new b(this.f342550j, jsonParser.k(), this.f342546f, this.f342547g, this.f342544d);
        bVar.f342567v = jsonParser.P();
        return bVar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeObject(Object obj) {
        if (obj == null) {
            H();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof x)) {
            r0(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        com.fasterxml.jackson.core.j jVar = this.f342543c;
        if (jVar == null) {
            r0(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            jVar.a(this, obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void x(Base64Variant base64Variant, byte[] bArr, int i12, int i13) {
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, i12, bArr2, 0, i13);
        writeObject(bArr2);
    }

    public final b x0(com.fasterxml.jackson.core.j jVar) {
        return new b(this.f342550j, jVar, this.f342546f, this.f342547g, this.f342544d);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void y(boolean z12) {
        p0(z12 ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    public final void y0(JsonParser jsonParser) throws JsonGenerationException {
        JsonToken jsonTokenF = jsonParser.f();
        if (jsonTokenF == JsonToken.FIELD_NAME) {
            if (this.f342548h) {
                s0(jsonParser);
            }
            G(jsonParser.d());
            jsonTokenF = jsonParser.g0();
        } else if (jsonTokenF == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int iOrdinal = jsonTokenF.ordinal();
        if (iOrdinal == 1) {
            if (this.f342548h) {
                s0(jsonParser);
            }
            e0();
            t0(jsonParser);
            return;
        }
        if (iOrdinal == 2) {
            B();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                u0(jsonParser, jsonTokenF);
                return;
            } else {
                A();
                return;
            }
        }
        if (this.f342548h) {
            s0(jsonParser);
        }
        a0();
        t0(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void z(Object obj) {
        r0(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public final void flush() {
    }
}
