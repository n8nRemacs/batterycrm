package com.fasterxml.jackson.databind.deser.std;

import androidx.camera.core.Q;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.x;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import lX0.AbstractC43699b;

/* compiled from: StdDeserializer.java */
/* loaded from: classes4.dex */
public abstract class C<T> extends com.fasterxml.jackson.databind.i<T> implements Serializable, x.c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f341715d = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.f341372c | DeserializationFeature.USE_LONG_FOR_INTS.f341372c;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f341716b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341717c;

    /* compiled from: StdDeserializer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341718a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f341718a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341718a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341718a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f341718a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        int i12 = DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.f341372c;
        int i13 = DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.f341372c;
    }

    public C(Class<?> cls) {
        this.f341716b = cls;
        this.f341717c = null;
    }

    public static Number B(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return fVar.O(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.h() : fVar.O(DeserializationFeature.USE_LONG_FOR_INTS) ? Long.valueOf(jsonParser.A()) : jsonParser.D();
    }

    public static com.fasterxml.jackson.databind.deser.s H(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar, Nulls nulls, com.fasterxml.jackson.databind.i iVar) throws InvalidDefinitionException {
        if (nulls == Nulls.f340980c) {
            if (cVar == null) {
                return new com.fasterxml.jackson.databind.deser.impl.r(null, fVar.l(iVar == null ? Object.class : iVar.o()));
            }
            return new com.fasterxml.jackson.databind.deser.impl.r(cVar.c(), cVar.getType());
        }
        if (nulls != Nulls.f340981d) {
            if (nulls == Nulls.f340979b) {
                return com.fasterxml.jackson.databind.deser.impl.q.f341662c;
            }
            return null;
        }
        if (iVar == null) {
            return null;
        }
        if (iVar instanceof com.fasterxml.jackson.databind.deser.d) {
            com.fasterxml.jackson.databind.deser.d dVar = (com.fasterxml.jackson.databind.deser.d) iVar;
            if (!dVar.f341553g.k()) {
                fVar.i(String.format("Cannot create empty instance of %s, no default Creator", cVar == null ? dVar.f341551e : cVar.getType()));
                throw null;
            }
        }
        AccessPattern accessPatternK = iVar.k();
        AccessPattern accessPattern = AccessPattern.f342524b;
        com.fasterxml.jackson.databind.deser.impl.q qVar = com.fasterxml.jackson.databind.deser.impl.q.f341663d;
        if (accessPatternK == accessPattern) {
            return qVar;
        }
        if (accessPatternK != AccessPattern.f342525c) {
            return new com.fasterxml.jackson.databind.deser.impl.p(iVar);
        }
        Object objL = iVar.l(fVar);
        return objL == null ? qVar : new com.fasterxml.jackson.databind.deser.impl.q(objL);
    }

    public static final boolean I(String str) {
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) > ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean J(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'f') {
            return "false".equals(str);
        }
        if (cCharAt == 'F') {
            return "FALSE".equals(str) || "False".equals(str);
        }
        return false;
    }

    public static boolean K(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public static boolean L(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public static boolean N(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 't') {
            return "true".equals(str);
        }
        if (cCharAt == 'T') {
            return "TRUE".equals(str) || "True".equals(str);
        }
        return false;
    }

    public static int W(com.fasterxml.jackson.databind.f fVar, String str) throws InvalidFormatException {
        try {
            if (str.length() <= 9) {
                return com.fasterxml.jackson.core.io.j.b(str);
            }
            long jD2 = com.fasterxml.jackson.core.io.j.d(str);
            if (!(jD2 < -2147483648L || jD2 > 2147483647L)) {
                return (int) jD2;
            }
            fVar.I(Integer.TYPE, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.valueOf(BeduinInputModel.MIN_TEXT_VERSION), Integer.MAX_VALUE);
            throw null;
        } catch (IllegalArgumentException unused) {
            fVar.I(Integer.TYPE, str, "not a valid `int` value", new Object[0]);
            throw null;
        }
    }

    public static com.fasterxml.jackson.databind.deser.s g0(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.i iVar) throws InvalidDefinitionException {
        Nulls nulls = cVar != null ? cVar.getMetadata().f342521h : fVar.f341921d.f341514h.f341489c.f341001c;
        if (nulls == Nulls.f340979b) {
            return com.fasterxml.jackson.databind.deser.impl.q.f341662c;
        }
        if (nulls != Nulls.f340980c) {
            com.fasterxml.jackson.databind.deser.s sVarH = H(fVar, cVar, nulls, iVar);
            return sVarH != null ? sVarH : iVar;
        }
        if (cVar != null) {
            return new com.fasterxml.jackson.databind.deser.impl.r(cVar.c(), cVar.getType().n());
        }
        com.fasterxml.jackson.databind.h hVarL = fVar.l(iVar.o());
        if (hVarL.B()) {
            hVarL = hVarL.n();
        }
        return new com.fasterxml.jackson.databind.deser.impl.r(null, hVarL);
    }

    public static com.fasterxml.jackson.databind.i h0(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.i iVar) {
        AbstractC36471j abstractC36471jB;
        Object objH;
        AnnotationIntrospector annotationIntrospectorD = fVar.f341921d.d();
        if (annotationIntrospectorD == null || cVar == null || (abstractC36471jB = cVar.b()) == null || (objH = annotationIntrospectorD.h(abstractC36471jB)) == null) {
            return iVar;
        }
        cVar.b();
        com.fasterxml.jackson.databind.util.i iVarC = fVar.c(objH);
        com.fasterxml.jackson.databind.h hVarA = iVarC.a(fVar.e());
        if (iVar == null) {
            iVar = fVar.p(hVarA, cVar);
        }
        return new B(iVarC, hVarA, iVar);
    }

    public static Boolean i0(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar, Class cls, JsonFormat.Feature feature) {
        JsonFormat.b bVarK0 = k0(fVar, cVar, cls);
        if (bVarK0 != null) {
            return bVarK0.b(feature);
        }
        return null;
    }

    public static JsonFormat.b k0(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar, Class cls) {
        return cVar != null ? cVar.d(fVar.f341921d, cls) : fVar.f341921d.f(cls);
    }

    public static Double u(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (K(str)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (L(str)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && "NaN".equals(str)) {
            return Double.valueOf(Double.NaN);
        }
        return null;
    }

    public static Float v(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (K(str)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (L(str)) {
                return Float.valueOf(Float.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && "NaN".equals(str)) {
            return Float.valueOf(Float.NaN);
        }
        return null;
    }

    public final Boolean A(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Class<?> cls) throws InvalidFormatException {
        CoercionAction coercionActionN = fVar.n(LogicalType.f342439i, cls, CoercionInputShape.f341465b);
        int iOrdinal = coercionActionN.ordinal();
        if (iOrdinal == 0) {
            t(fVar, coercionActionN, jsonParser.D(), "Integer value (" + jsonParser.L() + ")");
            return Boolean.FALSE;
        }
        if (iOrdinal == 2) {
            return null;
        }
        if (iOrdinal == 3) {
            return Boolean.FALSE;
        }
        if (jsonParser.B() == JsonParser.NumberType.f341074b) {
            return Boolean.valueOf(jsonParser.z() != 0);
        }
        return Boolean.valueOf(!"0".equals(jsonParser.L()));
    }

    public final String C() {
        String strO;
        com.fasterxml.jackson.databind.h hVarM0 = m0();
        boolean z12 = true;
        if (hVarM0 == null || hVarM0.f341930b.isPrimitive()) {
            Class<?> clsO = o();
            if (!clsO.isArray() && !Collection.class.isAssignableFrom(clsO) && !Map.class.isAssignableFrom(clsO)) {
                z12 = false;
            }
            strO = com.fasterxml.jackson.databind.util.g.o(clsO);
        } else {
            if (!hVarM0.B() && !hVarM0.f()) {
                z12 = false;
            }
            strO = com.fasterxml.jackson.databind.util.g.t(hVarM0);
        }
        return z12 ? androidx.camera.camera2.internal.G.f("element of ", strO) : androidx.appcompat.app.r.q(strO, " value");
    }

    public T E(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        CoercionAction coercionActionN = fVar.n(q(), o(), CoercionInputShape.f341468e);
        boolean zO2 = fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zO2 || coercionActionN != CoercionAction.f341460b) {
            JsonToken jsonTokenG0 = jsonParser.g0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenG0 == jsonToken) {
                int iOrdinal = coercionActionN.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return d(fVar);
                }
                if (iOrdinal == 3) {
                    return (T) l(fVar);
                }
            } else if (zO2) {
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                if (!jsonParser.Y(jsonToken2)) {
                    T tE2 = e(jsonParser, fVar);
                    if (jsonParser.g0() == jsonToken) {
                        return tE2;
                    }
                    o0(fVar);
                    throw null;
                }
                fVar.C(n0(fVar), jsonParser.f(), jsonParser, "Cannot deserialize instance of " + com.fasterxml.jackson.databind.util.g.A(this.f341716b) + " out of " + jsonToken2 + " token: nested Arrays not allowed with DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS", new Object[0]);
                throw null;
            }
        }
        fVar.C(n0(fVar), JsonToken.START_ARRAY, jsonParser, null, new Object[0]);
        throw null;
    }

    public final Object F(com.fasterxml.jackson.databind.f fVar, CoercionAction coercionAction) throws InvalidFormatException {
        int iOrdinal = coercionAction.ordinal();
        if (iOrdinal == 0) {
            t(fVar, coercionAction, "", "empty String (\"\")");
            return null;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return l(fVar);
    }

    public final T G(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        com.fasterxml.jackson.databind.deser.x xVarL0 = l0();
        Class<?> clsO = o();
        String strV = jsonParser.V();
        if (xVarL0 != null && xVarL0.h()) {
            return (T) xVarL0.w(fVar, strV);
        }
        if (strV.isEmpty()) {
            return (T) F(fVar, fVar.n(q(), clsO, CoercionInputShape.f341469f));
        }
        if (I(strV)) {
            return (T) F(fVar, fVar.o(q(), clsO));
        }
        if (xVarL0 != null) {
            strV = strV.trim();
            boolean zE2 = xVarL0.e();
            LogicalType logicalType = LogicalType.f342437g;
            CoercionAction coercionAction = CoercionAction.f341461c;
            CoercionInputShape coercionInputShape = CoercionInputShape.f341467d;
            if (zE2 && fVar.n(logicalType, Integer.class, coercionInputShape) == coercionAction) {
                return (T) xVarL0.s(fVar, W(fVar, strV));
            }
            if (xVarL0.f() && fVar.n(logicalType, Long.class, coercionInputShape) == coercionAction) {
                try {
                    return (T) xVarL0.t(fVar, com.fasterxml.jackson.core.io.j.d(strV));
                } catch (IllegalArgumentException unused) {
                    fVar.I(Long.TYPE, strV, "not a valid `long` value", new Object[0]);
                    throw null;
                }
            }
            if (xVarL0.c() && fVar.n(LogicalType.f342439i, Boolean.class, coercionInputShape) == coercionAction) {
                String strTrim = strV.trim();
                if ("true".equals(strTrim)) {
                    return (T) xVarL0.q(fVar, true);
                }
                if ("false".equals(strTrim)) {
                    return (T) xVarL0.q(fVar, false);
                }
            }
        }
        AbstractC43699b abstractC43699b = fVar.f341924g;
        fVar.y(clsO, xVarL0, "no String-argument constructor/factory method to deserialize from String value ('%s')", strV);
        throw null;
    }

    public final Boolean O(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Class<?> cls) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        if (iG2 == 1) {
            fVar.E(cls, jsonParser);
            throw null;
        }
        if (iG2 == 3) {
            return (Boolean) E(jsonParser, fVar);
        }
        if (iG2 != 6) {
            if (iG2 == 7) {
                return A(jsonParser, fVar, cls);
            }
            switch (iG2) {
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                default:
                    fVar.E(cls, jsonParser);
                    throw null;
            }
        }
        String strL = jsonParser.L();
        CoercionAction coercionActionY = y(fVar, strL, LogicalType.f342439i, cls);
        if (coercionActionY == CoercionAction.f341462d) {
            return null;
        }
        if (coercionActionY == CoercionAction.f341463e) {
            return Boolean.FALSE;
        }
        String strTrim = strL.trim();
        int length = strTrim.length();
        if (length == 4) {
            if (N(strTrim)) {
                return Boolean.TRUE;
            }
        } else if (length == 5 && J(strTrim)) {
            return Boolean.FALSE;
        }
        if (z(fVar, strTrim)) {
            return null;
        }
        fVar.I(cls, strTrim, "only \"true\" or \"false\" recognized", new Object[0]);
        throw null;
    }

    public final boolean P(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        if (iG2 == 1) {
            fVar.E(Boolean.TYPE, jsonParser);
            throw null;
        }
        if (iG2 != 3) {
            if (iG2 == 6) {
                String strL = jsonParser.L();
                LogicalType logicalType = LogicalType.f342439i;
                Class cls = Boolean.TYPE;
                CoercionAction coercionActionY = y(fVar, strL, logicalType, cls);
                if (coercionActionY == CoercionAction.f341462d) {
                    e0(fVar);
                    return false;
                }
                if (coercionActionY == CoercionAction.f341463e) {
                    return false;
                }
                String strTrim = strL.trim();
                int length = strTrim.length();
                if (length == 4) {
                    if (N(strTrim)) {
                        return true;
                    }
                } else if (length == 5 && J(strTrim)) {
                    return false;
                }
                if ("null".equals(strTrim)) {
                    f0(fVar, strTrim);
                    return false;
                }
                fVar.I(cls, strTrim, "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized", new Object[0]);
                throw null;
            }
            if (iG2 == 7) {
                return Boolean.TRUE.equals(A(jsonParser, fVar, Boolean.TYPE));
            }
            switch (iG2) {
                case 9:
                    return true;
                case 11:
                    e0(fVar);
                case 10:
                    return false;
            }
        } else if (fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.g0();
            boolean zP2 = P(jsonParser, fVar);
            d0(jsonParser, fVar);
            return zP2;
        }
        fVar.E(Boolean.TYPE, jsonParser);
        throw null;
    }

    public final byte Q(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        Class<?> cls = this.f341716b;
        int iG2 = jsonParser.g();
        if (iG2 == 1) {
            fVar.E(Byte.TYPE, jsonParser);
            throw null;
        }
        if (iG2 != 3) {
            if (iG2 == 11) {
                e0(fVar);
                return (byte) 0;
            }
            CoercionAction coercionAction = CoercionAction.f341463e;
            CoercionAction coercionAction2 = CoercionAction.f341462d;
            if (iG2 == 6) {
                String strL = jsonParser.L();
                CoercionAction coercionActionY = y(fVar, strL, LogicalType.f342437g, Byte.TYPE);
                if (coercionActionY == coercionAction2) {
                    e0(fVar);
                    return (byte) 0;
                }
                if (coercionActionY == coercionAction) {
                    return (byte) 0;
                }
                String strTrim = strL.trim();
                if ("null".equals(strTrim)) {
                    f0(fVar, strTrim);
                    return (byte) 0;
                }
                try {
                    int iB2 = com.fasterxml.jackson.core.io.j.b(strTrim);
                    if (iB2 >= -128 && iB2 <= 255) {
                        return (byte) iB2;
                    }
                    fVar.I(cls, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                    throw null;
                } catch (IllegalArgumentException unused) {
                    fVar.I(cls, strTrim, "not a valid `byte` value", new Object[0]);
                    throw null;
                }
            }
            if (iG2 == 7) {
                return jsonParser.j();
            }
            if (iG2 == 8) {
                CoercionAction coercionActionW = w(jsonParser, fVar, Byte.TYPE);
                if (coercionActionW == coercionAction2 || coercionActionW == coercionAction) {
                    return (byte) 0;
                }
                return jsonParser.j();
            }
        } else if (fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.g0();
            byte bQ2 = Q(jsonParser, fVar);
            d0(jsonParser, fVar);
            return bQ2;
        }
        fVar.B(jsonParser, fVar.l(Byte.TYPE));
        throw null;
    }

    public Date R(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        Class<?> cls = this.f341716b;
        if (iG2 == 1) {
            fVar.E(cls, jsonParser);
            throw null;
        }
        if (iG2 != 3) {
            if (iG2 == 11) {
                return (Date) d(fVar);
            }
            if (iG2 == 6) {
                return S(fVar, jsonParser.L().trim());
            }
            if (iG2 != 7) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            try {
                return new Date(jsonParser.A());
            } catch (StreamReadException unused) {
                fVar.H(cls, jsonParser.D(), "not a valid 64-bit `long` for creating `java.util.Date`", new Object[0]);
                throw null;
            }
        }
        CoercionAction coercionActionN = fVar.n(q(), o(), CoercionInputShape.f341468e);
        boolean zO2 = fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zO2 || coercionActionN != CoercionAction.f341460b) {
            if (jsonParser.g0() == JsonToken.END_ARRAY) {
                int iOrdinal = coercionActionN.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return (Date) d(fVar);
                }
                if (iOrdinal == 3) {
                    return (Date) l(fVar);
                }
            } else if (zO2) {
                Date dateR = R(jsonParser, fVar);
                d0(jsonParser, fVar);
                return dateR;
            }
        }
        fVar.C(fVar.l(cls), JsonToken.START_ARRAY, jsonParser, null, new Object[0]);
        throw null;
    }

    public final Date S(com.fasterxml.jackson.databind.f fVar, String str) throws InvalidFormatException {
        try {
            if (str.isEmpty()) {
                if (x(fVar, str).ordinal() != 3) {
                    return null;
                }
                return new Date(0L);
            }
            if ("null".equals(str)) {
                return null;
            }
            return fVar.R(str);
        } catch (IllegalArgumentException e12) {
            fVar.I(this.f341716b, str, "not a valid representation (error: %s)", com.fasterxml.jackson.databind.util.g.i(e12));
            throw null;
        }
    }

    public final double T(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        if (iG2 == 1) {
            fVar.E(Double.TYPE, jsonParser);
            throw null;
        }
        if (iG2 != 3) {
            if (iG2 == 11) {
                e0(fVar);
                return 0.0d;
            }
            if (iG2 == 6) {
                String strL = jsonParser.L();
                Double dU2 = u(strL);
                if (dU2 != null) {
                    return dU2.doubleValue();
                }
                CoercionAction coercionActionY = y(fVar, strL, LogicalType.f342437g, Double.TYPE);
                if (coercionActionY == CoercionAction.f341462d) {
                    e0(fVar);
                    return 0.0d;
                }
                if (coercionActionY == CoercionAction.f341463e) {
                    return 0.0d;
                }
                String strTrim = strL.trim();
                if ("null".equals(strTrim)) {
                    f0(fVar, strTrim);
                    return 0.0d;
                }
                try {
                    if ("2.2250738585072012e-308".equals(strTrim)) {
                        return Double.MIN_NORMAL;
                    }
                    return Double.parseDouble(strTrim);
                } catch (IllegalArgumentException unused) {
                    fVar.I(Double.TYPE, strTrim, "not a valid `double` value (as String to convert)", new Object[0]);
                    throw null;
                }
            }
            if (iG2 == 7 || iG2 == 8) {
                return jsonParser.u();
            }
        } else if (fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.g0();
            double dT2 = T(jsonParser, fVar);
            d0(jsonParser, fVar);
            return dT2;
        }
        fVar.E(Double.TYPE, jsonParser);
        throw null;
    }

    public final float U(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        if (iG2 == 1) {
            fVar.E(Float.TYPE, jsonParser);
            throw null;
        }
        if (iG2 != 3) {
            if (iG2 == 11) {
                e0(fVar);
                return 0.0f;
            }
            if (iG2 == 6) {
                String strL = jsonParser.L();
                Float fV2 = v(strL);
                if (fV2 != null) {
                    return fV2.floatValue();
                }
                CoercionAction coercionActionY = y(fVar, strL, LogicalType.f342437g, Float.TYPE);
                if (coercionActionY == CoercionAction.f341462d) {
                    e0(fVar);
                    return 0.0f;
                }
                if (coercionActionY == CoercionAction.f341463e) {
                    return 0.0f;
                }
                String strTrim = strL.trim();
                if ("null".equals(strTrim)) {
                    f0(fVar, strTrim);
                    return 0.0f;
                }
                try {
                    return Float.parseFloat(strTrim);
                } catch (IllegalArgumentException unused) {
                    fVar.I(Float.TYPE, strTrim, "not a valid `float` value", new Object[0]);
                    throw null;
                }
            }
            if (iG2 == 7 || iG2 == 8) {
                return jsonParser.y();
            }
        } else if (fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.g0();
            float fU2 = U(jsonParser, fVar);
            d0(jsonParser, fVar);
            return fU2;
        }
        fVar.E(Float.TYPE, jsonParser);
        throw null;
    }

    public final int V(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        if (iG2 == 1) {
            fVar.E(Integer.TYPE, jsonParser);
            throw null;
        }
        if (iG2 != 3) {
            if (iG2 == 11) {
                e0(fVar);
                return 0;
            }
            CoercionAction coercionAction = CoercionAction.f341463e;
            CoercionAction coercionAction2 = CoercionAction.f341462d;
            if (iG2 == 6) {
                String strL = jsonParser.L();
                CoercionAction coercionActionY = y(fVar, strL, LogicalType.f342437g, Integer.TYPE);
                if (coercionActionY == coercionAction2) {
                    e0(fVar);
                    return 0;
                }
                if (coercionActionY == coercionAction) {
                    return 0;
                }
                String strTrim = strL.trim();
                if (!"null".equals(strTrim)) {
                    return W(fVar, strTrim);
                }
                f0(fVar, strTrim);
                return 0;
            }
            if (iG2 == 7) {
                return jsonParser.z();
            }
            if (iG2 == 8) {
                CoercionAction coercionActionW = w(jsonParser, fVar, Integer.TYPE);
                if (coercionActionW == coercionAction2 || coercionActionW == coercionAction) {
                    return 0;
                }
                return jsonParser.R();
            }
        } else if (fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.g0();
            int iV2 = V(jsonParser, fVar);
            d0(jsonParser, fVar);
            return iV2;
        }
        fVar.E(Integer.TYPE, jsonParser);
        throw null;
    }

    public final Integer X(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Class<?> cls) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        boolean z12 = true;
        if (iG2 == 1) {
            fVar.E(cls, jsonParser);
            throw null;
        }
        if (iG2 == 3) {
            return (Integer) E(jsonParser, fVar);
        }
        if (iG2 == 11) {
            return (Integer) d(fVar);
        }
        CoercionAction coercionAction = CoercionAction.f341463e;
        CoercionAction coercionAction2 = CoercionAction.f341462d;
        if (iG2 != 6) {
            if (iG2 == 7) {
                return Integer.valueOf(jsonParser.z());
            }
            if (iG2 == 8) {
                CoercionAction coercionActionW = w(jsonParser, fVar, cls);
                return coercionActionW == coercionAction2 ? (Integer) d(fVar) : coercionActionW == coercionAction ? (Integer) l(fVar) : Integer.valueOf(jsonParser.R());
            }
            fVar.B(jsonParser, n0(fVar));
            throw null;
        }
        String strL = jsonParser.L();
        CoercionAction coercionActionX = x(fVar, strL);
        if (coercionActionX == coercionAction2) {
            return (Integer) d(fVar);
        }
        if (coercionActionX == coercionAction) {
            return (Integer) l(fVar);
        }
        String strTrim = strL.trim();
        if (z(fVar, strTrim)) {
            return (Integer) d(fVar);
        }
        try {
            if (strTrim.length() <= 9) {
                return Integer.valueOf(com.fasterxml.jackson.core.io.j.b(strTrim));
            }
            long jD2 = com.fasterxml.jackson.core.io.j.d(strTrim);
            if (jD2 >= -2147483648L && jD2 <= 2147483647L) {
                z12 = false;
            }
            if (!z12) {
                return Integer.valueOf((int) jD2);
            }
            fVar.I(Integer.class, strTrim, "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)", strTrim, Integer.valueOf(BeduinInputModel.MIN_TEXT_VERSION), Integer.MAX_VALUE);
            throw null;
        } catch (IllegalArgumentException unused) {
            fVar.I(Integer.class, strTrim, "not a valid `java.lang.Integer` value", new Object[0]);
            throw null;
        }
    }

    public final Long Y(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Class<?> cls) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        if (iG2 == 1) {
            fVar.E(cls, jsonParser);
            throw null;
        }
        if (iG2 == 3) {
            return (Long) E(jsonParser, fVar);
        }
        if (iG2 == 11) {
            return (Long) d(fVar);
        }
        CoercionAction coercionAction = CoercionAction.f341463e;
        CoercionAction coercionAction2 = CoercionAction.f341462d;
        if (iG2 != 6) {
            if (iG2 == 7) {
                return Long.valueOf(jsonParser.A());
            }
            if (iG2 == 8) {
                CoercionAction coercionActionW = w(jsonParser, fVar, cls);
                return coercionActionW == coercionAction2 ? (Long) d(fVar) : coercionActionW == coercionAction ? (Long) l(fVar) : Long.valueOf(jsonParser.T());
            }
            fVar.B(jsonParser, n0(fVar));
            throw null;
        }
        String strL = jsonParser.L();
        CoercionAction coercionActionX = x(fVar, strL);
        if (coercionActionX == coercionAction2) {
            return (Long) d(fVar);
        }
        if (coercionActionX == coercionAction) {
            return (Long) l(fVar);
        }
        String strTrim = strL.trim();
        if (z(fVar, strTrim)) {
            return (Long) d(fVar);
        }
        try {
            return Long.valueOf(com.fasterxml.jackson.core.io.j.d(strTrim));
        } catch (IllegalArgumentException unused) {
            fVar.I(Long.class, strTrim, "not a valid `java.lang.Long` value", new Object[0]);
            throw null;
        }
    }

    public final long Z(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        if (iG2 == 1) {
            fVar.E(Long.TYPE, jsonParser);
            throw null;
        }
        if (iG2 != 3) {
            if (iG2 == 11) {
                e0(fVar);
                return 0L;
            }
            CoercionAction coercionAction = CoercionAction.f341463e;
            CoercionAction coercionAction2 = CoercionAction.f341462d;
            if (iG2 == 6) {
                String strL = jsonParser.L();
                CoercionAction coercionActionY = y(fVar, strL, LogicalType.f342437g, Long.TYPE);
                if (coercionActionY == coercionAction2) {
                    e0(fVar);
                    return 0L;
                }
                if (coercionActionY == coercionAction) {
                    return 0L;
                }
                String strTrim = strL.trim();
                if ("null".equals(strTrim)) {
                    f0(fVar, strTrim);
                    return 0L;
                }
                try {
                    return com.fasterxml.jackson.core.io.j.d(strTrim);
                } catch (IllegalArgumentException unused) {
                    fVar.I(Long.TYPE, strTrim, "not a valid `long` value", new Object[0]);
                    throw null;
                }
            }
            if (iG2 == 7) {
                return jsonParser.A();
            }
            if (iG2 == 8) {
                CoercionAction coercionActionW = w(jsonParser, fVar, Long.TYPE);
                if (coercionActionW == coercionAction2 || coercionActionW == coercionAction) {
                    return 0L;
                }
                return jsonParser.T();
            }
        } else if (fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.g0();
            long jZ2 = Z(jsonParser, fVar);
            d0(jsonParser, fVar);
            return jZ2;
        }
        fVar.E(Long.TYPE, jsonParser);
        throw null;
    }

    public final short a0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        if (iG2 == 1) {
            fVar.E(Short.TYPE, jsonParser);
            throw null;
        }
        if (iG2 != 3) {
            if (iG2 == 11) {
                e0(fVar);
                return (short) 0;
            }
            CoercionAction coercionAction = CoercionAction.f341463e;
            CoercionAction coercionAction2 = CoercionAction.f341462d;
            if (iG2 == 6) {
                String strL = jsonParser.L();
                LogicalType logicalType = LogicalType.f342437g;
                Class cls = Short.TYPE;
                CoercionAction coercionActionY = y(fVar, strL, logicalType, cls);
                if (coercionActionY == coercionAction2) {
                    e0(fVar);
                    return (short) 0;
                }
                if (coercionActionY == coercionAction) {
                    return (short) 0;
                }
                String strTrim = strL.trim();
                if ("null".equals(strTrim)) {
                    f0(fVar, strTrim);
                    return (short) 0;
                }
                try {
                    int iB2 = com.fasterxml.jackson.core.io.j.b(strTrim);
                    if (iB2 >= -32768 && iB2 <= 32767) {
                        return (short) iB2;
                    }
                    fVar.I(cls, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                    throw null;
                } catch (IllegalArgumentException unused) {
                    fVar.I(Short.TYPE, strTrim, "not a valid `short` value", new Object[0]);
                    throw null;
                }
            }
            if (iG2 == 7) {
                return jsonParser.J();
            }
            if (iG2 == 8) {
                CoercionAction coercionActionW = w(jsonParser, fVar, Short.TYPE);
                if (coercionActionW == coercionAction2 || coercionActionW == coercionAction) {
                    return (short) 0;
                }
                return jsonParser.J();
            }
        } else if (fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.g0();
            short sA02 = a0(jsonParser, fVar);
            d0(jsonParser, fVar);
            return sA02;
        }
        fVar.B(jsonParser, fVar.l(Short.TYPE));
        throw null;
    }

    public final String b0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        if (jsonParser.Y(JsonToken.VALUE_STRING)) {
            return jsonParser.L();
        }
        if (jsonParser.Y(JsonToken.VALUE_EMBEDDED_OBJECT)) {
            Object objX = jsonParser.x();
            if (objX instanceof byte[]) {
                return fVar.f341921d.f341506c.f341481i.e((byte[]) objX);
            }
            if (objX == null) {
                return null;
            }
            return objX.toString();
        }
        if (jsonParser.Y(JsonToken.START_OBJECT)) {
            fVar.E(this.f341716b, jsonParser);
            throw null;
        }
        String strV = jsonParser.V();
        if (strV != null) {
            return strV;
        }
        fVar.E(String.class, jsonParser);
        throw null;
    }

    public final void c0(com.fasterxml.jackson.databind.f fVar, boolean z12, Enum<?> r52, String str) throws MismatchedInputException {
        fVar.V(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str, C(), z12 ? "enable" : "disable", r52.getDeclaringClass().getSimpleName(), r52.name());
        throw null;
    }

    public final void d0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        if (jsonParser.g0() == JsonToken.END_ARRAY) {
            return;
        }
        o0(fVar);
        throw null;
    }

    public final void e0(com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        if (fVar.O(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            fVar.V(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", C());
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(com.fasterxml.jackson.databind.f fVar, String str) throws MismatchedInputException {
        boolean z12;
        DeserializationFeature deserializationFeature;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (fVar.f341921d.k(mapperFeature)) {
            DeserializationFeature deserializationFeature2 = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!fVar.O(deserializationFeature2)) {
                return;
            }
            z12 = false;
            deserializationFeature = deserializationFeature2;
        } else {
            z12 = true;
            deserializationFeature = mapperFeature;
        }
        c0(fVar, z12, deserializationFeature, str.isEmpty() ? "empty String (\"\")" : AK.c.k("String \"", str, "\""));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.i
    public Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.b(jsonParser, fVar);
    }

    public com.fasterxml.jackson.databind.deser.x l0() {
        return null;
    }

    public com.fasterxml.jackson.databind.h m0() {
        return this.f341717c;
    }

    public final com.fasterxml.jackson.databind.h n0(com.fasterxml.jackson.databind.f fVar) {
        com.fasterxml.jackson.databind.h hVar = this.f341717c;
        return hVar != null ? hVar : fVar.l(this.f341716b);
    }

    @Override // com.fasterxml.jackson.databind.i
    public Class<?> o() {
        return this.f341716b;
    }

    public final void o0(com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        fVar.Y(this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", o().getName());
        throw null;
    }

    public void p0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, String str) throws UnrecognizedPropertyException {
        if (obj == null) {
            obj = o();
        }
        fVar.f341921d.getClass();
        for (com.fasterxml.jackson.databind.util.r<T> rVar = null; rVar != null; rVar = rVar.f342627b) {
            ((com.fasterxml.jackson.databind.deser.n) rVar.f342626a).getClass();
        }
        if (!fVar.O(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            jsonParser.l0();
            return;
        }
        Collection<Object> collectionM = m();
        int i12 = UnrecognizedPropertyException.f341918h;
        String strA = Q.a("Unrecognized field \"", str, "\" (class ", (obj instanceof Class ? obj : obj.getClass()).getName(), "), not marked as ignorable");
        AbstractC43699b abstractC43699b = fVar.f341924g;
        UnrecognizedPropertyException unrecognizedPropertyException = new UnrecognizedPropertyException(abstractC43699b, strA, abstractC43699b.m(), collectionM);
        unrecognizedPropertyException.e(obj, str);
        throw unrecognizedPropertyException;
    }

    public final void t(com.fasterxml.jackson.databind.f fVar, CoercionAction coercionAction, Serializable serializable, String str) throws InvalidFormatException {
        if (coercionAction != CoercionAction.f341460b) {
            return;
        }
        Object[] objArr = {str, C()};
        fVar.getClass();
        throw new InvalidFormatException(fVar.f341924g, String.format("Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", objArr), serializable);
    }

    public final CoercionAction w(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Class<?> cls) throws InvalidFormatException {
        CoercionAction coercionActionN = fVar.n(LogicalType.f342437g, cls, CoercionInputShape.f341466c);
        if (coercionActionN == CoercionAction.f341460b) {
            t(fVar, coercionActionN, jsonParser.D(), "Floating-point value (" + jsonParser.L() + ")");
        }
        return coercionActionN;
    }

    public final CoercionAction x(com.fasterxml.jackson.databind.f fVar, String str) {
        return y(fVar, str, q(), o());
    }

    public final CoercionAction y(com.fasterxml.jackson.databind.f fVar, String str, LogicalType logicalType, Class<?> cls) throws MismatchedInputException {
        if (str.isEmpty()) {
            CoercionAction coercionActionN = fVar.n(logicalType, cls, CoercionInputShape.f341469f);
            t(fVar, coercionActionN, str, "empty String (\"\")");
            return coercionActionN;
        }
        boolean zI2 = I(str);
        CoercionAction coercionAction = CoercionAction.f341460b;
        if (zI2) {
            CoercionAction coercionActionO = fVar.o(logicalType, cls);
            t(fVar, coercionActionO, str, "blank String (all whitespace)");
            return coercionActionO;
        }
        if (fVar.N(StreamReadCapability.UNTYPED_SCALARS)) {
            return CoercionAction.f341461c;
        }
        CoercionAction coercionActionN2 = fVar.n(logicalType, cls, CoercionInputShape.f341467d);
        if (coercionActionN2 != coercionAction) {
            return coercionActionN2;
        }
        fVar.V(this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, C());
        throw null;
    }

    public final boolean z(com.fasterxml.jackson.databind.f fVar, String str) throws MismatchedInputException {
        if (!"null".equals(str)) {
            return false;
        }
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (fVar.f341921d.k(mapperFeature)) {
            return true;
        }
        c0(fVar, true, mapperFeature, "String \"null\"");
        throw null;
    }

    public C(com.fasterxml.jackson.databind.h hVar) {
        this.f341716b = hVar == null ? Object.class : hVar.f341930b;
        this.f341717c = hVar;
    }

    public C(C<?> c12) {
        this.f341716b = c12.f341716b;
        this.f341717c = c12.f341717c;
    }
}
