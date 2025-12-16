package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.C36472k;
import java.io.Closeable;
import java.io.IOException;
import java.util.Set;

/* compiled from: BeanAsArrayBuilderDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.impl.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36442a extends com.fasterxml.jackson.databind.deser.d {
    private static final long serialVersionUID = 1;

    /* renamed from: A, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.v[] f341597A;

    /* renamed from: B, reason: collision with root package name */
    public final C36472k f341598B;

    /* renamed from: C, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341599C;

    /* renamed from: z, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.d f341600z;

    public C36442a(com.fasterxml.jackson.databind.deser.d dVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.deser.v[] vVarArr, C36472k c36472k) {
        super(dVar);
        this.f341600z = dVar;
        this.f341599C = hVar;
        this.f341597A = vVarArr;
        this.f341598B = c36472k;
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final com.fasterxml.jackson.databind.deser.d H0(C36444c c36444c) {
        return new C36442a(this.f341600z.H0(c36444c), this.f341599C, this.f341597A, this.f341598B);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final com.fasterxml.jackson.databind.deser.d I0(Set<String> set, Set<String> set2) {
        return new C36442a(this.f341600z.I0(set, set2), this.f341599C, this.f341597A, this.f341598B);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final com.fasterxml.jackson.databind.deser.d J0() {
        return new C36442a(this.f341600z.J0(), this.f341599C, this.f341597A, this.f341598B);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final com.fasterxml.jackson.databind.deser.d K0(s sVar) {
        return new C36442a(this.f341600z.K0(sVar), this.f341599C, this.f341597A, this.f341598B);
    }

    public final Object P0(com.fasterxml.jackson.databind.f fVar, Object obj) throws IOException {
        try {
            return this.f341598B.f342054e.invoke(obj, null);
        } catch (Exception e12) {
            O0(e12, fVar);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        Object objA0;
        boolean zB02 = jsonParser.b0();
        com.fasterxml.jackson.databind.h hVar = this.f341551e;
        if (!zB02) {
            fVar.C(n0(fVar), jsonParser.f(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", hVar.f341930b.getName(), jsonParser.f());
            throw null;
        }
        boolean z12 = this.f341558l;
        boolean z13 = this.f341564r;
        int i12 = 0;
        com.fasterxml.jackson.databind.deser.v[] vVarArr = this.f341597A;
        com.fasterxml.jackson.databind.deser.x xVar = this.f341553g;
        if (z12) {
            Object objY = xVar.y(fVar);
            int length = vVarArr.length;
            while (jsonParser.g0() != JsonToken.END_ARRAY) {
                if (i12 == length) {
                    if (z13 || !fVar.O(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        while (jsonParser.g0() != JsonToken.END_ARRAY) {
                            jsonParser.l0();
                        }
                        return P0(fVar, objY);
                    }
                    Class<?> cls = hVar.f341930b;
                    throw new MismatchedInputException((Closeable) fVar.f341924g, String.format("Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length)));
                }
                com.fasterxml.jackson.databind.deser.v vVar = vVarArr[i12];
                if (vVar != null) {
                    try {
                        objY = vVar.i(jsonParser, fVar, objY);
                    } catch (Exception e12) {
                        com.fasterxml.jackson.databind.deser.d.L0(fVar, e12, objY, vVar.f341896d.f342656b);
                        throw null;
                    }
                } else {
                    jsonParser.l0();
                }
                i12++;
            }
            return P0(fVar, objY);
        }
        if (this.f341557k) {
            objA0 = A0(jsonParser, fVar);
        } else {
            Object objY2 = xVar.y(fVar);
            if (this.f341560n != null) {
                G0(fVar, objY2);
            }
            if (this.f341565s) {
                fVar.getClass();
            }
            int length2 = vVarArr.length;
            while (true) {
                JsonToken jsonTokenG0 = jsonParser.g0();
                JsonToken jsonToken = JsonToken.END_ARRAY;
                if (jsonTokenG0 == jsonToken) {
                    break;
                }
                if (i12 != length2) {
                    com.fasterxml.jackson.databind.deser.v vVar2 = vVarArr[i12];
                    i12++;
                    if (vVar2 != null) {
                        try {
                            vVar2.i(jsonParser, fVar, objY2);
                        } catch (Exception e13) {
                            com.fasterxml.jackson.databind.deser.d.L0(fVar, e13, objY2, vVar2.f341896d.f342656b);
                            throw null;
                        }
                    } else {
                        jsonParser.l0();
                    }
                } else {
                    if (!z13 && fVar.O(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        fVar.Y(this, jsonToken, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                        throw null;
                    }
                    while (jsonParser.g0() != JsonToken.END_ARRAY) {
                        jsonParser.l0();
                    }
                }
            }
            objA0 = objY2;
        }
        return P0(fVar, objA0);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        return this.f341600z.f(jsonParser, fVar, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.d, com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final Object r0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        com.fasterxml.jackson.databind.h hVar = this.f341551e;
        v vVar = this.f341556j;
        y yVarD = vVar.d(jsonParser, fVar, this.f341570x);
        com.fasterxml.jackson.databind.deser.v[] vVarArr = this.f341597A;
        int length = vVarArr.length;
        if (this.f341565s) {
            fVar.getClass();
        }
        int i12 = 0;
        Object objI = null;
        while (jsonParser.g0() != JsonToken.END_ARRAY) {
            com.fasterxml.jackson.databind.deser.v vVar2 = i12 < length ? vVarArr[i12] : null;
            if (vVar2 == null) {
                jsonParser.l0();
            } else {
                com.fasterxml.jackson.databind.v vVar3 = vVar2.f341896d;
                if (objI != null) {
                    try {
                        objI = vVar2.i(jsonParser, fVar, objI);
                    } catch (Exception e12) {
                        com.fasterxml.jackson.databind.deser.d.L0(fVar, e12, objI, vVar3.f342656b);
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
                                objI = vVar.a(fVar, yVarD);
                                if (objI.getClass() != hVar.f341930b) {
                                    fVar.i("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type " + com.fasterxml.jackson.databind.util.g.t(hVar) + ", actual type " + objI.getClass().getName());
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
        if (objI != null) {
            return objI;
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
        return this.f341600z.s(tVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final com.fasterxml.jackson.databind.deser.d v0() {
        return this;
    }
}
