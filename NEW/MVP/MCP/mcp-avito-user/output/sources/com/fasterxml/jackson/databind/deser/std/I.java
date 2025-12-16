package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.util.Objects;
import rX0.InterfaceC47610a;

/* compiled from: StringArrayDeserializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public final class I extends C<String[]> implements com.fasterxml.jackson.databind.deser.i {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f341751i = new String[0];

    /* renamed from: j, reason: collision with root package name */
    public static final I f341752j = new I();
    private static final long serialVersionUID = 2;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<String> f341753e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.s f341754f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f341755g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f341756h;

    public I() {
        this(null, null, null);
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) throws InvalidDefinitionException {
        com.fasterxml.jackson.databind.i<String> iVar = this.f341753e;
        com.fasterxml.jackson.databind.i<?> iVarH0 = C.h0(fVar, cVar, iVar);
        com.fasterxml.jackson.databind.h hVarL = fVar.l(String.class);
        com.fasterxml.jackson.databind.i<?> iVarP = iVarH0 == null ? fVar.p(hVarL, cVar) : fVar.A(iVarH0, cVar, hVarL);
        JsonFormat.Feature feature = JsonFormat.Feature.f340927b;
        JsonFormat.b bVarK0 = C.k0(fVar, cVar, String[].class);
        Boolean boolB = bVarK0 != null ? bVarK0.b(feature) : null;
        com.fasterxml.jackson.databind.deser.s sVarG0 = C.g0(fVar, cVar, iVarP);
        if (iVarP != null && com.fasterxml.jackson.databind.util.g.x(iVarP)) {
            iVarP = null;
        }
        return (iVar == iVarP && Objects.equals(this.f341755g, boolB) && this.f341754f == sVarG0) ? this : new I(iVarP, sVarG0, boolB);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
        int i12;
        if (!jsonParser.b0()) {
            return r0(jsonParser, fVar);
        }
        if (this.f341753e != null) {
            return q0(jsonParser, fVar, null);
        }
        com.fasterxml.jackson.databind.util.v vVarQ = fVar.Q();
        Object[] objArrG = vVarQ.g();
        int i13 = 0;
        while (true) {
            try {
                String strF0 = jsonParser.f0();
                try {
                    if (strF0 == null) {
                        JsonToken jsonTokenF = jsonParser.f();
                        if (jsonTokenF == JsonToken.END_ARRAY) {
                            String[] strArr = (String[]) vVarQ.f(objArrG, i13, String.class);
                            fVar.Z(vVarQ);
                            return strArr;
                        }
                        if (jsonTokenF != JsonToken.VALUE_NULL) {
                            strF0 = b0(jsonParser, fVar);
                        } else if (!this.f341756h) {
                            strF0 = (String) this.f341754f.d(fVar);
                        }
                    }
                    objArrG[i13] = strF0;
                    i13 = i12;
                } catch (Exception e12) {
                    e = e12;
                    i13 = i12;
                    throw JsonMappingException.i(e, objArrG, vVarQ.f342637c + i13);
                }
                if (i13 >= objArrG.length) {
                    objArrG = vVarQ.c(objArrG);
                    i13 = 0;
                }
                i12 = i13 + 1;
            } catch (Exception e13) {
                e = e13;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws JsonMappingException {
        String strF0;
        int i12;
        String[] strArr = (String[]) obj;
        if (!jsonParser.b0()) {
            String[] strArrR0 = r0(jsonParser, fVar);
            if (strArrR0 == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[strArrR0.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrR0, 0, strArr2, length, strArrR0.length);
            return strArr2;
        }
        if (this.f341753e != null) {
            return q0(jsonParser, fVar, strArr);
        }
        com.fasterxml.jackson.databind.util.v vVarQ = fVar.Q();
        int length2 = strArr.length;
        Object[] objArrH = vVarQ.h(length2, strArr);
        while (true) {
            try {
                strF0 = jsonParser.f0();
                if (strF0 == null) {
                    JsonToken jsonTokenF = jsonParser.f();
                    if (jsonTokenF == JsonToken.END_ARRAY) {
                        String[] strArr3 = (String[]) vVarQ.f(objArrH, length2, String.class);
                        fVar.Z(vVarQ);
                        return strArr3;
                    }
                    if (jsonTokenF != JsonToken.VALUE_NULL) {
                        strF0 = b0(jsonParser, fVar);
                    } else {
                        if (this.f341756h) {
                            objArrH = f341751i;
                            return objArrH;
                        }
                        strF0 = (String) this.f341754f.d(fVar);
                    }
                }
                if (length2 >= objArrH.length) {
                    objArrH = vVarQ.c(objArrH);
                    length2 = 0;
                }
                i12 = length2 + 1;
            } catch (Exception e12) {
                e = e12;
            }
            try {
                objArrH[length2] = strF0;
                length2 = i12;
            } catch (Exception e13) {
                e = e13;
                length2 = i12;
                throw JsonMappingException.i(e, objArrH, vVarQ.f342637c + length2);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.c(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final AccessPattern k() {
        return AccessPattern.f342525c;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return f341751i;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342432b;
    }

    public final String[] q0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, String[] strArr) throws JsonMappingException {
        int length;
        Object[] objArrH;
        String strF0;
        com.fasterxml.jackson.databind.i<String> iVar;
        String strE;
        int i12;
        com.fasterxml.jackson.databind.util.v vVarQ = fVar.Q();
        if (strArr == null) {
            objArrH = vVarQ.g();
            length = 0;
        } else {
            length = strArr.length;
            objArrH = vVarQ.h(length, strArr);
        }
        while (true) {
            try {
                strF0 = jsonParser.f0();
                iVar = this.f341753e;
            } catch (Exception e12) {
                e = e12;
            }
            try {
                if (strF0 == null) {
                    JsonToken jsonTokenF = jsonParser.f();
                    if (jsonTokenF == JsonToken.END_ARRAY) {
                        String[] strArr2 = (String[]) vVarQ.f(objArrH, length, String.class);
                        fVar.Z(vVarQ);
                        return strArr2;
                    }
                    if (jsonTokenF != JsonToken.VALUE_NULL) {
                        strE = iVar.e(jsonParser, fVar);
                    } else if (!this.f341756h) {
                        strE = (String) this.f341754f.d(fVar);
                    }
                } else {
                    strE = iVar.e(jsonParser, fVar);
                }
                objArrH[length] = strE;
                length = i12;
            } catch (Exception e13) {
                e = e13;
                length = i12;
                throw JsonMappingException.i(e, String.class, length);
            }
            if (length >= objArrH.length) {
                objArrH = vVarQ.c(objArrH);
                length = 0;
            }
            i12 = length + 1;
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.TRUE;
    }

    public final String[] r0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f341755g;
        if (bool2 == bool || (bool2 == null && fVar.O(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return new String[]{jsonParser.Y(JsonToken.VALUE_NULL) ? (String) this.f341754f.d(fVar) : b0(jsonParser, fVar)};
        }
        if (jsonParser.Y(JsonToken.VALUE_STRING)) {
            return G(jsonParser, fVar);
        }
        fVar.E(this.f341716b, jsonParser);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I(com.fasterxml.jackson.databind.i<?> iVar, com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
        super((Class<?>) String[].class);
        this.f341753e = iVar;
        this.f341754f = sVar;
        this.f341755g = bool;
        this.f341756h = com.fasterxml.jackson.databind.deser.impl.q.a(sVar);
    }
}
