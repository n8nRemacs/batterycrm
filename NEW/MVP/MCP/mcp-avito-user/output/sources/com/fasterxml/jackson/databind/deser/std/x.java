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
import java.lang.reflect.Array;
import java.util.Objects;
import rX0.InterfaceC47610a;

/* compiled from: ObjectArrayDeserializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class x extends AbstractC36455i<Object[]> implements com.fasterxml.jackson.databind.deser.i {
    private static final long serialVersionUID = 1;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f341871i;

    /* renamed from: j, reason: collision with root package name */
    public final Class<?> f341872j;

    /* renamed from: k, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341873k;

    /* renamed from: l, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.l f341874l;

    /* renamed from: m, reason: collision with root package name */
    public final Object[] f341875m;

    public x(com.fasterxml.jackson.databind.type.a aVar, com.fasterxml.jackson.databind.i iVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        super(aVar, (com.fasterxml.jackson.databind.deser.s) null, (Boolean) null);
        Class<?> cls = aVar.f342447k.f341930b;
        this.f341872j = cls;
        this.f341871i = cls == Object.class;
        this.f341873k = iVar;
        this.f341874l = lVar;
        this.f341875m = (Object[]) aVar.f342448l;
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) throws InvalidDefinitionException {
        com.fasterxml.jackson.databind.h hVar = this.f341784e;
        Boolean boolI0 = C.i0(fVar, cVar, hVar.f341930b, JsonFormat.Feature.f340927b);
        com.fasterxml.jackson.databind.i<?> iVar = this.f341873k;
        com.fasterxml.jackson.databind.i<?> iVarH0 = C.h0(fVar, cVar, iVar);
        com.fasterxml.jackson.databind.h hVarN = hVar.n();
        com.fasterxml.jackson.databind.i<?> iVarP = iVarH0 == null ? fVar.p(hVarN, cVar) : fVar.A(iVarH0, cVar, hVarN);
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341874l;
        com.fasterxml.jackson.databind.jsontype.l lVarF = lVar != null ? lVar.f(cVar) : lVar;
        com.fasterxml.jackson.databind.deser.s sVarG0 = C.g0(fVar, cVar, iVarP);
        return (Objects.equals(boolI0, this.f341787h) && sVarG0 == this.f341785f && iVarP == iVar && lVarF == lVar) ? this : new x(this, iVarP, lVarF, sVarG0, boolI0);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
        Object objE;
        int i12;
        if (!jsonParser.b0()) {
            return s0(jsonParser, fVar);
        }
        com.fasterxml.jackson.databind.util.v vVarQ = fVar.Q();
        Object[] objArrG = vVarQ.g();
        int i13 = 0;
        while (true) {
            try {
                JsonToken jsonTokenG0 = jsonParser.g0();
                if (jsonTokenG0 == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                        com.fasterxml.jackson.databind.i<Object> iVar = this.f341873k;
                        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341874l;
                        objE = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
                    } else if (!this.f341786g) {
                        objE = this.f341785f.d(fVar);
                    }
                    objArrG[i13] = objE;
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
        Object[] objArrE = this.f341871i ? vVarQ.e(i13, objArrG) : vVarQ.f(objArrG, i13, this.f341872j);
        fVar.Z(vVarQ);
        return objArrE;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws JsonMappingException {
        Object objE;
        int i12;
        Object[] objArr = (Object[]) obj;
        if (!jsonParser.b0()) {
            Object[] objArrS0 = s0(jsonParser, fVar);
            if (objArrS0 == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[objArrS0.length + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(objArrS0, 0, objArr2, length, objArrS0.length);
            return objArr2;
        }
        com.fasterxml.jackson.databind.util.v vVarQ = fVar.Q();
        int length2 = objArr.length;
        Object[] objArrH = vVarQ.h(length2, objArr);
        while (true) {
            try {
                JsonToken jsonTokenG0 = jsonParser.g0();
                if (jsonTokenG0 == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                        com.fasterxml.jackson.databind.i<Object> iVar = this.f341873k;
                        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341874l;
                        objE = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
                    } else if (!this.f341786g) {
                        objE = this.f341785f.d(fVar);
                    }
                    objArrH[length2] = objE;
                    length2 = i12;
                } catch (Exception e12) {
                    e = e12;
                    length2 = i12;
                    throw JsonMappingException.i(e, objArrH, vVarQ.f342637c + length2);
                }
                if (length2 >= objArrH.length) {
                    objArrH = vVarQ.c(objArrH);
                    length2 = 0;
                }
                i12 = length2 + 1;
            } catch (Exception e13) {
                e = e13;
            }
        }
        Object[] objArrE = this.f341871i ? vVarQ.e(length2, objArrH) : vVarQ.f(objArrH, length2, this.f341872j);
        fVar.Z(vVarQ);
        return objArrE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return (Object[]) lVar.c(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36455i, com.fasterxml.jackson.databind.i
    public final AccessPattern k() {
        return AccessPattern.f342525c;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36455i, com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return this.f341875m;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return this.f341873k == null && this.f341874l == null;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342432b;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36455i
    public final com.fasterxml.jackson.databind.i<Object> q0() {
        return this.f341873k;
    }

    public final Object[] s0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        Object objE;
        Boolean bool = Boolean.TRUE;
        Class<?> cls = this.f341872j;
        Boolean bool2 = this.f341787h;
        if (bool2 == bool || (bool2 == null && fVar.O(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (!jsonParser.Y(JsonToken.VALUE_NULL)) {
                com.fasterxml.jackson.databind.i<Object> iVar = this.f341873k;
                com.fasterxml.jackson.databind.jsontype.l lVar = this.f341874l;
                objE = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
            } else {
                if (this.f341786g) {
                    return this.f341875m;
                }
                objE = this.f341785f.d(fVar);
            }
            Object[] objArr = this.f341871i ? new Object[1] : (Object[]) Array.newInstance(cls, 1);
            objArr[0] = objE;
            return objArr;
        }
        if (!jsonParser.Y(JsonToken.VALUE_STRING)) {
            fVar.B(jsonParser, this.f341784e);
            throw null;
        }
        if (cls != Byte.class) {
            return G(jsonParser, fVar);
        }
        byte[] bArrI = jsonParser.i(fVar.f341921d.f341506c.f341481i);
        Byte[] bArr = new Byte[bArrI.length];
        int length = bArrI.length;
        for (int i12 = 0; i12 < length; i12++) {
            bArr[i12] = Byte.valueOf(bArrI[i12]);
        }
        return bArr;
    }

    public x(x xVar, com.fasterxml.jackson.databind.i<Object> iVar, com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
        super(xVar, sVar, bool);
        this.f341872j = xVar.f341872j;
        this.f341871i = xVar.f341871i;
        this.f341875m = xVar.f341875m;
        this.f341873k = iVar;
        this.f341874l = lVar;
    }
}
