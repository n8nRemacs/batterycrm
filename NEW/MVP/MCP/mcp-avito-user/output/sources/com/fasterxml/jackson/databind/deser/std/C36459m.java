package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.EnumMap;

/* compiled from: EnumMapDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36459m extends AbstractC36455i<EnumMap<?, ?>> implements com.fasterxml.jackson.databind.deser.i, com.fasterxml.jackson.databind.deser.t {
    private static final long serialVersionUID = 1;

    /* renamed from: i, reason: collision with root package name */
    public final Class<?> f341801i;

    /* renamed from: j, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.m f341802j;

    /* renamed from: k, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341803k;

    /* renamed from: l, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.l f341804l;

    /* renamed from: m, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.x f341805m;

    /* renamed from: n, reason: collision with root package name */
    public com.fasterxml.jackson.databind.i<Object> f341806n;

    /* renamed from: o, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.impl.v f341807o;

    public C36459m(com.fasterxml.jackson.databind.type.g gVar, com.fasterxml.jackson.databind.deser.x xVar, com.fasterxml.jackson.databind.i iVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        super(gVar, (com.fasterxml.jackson.databind.deser.s) null, (Boolean) null);
        this.f341801i = gVar.f342456k.f341930b;
        this.f341802j = null;
        this.f341803k = iVar;
        this.f341804l = lVar;
        this.f341805m = xVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) throws InvalidDefinitionException {
        com.fasterxml.jackson.databind.m mVar = this.f341802j;
        com.fasterxml.jackson.databind.h hVar = this.f341784e;
        com.fasterxml.jackson.databind.m mVarR = mVar == null ? fVar.r(hVar.r(), cVar) : mVar;
        com.fasterxml.jackson.databind.h hVarN = hVar.n();
        com.fasterxml.jackson.databind.i<?> iVar = this.f341803k;
        com.fasterxml.jackson.databind.i<?> iVarP = iVar == null ? fVar.p(hVarN, cVar) : fVar.A(iVar, cVar, hVarN);
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341804l;
        com.fasterxml.jackson.databind.jsontype.l lVarF = lVar != null ? lVar.f(cVar) : lVar;
        com.fasterxml.jackson.databind.deser.s sVarG0 = C.g0(fVar, cVar, iVarP);
        return (mVarR == mVar && sVarG0 == this.f341785f && iVarP == iVar && lVarF == lVar) ? this : new C36459m(this, mVarR, iVarP, lVarF, sVarG0);
    }

    @Override // com.fasterxml.jackson.databind.deser.t
    public final void c(com.fasterxml.jackson.databind.f fVar) throws InvalidDefinitionException {
        com.fasterxml.jackson.databind.deser.x xVar = this.f341805m;
        if (xVar != null) {
            boolean zL2 = xVar.l();
            com.fasterxml.jackson.databind.h hVar = this.f341784e;
            if (zL2) {
                com.fasterxml.jackson.databind.h hVarF = xVar.F(fVar.f341921d);
                if (hVarF != null) {
                    this.f341806n = fVar.p(hVarF, null);
                    return;
                } else {
                    fVar.i(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", hVar, xVar.getClass().getName()));
                    throw null;
                }
            }
            if (xVar.i()) {
                com.fasterxml.jackson.databind.h hVarB = xVar.B(fVar.f341921d);
                if (hVarB != null) {
                    this.f341806n = fVar.p(hVarB, null);
                    return;
                } else {
                    fVar.i(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", hVar, xVar.getClass().getName()));
                    throw null;
                }
            }
            if (xVar.g()) {
                this.f341807o = com.fasterxml.jackson.databind.deser.impl.v.b(fVar, xVar, xVar.G(fVar.f341921d), fVar.f341921d.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        Object objE;
        com.fasterxml.jackson.databind.deser.impl.v vVar = this.f341807o;
        if (vVar == null) {
            com.fasterxml.jackson.databind.i<Object> iVar = this.f341806n;
            if (iVar != null) {
                return (EnumMap) this.f341805m.z(fVar, iVar.e(jsonParser, fVar));
            }
            int iG2 = jsonParser.g();
            if (iG2 != 1 && iG2 != 2) {
                if (iG2 == 3) {
                    return E(jsonParser, fVar);
                }
                if (iG2 != 5) {
                    if (iG2 == 6) {
                        return G(jsonParser, fVar);
                    }
                    fVar.B(jsonParser, n0(fVar));
                    throw null;
                }
            }
            EnumMap<?, ?> enumMapS0 = s0(fVar);
            t0(jsonParser, fVar, enumMapS0);
            return enumMapS0;
        }
        com.fasterxml.jackson.databind.deser.impl.y yVarD = vVar.d(jsonParser, fVar, null);
        String strE0 = jsonParser.c0() ? jsonParser.e0() : jsonParser.Y(JsonToken.FIELD_NAME) ? jsonParser.d() : null;
        while (true) {
            com.fasterxml.jackson.databind.h hVar = this.f341784e;
            if (strE0 == null) {
                try {
                    return (EnumMap) vVar.a(fVar, yVarD);
                } catch (Exception e12) {
                    AbstractC36455i.r0(fVar, e12, hVar.f341930b, strE0);
                    throw null;
                }
            }
            JsonToken jsonTokenG0 = jsonParser.g0();
            com.fasterxml.jackson.databind.deser.v vVarC = vVar.c(strE0);
            if (vVarC == null) {
                Enum r62 = (Enum) this.f341802j.a(fVar, strE0);
                if (r62 != null) {
                    try {
                        if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                            com.fasterxml.jackson.databind.jsontype.l lVar = this.f341804l;
                            com.fasterxml.jackson.databind.i<Object> iVar2 = this.f341803k;
                            objE = lVar == null ? iVar2.e(jsonParser, fVar) : iVar2.g(jsonParser, fVar, lVar);
                        } else if (!this.f341786g) {
                            objE = this.f341785f.d(fVar);
                        }
                        yVarD.d(r62, objE);
                    } catch (Exception e13) {
                        AbstractC36455i.r0(fVar, e13, hVar.f341930b, strE0);
                        throw null;
                    }
                } else {
                    if (!fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        fVar.I(this.f341801i, strE0, "value not one of declared Enum instance names for %s", hVar.r());
                        throw null;
                    }
                    jsonParser.g0();
                    jsonParser.l0();
                }
            } else if (yVarD.b(vVarC, vVarC.g(jsonParser, fVar))) {
                jsonParser.g0();
                try {
                    EnumMap enumMap = (EnumMap) vVar.a(fVar, yVarD);
                    t0(jsonParser, fVar, enumMap);
                    return enumMap;
                } catch (Exception e14) {
                    AbstractC36455i.r0(fVar, e14, hVar.f341930b, strE0);
                    throw null;
                }
            }
            strE0 = jsonParser.e0();
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final /* bridge */ /* synthetic */ Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IOException {
        EnumMap enumMap = (EnumMap) obj;
        t0(jsonParser, fVar, enumMap);
        return enumMap;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.d(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36455i, com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return s0(fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final com.fasterxml.jackson.databind.deser.x l0() {
        return this.f341805m;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return this.f341803k == null && this.f341802j == null && this.f341804l == null;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342434d;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36455i
    public final com.fasterxml.jackson.databind.i<Object> q0() {
        return this.f341803k;
    }

    public final EnumMap<?, ?> s0(com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
        com.fasterxml.jackson.databind.deser.x xVar = this.f341805m;
        if (xVar == null) {
            return new EnumMap<>(this.f341801i);
        }
        try {
            if (xVar.k()) {
                return (EnumMap) xVar.y(fVar);
            }
            fVar.y(this.f341716b, xVar, "no default constructor found", new Object[0]);
            throw null;
        } catch (IOException e12) {
            com.fasterxml.jackson.databind.util.g.C(fVar, e12);
            throw null;
        }
    }

    public final void t0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, EnumMap enumMap) throws IOException {
        String strD;
        Object objE;
        jsonParser.k0(enumMap);
        if (jsonParser.c0()) {
            strD = jsonParser.e0();
        } else {
            JsonToken jsonTokenF = jsonParser.f();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenF != jsonToken) {
                if (jsonTokenF == JsonToken.END_OBJECT) {
                    return;
                }
                fVar.Y(this, jsonToken, null, new Object[0]);
                throw null;
            }
            strD = jsonParser.d();
        }
        while (strD != null) {
            Enum r22 = (Enum) this.f341802j.a(fVar, strD);
            JsonToken jsonTokenG0 = jsonParser.g0();
            if (r22 != null) {
                try {
                    if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                        com.fasterxml.jackson.databind.i<Object> iVar = this.f341803k;
                        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341804l;
                        objE = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
                    } else if (!this.f341786g) {
                        objE = this.f341785f.d(fVar);
                    }
                    enumMap.put((EnumMap) r22, (Enum) objE);
                } catch (Exception e12) {
                    AbstractC36455i.r0(fVar, e12, enumMap, strD);
                    throw null;
                }
            } else {
                if (!fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    fVar.I(this.f341801i, strD, "value not one of declared Enum instance names for %s", this.f341784e.r());
                    throw null;
                }
                jsonParser.l0();
            }
            strD = jsonParser.e0();
        }
    }

    public C36459m(C36459m c36459m, com.fasterxml.jackson.databind.m mVar, com.fasterxml.jackson.databind.i<?> iVar, com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.deser.s sVar) {
        super(c36459m, sVar, c36459m.f341787h);
        this.f341801i = c36459m.f341801i;
        this.f341802j = mVar;
        this.f341803k = iVar;
        this.f341804l = lVar;
        this.f341805m = c36459m.f341805m;
        this.f341806n = c36459m.f341806n;
        this.f341807o = c36459m.f341807o;
    }
}
