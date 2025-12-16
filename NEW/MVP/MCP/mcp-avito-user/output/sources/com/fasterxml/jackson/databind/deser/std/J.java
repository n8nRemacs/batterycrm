package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.Collection;
import java.util.Objects;
import rX0.InterfaceC47610a;

/* compiled from: StringCollectionDeserializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public final class J extends AbstractC36455i<Collection<String>> implements com.fasterxml.jackson.databind.deser.i {
    private static final long serialVersionUID = 1;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<String> f341757i;

    /* renamed from: j, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.x f341758j;

    /* renamed from: k, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341759k;

    public J() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public J(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.deser.x xVar, com.fasterxml.jackson.databind.i<?> iVar, com.fasterxml.jackson.databind.i<?> iVar2, com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
        super(hVar, sVar, bool);
        this.f341757i = iVar2;
        this.f341758j = xVar;
        this.f341759k = iVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) throws InvalidDefinitionException {
        com.fasterxml.jackson.databind.i<Object> iVar;
        com.fasterxml.jackson.databind.i<?> iVarA;
        com.fasterxml.jackson.databind.i<Object> iVarP;
        com.fasterxml.jackson.databind.deser.x xVar = this.f341758j;
        if (xVar == null) {
            iVar = null;
        } else {
            if (xVar.A() != null) {
                iVarP = fVar.p(xVar.B(fVar.f341921d), cVar);
            } else {
                if (xVar.E() != null) {
                    iVarP = fVar.p(xVar.F(fVar.f341921d), cVar);
                }
                iVar = null;
            }
            iVar = iVarP;
        }
        com.fasterxml.jackson.databind.h hVarN = this.f341784e.n();
        com.fasterxml.jackson.databind.i<String> iVar2 = this.f341757i;
        if (iVar2 == null) {
            iVarA = C.h0(fVar, cVar, iVar2);
            if (iVarA == null) {
                iVarA = fVar.p(hVarN, cVar);
            }
        } else {
            iVarA = fVar.A(iVar2, cVar, hVarN);
        }
        Boolean boolI0 = C.i0(fVar, cVar, Collection.class, JsonFormat.Feature.f340927b);
        com.fasterxml.jackson.databind.deser.s sVarG0 = C.g0(fVar, cVar, iVarA);
        com.fasterxml.jackson.databind.i<?> iVar3 = com.fasterxml.jackson.databind.util.g.x(iVarA) ? null : iVarA;
        return (Objects.equals(this.f341787h, boolI0) && this.f341785f == sVarG0 && iVar2 == iVar3 && this.f341759k == iVar) ? this : new J(this.f341784e, this.f341758j, iVar, iVar3, sVarG0, boolI0);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        com.fasterxml.jackson.databind.deser.x xVar = this.f341758j;
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341759k;
        return iVar != null ? (Collection) xVar.z(fVar, iVar.e(jsonParser, fVar)) : f(jsonParser, fVar, (Collection) xVar.y(fVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.c(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final com.fasterxml.jackson.databind.deser.x l0() {
        return this.f341758j;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return this.f341757i == null && this.f341759k == null;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342433c;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36455i
    public final com.fasterxml.jackson.databind.i<Object> q0() {
        return this.f341757i;
    }

    @Override // com.fasterxml.jackson.databind.i
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final Collection<String> f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Collection<String> collection) throws JsonMappingException {
        String strE;
        String strB0;
        String strB02;
        boolean zB02 = jsonParser.b0();
        com.fasterxml.jackson.databind.i<String> iVar = this.f341757i;
        com.fasterxml.jackson.databind.deser.s sVar = this.f341785f;
        boolean z12 = this.f341786g;
        if (!zB02) {
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = this.f341787h;
            if (bool2 != bool && (bool2 != null || !fVar.O(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
                if (jsonParser.Y(JsonToken.VALUE_STRING)) {
                    return G(jsonParser, fVar);
                }
                fVar.B(jsonParser, this.f341784e);
                throw null;
            }
            if (jsonParser.f() != JsonToken.VALUE_NULL) {
                try {
                    strB02 = iVar == null ? b0(jsonParser, fVar) : iVar.e(jsonParser, fVar);
                } catch (Exception e12) {
                    throw JsonMappingException.i(e12, collection, collection.size());
                }
            } else {
                if (z12) {
                    return collection;
                }
                strB02 = (String) sVar.d(fVar);
            }
            collection.add(strB02);
            return collection;
        }
        if (iVar != null) {
            while (true) {
                try {
                    if (jsonParser.f0() == null) {
                        JsonToken jsonTokenF = jsonParser.f();
                        if (jsonTokenF == JsonToken.END_ARRAY) {
                            return collection;
                        }
                        if (jsonTokenF != JsonToken.VALUE_NULL) {
                            strE = iVar.e(jsonParser, fVar);
                        } else if (!z12) {
                            strE = (String) sVar.d(fVar);
                        }
                    } else {
                        strE = iVar.e(jsonParser, fVar);
                    }
                    collection.add(strE);
                } catch (Exception e13) {
                    throw JsonMappingException.i(e13, collection, collection.size());
                }
            }
        } else {
            while (true) {
                try {
                    String strF0 = jsonParser.f0();
                    if (strF0 != null) {
                        collection.add(strF0);
                    } else {
                        JsonToken jsonTokenF2 = jsonParser.f();
                        if (jsonTokenF2 == JsonToken.END_ARRAY) {
                            return collection;
                        }
                        if (jsonTokenF2 != JsonToken.VALUE_NULL) {
                            strB0 = b0(jsonParser, fVar);
                        } else if (!z12) {
                            strB0 = (String) sVar.d(fVar);
                        }
                        collection.add(strB0);
                    }
                } catch (Exception e14) {
                    throw JsonMappingException.i(e14, collection, collection.size());
                }
            }
        }
    }
}
