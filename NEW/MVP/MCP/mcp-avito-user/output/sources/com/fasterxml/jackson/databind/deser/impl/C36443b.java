package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.IOException;
import java.util.Set;

/* compiled from: BeanAsArrayDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.impl.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36443b extends com.fasterxml.jackson.databind.deser.d {
    private static final long serialVersionUID = 1;

    /* renamed from: A, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.v[] f341601A;

    /* renamed from: z, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.d f341602z;

    public C36443b(com.fasterxml.jackson.databind.deser.d dVar, com.fasterxml.jackson.databind.deser.v[] vVarArr) {
        super(dVar);
        this.f341602z = dVar;
        this.f341601A = vVarArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final com.fasterxml.jackson.databind.deser.d H0(C36444c c36444c) {
        return new C36443b(this.f341602z.H0(c36444c), this.f341601A);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final com.fasterxml.jackson.databind.deser.d I0(Set<String> set, Set<String> set2) {
        return new C36443b(this.f341602z.I0(set, set2), this.f341601A);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final com.fasterxml.jackson.databind.deser.d J0() {
        return new C36443b(this.f341602z.J0(), this.f341601A);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final com.fasterxml.jackson.databind.deser.d K0(s sVar) {
        return new C36443b(this.f341602z.K0(sVar), this.f341601A);
    }

    public final void P0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        fVar.C(n0(fVar), jsonParser.f(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", com.fasterxml.jackson.databind.util.g.t(this.f341551e), jsonParser.f());
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        if (!jsonParser.b0()) {
            P0(jsonParser, fVar);
            throw null;
        }
        boolean z12 = this.f341558l;
        boolean z13 = this.f341564r;
        int i12 = 0;
        com.fasterxml.jackson.databind.deser.v[] vVarArr = this.f341601A;
        com.fasterxml.jackson.databind.deser.x xVar = this.f341553g;
        if (!z12) {
            if (this.f341557k) {
                return A0(jsonParser, fVar);
            }
            Object objY = xVar.y(fVar);
            jsonParser.k0(objY);
            if (this.f341560n != null) {
                G0(fVar, objY);
            }
            if (this.f341565s) {
                fVar.getClass();
            }
            int length = vVarArr.length;
            while (true) {
                JsonToken jsonTokenG0 = jsonParser.g0();
                JsonToken jsonToken = JsonToken.END_ARRAY;
                if (jsonTokenG0 == jsonToken) {
                    break;
                }
                if (i12 != length) {
                    com.fasterxml.jackson.databind.deser.v vVar = vVarArr[i12];
                    i12++;
                    if (vVar != null) {
                        try {
                            vVar.h(jsonParser, fVar, objY);
                        } catch (Exception e12) {
                            com.fasterxml.jackson.databind.deser.d.L0(fVar, e12, objY, vVar.f341896d.f342656b);
                            throw null;
                        }
                    } else {
                        jsonParser.l0();
                    }
                } else {
                    if (!z13) {
                        fVar.Y(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                        throw null;
                    }
                    do {
                        jsonParser.l0();
                    } while (jsonParser.g0() != JsonToken.END_ARRAY);
                }
            }
            return objY;
        }
        Object objY2 = xVar.y(fVar);
        jsonParser.k0(objY2);
        int length2 = vVarArr.length;
        while (true) {
            JsonToken jsonTokenG02 = jsonParser.g0();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            if (jsonTokenG02 == jsonToken2) {
                return objY2;
            }
            if (i12 == length2) {
                if (!z13 && fVar.O(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    fVar.Y(this, jsonToken2, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                    throw null;
                }
                do {
                    jsonParser.l0();
                } while (jsonParser.g0() != JsonToken.END_ARRAY);
                return objY2;
            }
            com.fasterxml.jackson.databind.deser.v vVar2 = vVarArr[i12];
            if (vVar2 != null) {
                try {
                    vVar2.h(jsonParser, fVar, objY2);
                } catch (Exception e13) {
                    com.fasterxml.jackson.databind.deser.d.L0(fVar, e13, objY2, vVar2.f341896d.f342656b);
                    throw null;
                }
            } else {
                jsonParser.l0();
            }
            i12++;
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IOException {
        jsonParser.k0(obj);
        if (!jsonParser.b0()) {
            P0(jsonParser, fVar);
            throw null;
        }
        if (this.f341560n != null) {
            G0(fVar, obj);
        }
        com.fasterxml.jackson.databind.deser.v[] vVarArr = this.f341601A;
        int length = vVarArr.length;
        int i12 = 0;
        while (true) {
            JsonToken jsonTokenG0 = jsonParser.g0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenG0 == jsonToken) {
                return obj;
            }
            if (i12 == length) {
                if (!this.f341564r && fVar.O(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    fVar.Y(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                    throw null;
                }
                do {
                    jsonParser.l0();
                } while (jsonParser.g0() != JsonToken.END_ARRAY);
                return obj;
            }
            com.fasterxml.jackson.databind.deser.v vVar = vVarArr[i12];
            if (vVar != null) {
                try {
                    vVar.h(jsonParser, fVar, obj);
                } catch (Exception e12) {
                    com.fasterxml.jackson.databind.deser.d.L0(fVar, e12, obj, vVar.f341896d.f342656b);
                    throw null;
                }
            } else {
                jsonParser.l0();
            }
            i12++;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final Object r0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        com.fasterxml.jackson.databind.h hVar = this.f341551e;
        v vVar = this.f341556j;
        y yVarD = vVar.d(jsonParser, fVar, this.f341570x);
        com.fasterxml.jackson.databind.deser.v[] vVarArr = this.f341601A;
        int length = vVarArr.length;
        if (this.f341565s) {
            fVar.getClass();
        }
        int i12 = 0;
        Object objA = null;
        while (jsonParser.g0() != JsonToken.END_ARRAY) {
            com.fasterxml.jackson.databind.deser.v vVar2 = i12 < length ? vVarArr[i12] : null;
            if (vVar2 == null) {
                jsonParser.l0();
            } else {
                com.fasterxml.jackson.databind.v vVar3 = vVar2.f341896d;
                if (objA != null) {
                    try {
                        vVar2.h(jsonParser, fVar, objA);
                    } catch (Exception e12) {
                        com.fasterxml.jackson.databind.deser.d.L0(fVar, e12, objA, vVar3.f342656b);
                        throw null;
                    }
                } else {
                    String str = vVar3.f342656b;
                    com.fasterxml.jackson.databind.deser.v vVarC = vVar.c(str);
                    if (!yVarD.f(str) || vVarC != null) {
                        if (vVarC == null) {
                            yVarD.e(vVar2, vVar2.g(jsonParser, fVar));
                        } else if (yVarD.b(vVarC, vVarC.g(jsonParser, fVar))) {
                            try {
                                objA = vVar.a(fVar, yVarD);
                                jsonParser.k0(objA);
                                if (objA.getClass() != hVar.f341930b) {
                                    fVar.i("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type " + com.fasterxml.jackson.databind.util.g.t(hVar) + ", actual type " + com.fasterxml.jackson.databind.util.g.o(objA));
                                    throw null;
                                }
                            } catch (Exception e13) {
                                com.fasterxml.jackson.databind.deser.d.L0(fVar, e13, hVar.f341930b, str);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            i12++;
        }
        if (objA != null) {
            return objA;
        }
        try {
            return vVar.a(fVar, yVarD);
        } catch (Exception e14) {
            O0(e14, fVar);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.d, com.fasterxml.jackson.databind.i
    public final com.fasterxml.jackson.databind.i<Object> s(com.fasterxml.jackson.databind.util.t tVar) {
        return this.f341602z.s(tVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final com.fasterxml.jackson.databind.deser.d v0() {
        return this;
    }
}
