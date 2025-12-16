package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.ArrayList;
import java.util.Objects;
import rX0.InterfaceC47610a;

/* compiled from: EnumDeserializer.java */
@InterfaceC47610a
/* renamed from: com.fasterxml.jackson.databind.deser.std.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36458l extends G<Object> implements com.fasterxml.jackson.databind.deser.i {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f341794e;

    /* renamed from: f, reason: collision with root package name */
    public final Enum<?> f341795f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.util.h f341796g;

    /* renamed from: h, reason: collision with root package name */
    public com.fasterxml.jackson.databind.util.h f341797h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f341798i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f341799j;

    /* compiled from: EnumDeserializer.java */
    /* renamed from: com.fasterxml.jackson.databind.deser.std.l$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341800a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f341800a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341800a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341800a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C36458l(com.fasterxml.jackson.databind.util.j jVar, Boolean bool) {
        super(jVar.f342612b);
        this.f341796g = jVar.b();
        this.f341794e = jVar.f342613c;
        this.f341795f = jVar.f342615e;
        this.f341798i = bool;
        this.f341799j = jVar.f342617g;
    }

    public static com.fasterxml.jackson.databind.i r0(com.fasterxml.jackson.databind.e eVar, Class cls, C36472k c36472k, H h12, com.fasterxml.jackson.databind.deser.v[] vVarArr) {
        eVar.getClass();
        if (eVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            com.fasterxml.jackson.databind.util.g.e(c36472k.f342054e, eVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new C36461o(cls, c36472k, c36472k.u(0), h12, vVarArr);
    }

    public static com.fasterxml.jackson.databind.i<?> s0(com.fasterxml.jackson.databind.e eVar, Class<?> cls, C36472k c36472k) {
        eVar.getClass();
        if (eVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            com.fasterxml.jackson.databind.util.g.e(c36472k.f342054e, eVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new C36461o(cls, c36472k);
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) {
        Boolean boolI0 = C.i0(fVar, cVar, this.f341716b, JsonFormat.Feature.f340928c);
        Boolean bool = this.f341798i;
        if (boolI0 == null) {
            boolI0 = bool;
        }
        return Objects.equals(bool, boolI0) ? this : new C36458l(this, boolI0);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        if (jsonParser.Y(JsonToken.VALUE_STRING)) {
            return q0(fVar, jsonParser.L());
        }
        boolean zY2 = jsonParser.Y(JsonToken.VALUE_NUMBER_INT);
        Class<?> cls = this.f341716b;
        if (!zY2) {
            if (jsonParser.c0()) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            if (jsonParser.Y(JsonToken.START_ARRAY)) {
                return E(jsonParser, fVar);
            }
            fVar.E(cls, jsonParser);
            throw null;
        }
        if (this.f341799j) {
            return q0(fVar, jsonParser.L());
        }
        int iZ2 = jsonParser.z();
        CoercionAction coercionActionN = fVar.n(LogicalType.f342440j, cls, CoercionInputShape.f341465b);
        if (coercionActionN == CoercionAction.f341460b) {
            if (fVar.O(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                fVar.H(cls, Integer.valueOf(iZ2), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
                throw null;
            }
            t(fVar, coercionActionN, Integer.valueOf(iZ2), androidx.camera.camera2.internal.G.e(iZ2, "Integer value (", ")"));
        }
        int iOrdinal = coercionActionN.ordinal();
        if (iOrdinal == 2) {
            return null;
        }
        Enum<?> r42 = this.f341795f;
        if (iOrdinal != 3) {
            Object[] objArr = this.f341794e;
            if (iZ2 >= 0 && iZ2 < objArr.length) {
                return objArr[iZ2];
            }
            if (r42 == null || !fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                if (fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return null;
                }
                fVar.H(cls, Integer.valueOf(iZ2), "index value outside legal index range [0..%s]", Integer.valueOf(objArr.length - 1));
                throw null;
            }
        }
        return r42;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return this.f341795f;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342440j;
    }

    public final Object q0(com.fasterxml.jackson.databind.f fVar, String str) throws InvalidFormatException, NumberFormatException {
        com.fasterxml.jackson.databind.util.h hVarB;
        char cCharAt;
        Object obj;
        CoercionAction coercionActionO;
        Object objA;
        if (fVar.O(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
            hVarB = this.f341797h;
            if (hVarB == null) {
                synchronized (this) {
                    hVarB = com.fasterxml.jackson.databind.util.j.c(fVar.f341921d, this.f341716b).b();
                }
                this.f341797h = hVarB;
            }
        } else {
            hVarB = this.f341796g;
        }
        Object objA2 = hVarB.a(str);
        if (objA2 != null) {
            return objA2;
        }
        String strTrim = str.trim();
        if (strTrim != str && (objA = hVarB.a(strTrim)) != null) {
            return objA;
        }
        String strTrim2 = strTrim.trim();
        boolean zIsEmpty = strTrim2.isEmpty();
        Enum<?> r32 = this.f341795f;
        if (!zIsEmpty) {
            boolean zEquals = Boolean.TRUE.equals(this.f341798i);
            Class<?> cls = this.f341716b;
            if (zEquals) {
                Object[] objArr = hVarB.f342611d;
                int length = objArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        obj = null;
                        break;
                    }
                    Object obj2 = objArr[i12];
                    if (obj2 != null && ((String) obj2).equalsIgnoreCase(strTrim2)) {
                        obj = objArr[i12 + 1];
                        break;
                    }
                    i12 += 2;
                }
                if (obj != null) {
                    return obj;
                }
            } else if (!fVar.O(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && !this.f341799j && (cCharAt = strTrim2.charAt(0)) >= '0' && cCharAt <= '9') {
                try {
                    int i13 = Integer.parseInt(strTrim2);
                    if (!fVar.f341921d.k(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                        fVar.I(cls, strTrim2, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                        throw null;
                    }
                    if (i13 >= 0) {
                        Object[] objArr2 = this.f341794e;
                        if (i13 < objArr2.length) {
                            return objArr2[i13];
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (r32 != null && fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return r32;
            }
            if (!fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                Object[] objArr3 = hVarB.f342611d;
                int length2 = objArr3.length;
                ArrayList arrayList = new ArrayList(length2 >> 2);
                for (int i14 = 0; i14 < length2; i14 += 2) {
                    Object obj3 = objArr3[i14];
                    if (obj3 != null) {
                        arrayList.add((String) obj3);
                    }
                }
                fVar.I(cls, strTrim2, "not one of the values accepted for Enum class: %s", arrayList);
                throw null;
            }
        } else {
            if (r32 != null && fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return r32;
            }
            if (!fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                boolean zIsEmpty2 = strTrim.isEmpty();
                LogicalType logicalType = LogicalType.f342440j;
                if (zIsEmpty2) {
                    coercionActionO = fVar.n(logicalType, this.f341716b, CoercionInputShape.f341469f);
                    t(fVar, coercionActionO, strTrim, "empty String (\"\")");
                } else {
                    coercionActionO = fVar.o(logicalType, this.f341716b);
                    t(fVar, coercionActionO, strTrim, "blank String (all whitespace)");
                }
                int iOrdinal = coercionActionO.ordinal();
                if (iOrdinal == 1 || iOrdinal == 3) {
                    return r32;
                }
            }
        }
        return null;
    }

    public C36458l(C36458l c36458l, Boolean bool) {
        super(c36458l);
        this.f341796g = c36458l.f341796g;
        this.f341794e = c36458l.f341794e;
        this.f341795f = c36458l.f341795f;
        this.f341798i = bool;
        this.f341799j = c36458l.f341799j;
    }
}
