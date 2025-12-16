package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import rX0.InterfaceC47610a;

/* compiled from: NumberDeserializers.java */
/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f341846a = new HashSet<>();

    /* compiled from: NumberDeserializers.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341847a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f341847a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341847a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341847a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static class b extends G<BigDecimal> {

        /* renamed from: e, reason: collision with root package name */
        public static final b f341848e = new b();

        public b() {
            super(BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            int iG2 = jsonParser.g();
            Class<?> cls = this.f341716b;
            if (iG2 == 1) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            if (iG2 == 3) {
                return E(jsonParser, fVar);
            }
            if (iG2 != 6) {
                if (iG2 == 7 || iG2 == 8) {
                    return jsonParser.q();
                }
                fVar.B(jsonParser, n0(fVar));
                throw null;
            }
            String strL = jsonParser.L();
            CoercionAction coercionActionX = x(fVar, strL);
            if (coercionActionX == CoercionAction.f341462d) {
                return null;
            }
            if (coercionActionX == CoercionAction.f341463e) {
                return BigDecimal.ZERO;
            }
            String strTrim = strL.trim();
            if ("null".equals(strTrim)) {
                return null;
            }
            try {
                return new BigDecimal(strTrim);
            } catch (IllegalArgumentException unused) {
                fVar.I(cls, strTrim, "not a valid representation", new Object[0]);
                throw null;
            }
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object l(com.fasterxml.jackson.databind.f fVar) {
            return BigDecimal.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
        public final LogicalType q() {
            return LogicalType.f342438h;
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static class c extends G<BigInteger> {

        /* renamed from: e, reason: collision with root package name */
        public static final c f341849e = new c();

        public c() {
            super(BigInteger.class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            if (jsonParser.a0()) {
                return jsonParser.h();
            }
            int iG2 = jsonParser.g();
            Class<?> cls = this.f341716b;
            if (iG2 == 1) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            if (iG2 == 3) {
                return E(jsonParser, fVar);
            }
            CoercionAction coercionAction = CoercionAction.f341463e;
            CoercionAction coercionAction2 = CoercionAction.f341462d;
            if (iG2 == 6) {
                String strL = jsonParser.L();
                CoercionAction coercionActionX = x(fVar, strL);
                if (coercionActionX != coercionAction2) {
                    if (coercionActionX == coercionAction) {
                        return BigInteger.ZERO;
                    }
                    String strTrim = strL.trim();
                    if (!"null".equals(strTrim)) {
                        try {
                            return new BigInteger(strTrim);
                        } catch (IllegalArgumentException unused) {
                            fVar.I(cls, strTrim, "not a valid representation", new Object[0]);
                            throw null;
                        }
                    }
                }
            } else {
                if (iG2 != 8) {
                    fVar.B(jsonParser, n0(fVar));
                    throw null;
                }
                CoercionAction coercionActionW = w(jsonParser, fVar, cls);
                if (coercionActionW != coercionAction2) {
                    return coercionActionW == coercionAction ? BigInteger.ZERO : jsonParser.q().toBigInteger();
                }
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object l(com.fasterxml.jackson.databind.f fVar) {
            return BigInteger.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
        public final LogicalType q() {
            return LogicalType.f342437g;
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static final class d extends l<Boolean> {

        /* renamed from: i, reason: collision with root package name */
        public static final d f341850i = new d(Boolean.TYPE, Boolean.FALSE);

        /* renamed from: j, reason: collision with root package name */
        public static final d f341851j = new d(Boolean.class, null);
        private static final long serialVersionUID = 1;

        public d(Class<Boolean> cls, Boolean bool) {
            super(cls, LogicalType.f342439i, bool, Boolean.FALSE);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            JsonToken jsonTokenF = jsonParser.f();
            return jsonTokenF == JsonToken.VALUE_TRUE ? Boolean.TRUE : jsonTokenF == JsonToken.VALUE_FALSE ? Boolean.FALSE : this.f341868h ? Boolean.valueOf(P(jsonParser, fVar)) : O(jsonParser, fVar, this.f341716b);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
        public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
            JsonToken jsonTokenF = jsonParser.f();
            return jsonTokenF == JsonToken.VALUE_TRUE ? Boolean.TRUE : jsonTokenF == JsonToken.VALUE_FALSE ? Boolean.FALSE : this.f341868h ? Boolean.valueOf(P(jsonParser, fVar)) : O(jsonParser, fVar, this.f341716b);
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static class e extends l<Byte> {

        /* renamed from: i, reason: collision with root package name */
        public static final e f341852i = new e(Byte.TYPE, (byte) 0);

        /* renamed from: j, reason: collision with root package name */
        public static final e f341853j = new e(Byte.class, null);
        private static final long serialVersionUID = 1;

        public e(Class<Byte> cls, Byte b12) {
            super(cls, LogicalType.f342437g, b12, (byte) 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            Byte b12;
            if (jsonParser.a0()) {
                return Byte.valueOf(jsonParser.j());
            }
            if (this.f341868h) {
                return Byte.valueOf(Q(jsonParser, fVar));
            }
            int iG2 = jsonParser.g();
            Class<?> cls = this.f341716b;
            if (iG2 == 1) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            if (iG2 == 3) {
                return E(jsonParser, fVar);
            }
            if (iG2 == 11) {
                return d(fVar);
            }
            CoercionAction coercionAction = CoercionAction.f341463e;
            CoercionAction coercionAction2 = CoercionAction.f341462d;
            T t12 = this.f341867g;
            if (iG2 == 6) {
                String strL = jsonParser.L();
                CoercionAction coercionActionX = x(fVar, strL);
                if (coercionActionX == coercionAction2) {
                    return d(fVar);
                }
                if (coercionActionX != coercionAction) {
                    String strTrim = strL.trim();
                    if (z(fVar, strTrim)) {
                        return d(fVar);
                    }
                    try {
                        int iB2 = com.fasterxml.jackson.core.io.j.b(strTrim);
                        if (iB2 >= -128 && iB2 <= 255) {
                            return Byte.valueOf((byte) iB2);
                        }
                        fVar.I(cls, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        fVar.I(cls, strTrim, "not a valid Byte value", new Object[0]);
                        throw null;
                    }
                }
                b12 = (Byte) t12;
            } else {
                if (iG2 == 7) {
                    return Byte.valueOf(jsonParser.j());
                }
                if (iG2 != 8) {
                    fVar.B(jsonParser, n0(fVar));
                    throw null;
                }
                CoercionAction coercionActionW = w(jsonParser, fVar, cls);
                if (coercionActionW == coercionAction2) {
                    return d(fVar);
                }
                if (coercionActionW != coercionAction) {
                    return Byte.valueOf(jsonParser.j());
                }
                b12 = (Byte) t12;
            }
            return b12;
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static class f extends l<Character> {

        /* renamed from: i, reason: collision with root package name */
        public static final f f341854i = new f(Character.TYPE, 0);

        /* renamed from: j, reason: collision with root package name */
        public static final f f341855j = new f(Character.class, null);
        private static final long serialVersionUID = 1;

        public f(Class<Character> cls, Character ch2) {
            super(cls, LogicalType.f342437g, ch2, (char) 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            int iG2 = jsonParser.g();
            Class<?> cls = this.f341716b;
            if (iG2 == 1) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            if (iG2 == 3) {
                return E(jsonParser, fVar);
            }
            if (iG2 == 11) {
                if (this.f341868h) {
                    e0(fVar);
                }
                return d(fVar);
            }
            T t12 = this.f341867g;
            if (iG2 == 6) {
                String strL = jsonParser.L();
                if (strL.length() == 1) {
                    return Character.valueOf(strL.charAt(0));
                }
                CoercionAction coercionActionX = x(fVar, strL);
                if (coercionActionX == CoercionAction.f341462d) {
                    return d(fVar);
                }
                if (coercionActionX == CoercionAction.f341463e) {
                    return (Character) t12;
                }
                String strTrim = strL.trim();
                if (z(fVar, strTrim)) {
                    return d(fVar);
                }
                fVar.I(cls, strTrim, "Expected either Integer value code or 1-character String", new Object[0]);
                throw null;
            }
            if (iG2 != 7) {
                fVar.B(jsonParser, n0(fVar));
                throw null;
            }
            CoercionAction coercionActionN = fVar.n(this.f341865e, cls, CoercionInputShape.f341465b);
            int iOrdinal = coercionActionN.ordinal();
            if (iOrdinal == 0) {
                t(fVar, coercionActionN, jsonParser.D(), "Integer value (" + jsonParser.L() + ")");
            } else if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return (Character) t12;
                }
                int iZ2 = jsonParser.z();
                if (iZ2 >= 0 && iZ2 <= 65535) {
                    return Character.valueOf((char) iZ2);
                }
                fVar.H(cls, Integer.valueOf(iZ2), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                throw null;
            }
            return d(fVar);
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static class g extends l<Double> {

        /* renamed from: i, reason: collision with root package name */
        public static final g f341856i = new g(Double.TYPE, Double.valueOf(0.0d));

        /* renamed from: j, reason: collision with root package name */
        public static final g f341857j = new g(Double.class, null);
        private static final long serialVersionUID = 1;

        public g(Class<Double> cls, Double d12) {
            super(cls, LogicalType.f342438h, d12, Double.valueOf(0.0d));
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return jsonParser.Y(JsonToken.VALUE_NUMBER_FLOAT) ? Double.valueOf(jsonParser.u()) : this.f341868h ? Double.valueOf(T(jsonParser, fVar)) : q0(jsonParser, fVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
        public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
            return jsonParser.Y(JsonToken.VALUE_NUMBER_FLOAT) ? Double.valueOf(jsonParser.u()) : this.f341868h ? Double.valueOf(T(jsonParser, fVar)) : q0(jsonParser, fVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Double q0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            int iG2 = jsonParser.g();
            Class<?> cls = this.f341716b;
            if (iG2 == 1) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            if (iG2 == 3) {
                return E(jsonParser, fVar);
            }
            if (iG2 == 11) {
                return d(fVar);
            }
            if (iG2 != 6) {
                if (iG2 == 7 || iG2 == 8) {
                    return Double.valueOf(jsonParser.u());
                }
                fVar.B(jsonParser, n0(fVar));
                throw null;
            }
            String strL = jsonParser.L();
            Double dU2 = C.u(strL);
            if (dU2 != null) {
                return dU2;
            }
            CoercionAction coercionActionX = x(fVar, strL);
            if (coercionActionX == CoercionAction.f341462d) {
                return d(fVar);
            }
            if (coercionActionX == CoercionAction.f341463e) {
                return (Double) this.f341867g;
            }
            String strTrim = strL.trim();
            if (z(fVar, strTrim)) {
                return d(fVar);
            }
            try {
                return Double.valueOf("2.2250738585072012e-308".equals(strTrim) ? Double.MIN_NORMAL : Double.parseDouble(strTrim));
            } catch (IllegalArgumentException unused) {
                fVar.I(cls, strTrim, "not a valid `Double` value", new Object[0]);
                throw null;
            }
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static class h extends l<Float> {

        /* renamed from: i, reason: collision with root package name */
        public static final h f341858i = new h(Float.TYPE, Float.valueOf(0.0f));

        /* renamed from: j, reason: collision with root package name */
        public static final h f341859j = new h(Float.class, null);
        private static final long serialVersionUID = 1;

        public h(Class<Float> cls, Float f12) {
            super(cls, LogicalType.f342438h, f12, Float.valueOf(0.0f));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            if (jsonParser.Y(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Float.valueOf(jsonParser.y());
            }
            if (this.f341868h) {
                return Float.valueOf(U(jsonParser, fVar));
            }
            int iG2 = jsonParser.g();
            Class<?> cls = this.f341716b;
            if (iG2 == 1) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            if (iG2 == 3) {
                return E(jsonParser, fVar);
            }
            if (iG2 == 11) {
                return d(fVar);
            }
            if (iG2 != 6) {
                if (iG2 == 7 || iG2 == 8) {
                    return Float.valueOf(jsonParser.y());
                }
                fVar.B(jsonParser, n0(fVar));
                throw null;
            }
            String strL = jsonParser.L();
            Float fV2 = C.v(strL);
            if (fV2 != null) {
                return fV2;
            }
            CoercionAction coercionActionX = x(fVar, strL);
            if (coercionActionX == CoercionAction.f341462d) {
                return d(fVar);
            }
            if (coercionActionX == CoercionAction.f341463e) {
                return (Float) this.f341867g;
            }
            String strTrim = strL.trim();
            if (z(fVar, strTrim)) {
                return d(fVar);
            }
            try {
                return Float.valueOf(Float.parseFloat(strTrim));
            } catch (IllegalArgumentException unused) {
                fVar.I(cls, strTrim, "not a valid `Float` value", new Object[0]);
                throw null;
            }
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static final class i extends l<Integer> {

        /* renamed from: i, reason: collision with root package name */
        public static final i f341860i = new i(Integer.TYPE, 0);

        /* renamed from: j, reason: collision with root package name */
        public static final i f341861j = new i(Integer.class, null);
        private static final long serialVersionUID = 1;

        public i(Class<Integer> cls, Integer num) {
            super(cls, LogicalType.f342437g, num, 0);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return jsonParser.a0() ? Integer.valueOf(jsonParser.z()) : this.f341868h ? Integer.valueOf(V(jsonParser, fVar)) : X(jsonParser, fVar, Integer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
        public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
            return jsonParser.a0() ? Integer.valueOf(jsonParser.z()) : this.f341868h ? Integer.valueOf(V(jsonParser, fVar)) : X(jsonParser, fVar, Integer.class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final boolean p() {
            return true;
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static final class j extends l<Long> {

        /* renamed from: i, reason: collision with root package name */
        public static final j f341862i = new j(Long.TYPE, 0L);

        /* renamed from: j, reason: collision with root package name */
        public static final j f341863j = new j(Long.class, null);
        private static final long serialVersionUID = 1;

        public j(Class<Long> cls, Long l12) {
            super(cls, LogicalType.f342437g, l12, 0L);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return jsonParser.a0() ? Long.valueOf(jsonParser.A()) : this.f341868h ? Long.valueOf(Z(jsonParser, fVar)) : Y(jsonParser, fVar, Long.class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final boolean p() {
            return true;
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static class k extends G<Object> {

        /* renamed from: e, reason: collision with root package name */
        public static final k f341864e = new k();

        public k() {
            super(Number.class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException, NumberFormatException {
            int iG2 = jsonParser.g();
            int i12 = 1;
            Class<?> cls = this.f341716b;
            if (iG2 == 1) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            if (iG2 == 3) {
                return E(jsonParser, fVar);
            }
            if (iG2 != 6) {
                if (iG2 == 7) {
                    return fVar.J(C.f341715d) ? C.B(jsonParser, fVar) : jsonParser.D();
                }
                if (iG2 == 8) {
                    return (!fVar.O(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) || jsonParser.d0()) ? jsonParser.D() : jsonParser.q();
                }
                fVar.B(jsonParser, n0(fVar));
                throw null;
            }
            String strL = jsonParser.L();
            CoercionAction coercionActionX = x(fVar, strL);
            if (coercionActionX == CoercionAction.f341462d || coercionActionX == CoercionAction.f341463e) {
                return null;
            }
            String strTrim = strL.trim();
            if ("null".equals(strTrim)) {
                return null;
            }
            if (C.L(strTrim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (C.K(strTrim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if ("NaN".equals(strTrim)) {
                return Double.valueOf(Double.NaN);
            }
            try {
                int length = strTrim.length();
                if (length > 0) {
                    char cCharAt = strTrim.charAt(0);
                    if (cCharAt != '-' && cCharAt != '+') {
                        i12 = 0;
                    } else if (length == 1) {
                    }
                    while (i12 < length) {
                        char cCharAt2 = strTrim.charAt(i12);
                        if (cCharAt2 <= '9' && cCharAt2 >= '0') {
                            i12++;
                        }
                    }
                    if (fVar.O(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                        return new BigInteger(strTrim);
                    }
                    long j12 = Long.parseLong(strTrim);
                    return (fVar.O(DeserializationFeature.USE_LONG_FOR_INTS) || j12 > 2147483647L || j12 < -2147483648L) ? Long.valueOf(j12) : Integer.valueOf((int) j12);
                }
                return fVar.O(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? new BigDecimal(strTrim) : Double.valueOf(strTrim);
            } catch (IllegalArgumentException unused) {
                fVar.I(cls, strTrim, "not a valid number", new Object[0]);
                throw null;
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
        public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
            int iG2 = jsonParser.g();
            return (iG2 == 6 || iG2 == 7 || iG2 == 8) ? e(jsonParser, fVar) : lVar.e(jsonParser, fVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
        public final LogicalType q() {
            return LogicalType.f342437g;
        }
    }

    /* compiled from: NumberDeserializers.java */
    public static abstract class l<T> extends G<T> {
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final LogicalType f341865e;

        /* renamed from: f, reason: collision with root package name */
        public final T f341866f;

        /* renamed from: g, reason: collision with root package name */
        public final T f341867g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f341868h;

        public l(Class<T> cls, LogicalType logicalType, T t12, T t13) {
            super(cls);
            this.f341865e = logicalType;
            this.f341866f = t12;
            this.f341867g = t13;
            this.f341868h = cls.isPrimitive();
        }

        @Override // com.fasterxml.jackson.databind.i, com.fasterxml.jackson.databind.deser.s
        public final T d(com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            if (!this.f341868h || !fVar.O(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                return this.f341866f;
            }
            fVar.V(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", com.fasterxml.jackson.databind.util.g.f(this.f341716b));
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object l(com.fasterxml.jackson.databind.f fVar) {
            return this.f341867g;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
        public final LogicalType q() {
            return this.f341865e;
        }
    }

    /* compiled from: NumberDeserializers.java */
    @InterfaceC47610a
    public static class m extends l<Short> {

        /* renamed from: i, reason: collision with root package name */
        public static final m f341869i = new m(Short.TYPE, 0);

        /* renamed from: j, reason: collision with root package name */
        public static final m f341870j = new m(Short.class, null);
        private static final long serialVersionUID = 1;

        public m(Class<Short> cls, Short sh2) {
            super(cls, LogicalType.f342437g, sh2, (short) 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            Short sh2;
            if (jsonParser.a0()) {
                return Short.valueOf(jsonParser.J());
            }
            if (this.f341868h) {
                return Short.valueOf(a0(jsonParser, fVar));
            }
            int iG2 = jsonParser.g();
            Class<?> cls = this.f341716b;
            if (iG2 == 1) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            if (iG2 == 3) {
                return E(jsonParser, fVar);
            }
            if (iG2 == 11) {
                return d(fVar);
            }
            CoercionAction coercionAction = CoercionAction.f341463e;
            CoercionAction coercionAction2 = CoercionAction.f341462d;
            T t12 = this.f341867g;
            if (iG2 == 6) {
                String strL = jsonParser.L();
                CoercionAction coercionActionX = x(fVar, strL);
                if (coercionActionX == coercionAction2) {
                    return d(fVar);
                }
                if (coercionActionX != coercionAction) {
                    String strTrim = strL.trim();
                    if (z(fVar, strTrim)) {
                        return d(fVar);
                    }
                    try {
                        int iB2 = com.fasterxml.jackson.core.io.j.b(strTrim);
                        if (iB2 >= -32768 && iB2 <= 32767) {
                            return Short.valueOf((short) iB2);
                        }
                        fVar.I(cls, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        fVar.I(cls, strTrim, "not a valid Short value", new Object[0]);
                        throw null;
                    }
                }
                sh2 = (Short) t12;
            } else {
                if (iG2 == 7) {
                    return Short.valueOf(jsonParser.J());
                }
                if (iG2 != 8) {
                    fVar.B(jsonParser, n0(fVar));
                    throw null;
                }
                CoercionAction coercionActionW = w(jsonParser, fVar, cls);
                if (coercionActionW == coercionAction2) {
                    return d(fVar);
                }
                if (coercionActionW != coercionAction) {
                    return Short.valueOf(jsonParser.J());
                }
                sh2 = (Short) t12;
            }
            return sh2;
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i12 = 0; i12 < 11; i12++) {
            f341846a.add(clsArr[i12].getName());
        }
    }
}
