package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.impl.C36442a;
import com.fasterxml.jackson.databind.deser.impl.C36444c;
import com.fasterxml.jackson.databind.deser.impl.E;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: BuilderBasedDeserializer.java */
/* loaded from: classes4.dex */
public class h extends d {
    private static final long serialVersionUID = 1;

    /* renamed from: A, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341586A;

    /* renamed from: z, reason: collision with root package name */
    public final C36472k f341587z;

    /* compiled from: BuilderBasedDeserializer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341588a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f341588a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341588a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341588a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(e eVar, com.fasterxml.jackson.databind.b bVar, com.fasterxml.jackson.databind.h hVar, C36444c c36444c, HashMap map, HashSet hashSet, boolean z12, HashSet hashSet2, boolean z13) {
        super(eVar, bVar, c36444c, map, hashSet, z12, hashSet2, z13);
        this.f341586A = hVar;
        this.f341587z = eVar.f341583m;
        if (this.f341570x == null) {
            return;
        }
        throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + bVar.f341454a + ")");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final Object E(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341555i;
        if (iVar != null || (iVar = this.f341554h) != null) {
            Object objX = this.f341553g.x(fVar, iVar.e(jsonParser, fVar));
            if (this.f341560n != null) {
                G0(fVar, objX);
            }
            return S0(fVar, objX);
        }
        CoercionAction coercionActionN = fVar.n(LogicalType.f342435e, o(), CoercionInputShape.f341468e);
        boolean zO2 = fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zO2 || coercionActionN != CoercionAction.f341460b) {
            JsonToken jsonTokenG0 = jsonParser.g0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenG0 == jsonToken) {
                int iOrdinal = coercionActionN.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return null;
                }
                if (iOrdinal == 3) {
                    return l(fVar);
                }
                fVar.C(n0(fVar), JsonToken.START_ARRAY, jsonParser, null, new Object[0]);
                throw null;
            }
            if (zO2) {
                Object objE = e(jsonParser, fVar);
                if (jsonParser.g0() == jsonToken) {
                    return objE;
                }
                o0(fVar);
                throw null;
            }
        }
        fVar.B(jsonParser, n0(fVar));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final d H0(C36444c c36444c) {
        return new h(this, c36444c);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final d I0(Set<String> set, Set<String> set2) {
        return new h(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final d J0() {
        return new h(this);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final d K0(com.fasterxml.jackson.databind.deser.impl.s sVar) {
        return new h(this, sVar);
    }

    public final Object P0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        boolean z12 = this.f341557k;
        E[] eArr = this.f341560n;
        C36444c c36444c = this.f341559m;
        x xVar = this.f341553g;
        if (!z12) {
            Object objY = xVar.y(fVar);
            if (eArr != null) {
                G0(fVar, objY);
            }
            if (this.f341565s) {
                fVar.getClass();
            }
            while (jsonParser.f() == JsonToken.FIELD_NAME) {
                String strD = jsonParser.d();
                jsonParser.g0();
                v vVarE = c36444c.e(strD);
                if (vVarE != null) {
                    try {
                        objY = vVarE.i(jsonParser, fVar, objY);
                    } catch (Exception e12) {
                        d.L0(fVar, e12, objY, strD);
                        throw null;
                    }
                } else {
                    F0(jsonParser, fVar, objY, strD);
                }
                jsonParser.g0();
            }
            return objY;
        }
        if (this.f341568v == null) {
            if (this.f341569w == null) {
                return A0(jsonParser, fVar);
            }
            if (this.f341556j == null) {
                return Q0(jsonParser, fVar, xVar.y(fVar));
            }
            fVar.i(String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", this.f341586A));
            throw null;
        }
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341554h;
        if (iVar != null) {
            return xVar.z(fVar, iVar.e(jsonParser, fVar));
        }
        com.fasterxml.jackson.databind.deser.impl.v vVar = this.f341556j;
        Set<String> set = this.f341563q;
        Set<String> set2 = this.f341562p;
        if (vVar == null) {
            C cK2 = fVar.k(jsonParser);
            cK2.e0();
            Object objY2 = xVar.y(fVar);
            if (eArr != null) {
                G0(fVar, objY2);
            }
            while (jsonParser.f() == JsonToken.FIELD_NAME) {
                String strD2 = jsonParser.d();
                jsonParser.g0();
                v vVarE2 = c36444c.e(strD2);
                if (vVarE2 != null) {
                    try {
                        objY2 = vVarE2.i(jsonParser, fVar, objY2);
                    } catch (Exception e13) {
                        d.L0(fVar, e13, objY2, strD2);
                        throw null;
                    }
                } else if (com.fasterxml.jackson.databind.util.n.b(strD2, set2, set)) {
                    C0(jsonParser, fVar, objY2, strD2);
                } else {
                    cK2.G(strD2);
                    cK2.y0(jsonParser);
                    u uVar = this.f341561o;
                    if (uVar != null) {
                        try {
                            uVar.b(jsonParser, fVar, objY2, strD2);
                        } catch (Exception e14) {
                            d.L0(fVar, e14, objY2, strD2);
                            throw null;
                        }
                    } else {
                        continue;
                    }
                }
                jsonParser.g0();
            }
            cK2.B();
            this.f341568v.a(fVar, objY2, cK2);
            return objY2;
        }
        com.fasterxml.jackson.databind.deser.impl.y yVarD = vVar.d(jsonParser, fVar, this.f341570x);
        C cK3 = fVar.k(jsonParser);
        cK3.e0();
        JsonToken jsonTokenF = jsonParser.f();
        while (jsonTokenF == JsonToken.FIELD_NAME) {
            String strD3 = jsonParser.d();
            jsonParser.g0();
            v vVarC = vVar.c(strD3);
            if (!yVarD.f(strD3) || vVarC != null) {
                com.fasterxml.jackson.databind.h hVar = this.f341551e;
                if (vVarC == null) {
                    v vVarE3 = c36444c.e(strD3);
                    if (vVarE3 != null) {
                        yVarD.e(vVarE3, vVarE3.g(jsonParser, fVar));
                    } else if (com.fasterxml.jackson.databind.util.n.b(strD3, set2, set)) {
                        C0(jsonParser, fVar, hVar.f341930b, strD3);
                    } else {
                        cK3.G(strD3);
                        cK3.y0(jsonParser);
                        u uVar2 = this.f341561o;
                        if (uVar2 != null) {
                            yVarD.c(uVar2, strD3, uVar2.a(jsonParser, fVar));
                        }
                    }
                } else if (yVarD.b(vVarC, vVarC.g(jsonParser, fVar))) {
                    jsonParser.g0();
                    try {
                        Object objA = vVar.a(fVar, yVarD);
                        return objA.getClass() != hVar.f341930b ? D0(jsonParser, fVar, objA, cK3) : R0(jsonParser, fVar, objA, cK3);
                    } catch (Exception e15) {
                        d.L0(fVar, e15, hVar.f341930b, strD3);
                        throw null;
                    }
                }
            }
            jsonTokenF = jsonParser.g0();
        }
        cK3.B();
        try {
            Object objA2 = vVar.a(fVar, yVarD);
            this.f341568v.a(fVar, objA2, cK3);
            return objA2;
        } catch (Exception e16) {
            O0(e16, fVar);
            throw null;
        }
    }

    public final Object Q0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IOException {
        if (this.f341565s) {
            fVar.getClass();
        }
        com.fasterxml.jackson.databind.deser.impl.g gVar = this.f341569w;
        gVar.getClass();
        com.fasterxml.jackson.databind.deser.impl.g gVar2 = new com.fasterxml.jackson.databind.deser.impl.g(gVar);
        JsonToken jsonTokenF = jsonParser.f();
        while (jsonTokenF == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            JsonToken jsonTokenG0 = jsonParser.g0();
            v vVarE = this.f341559m.e(strD);
            if (vVarE != null) {
                if (jsonTokenG0.f341103i) {
                    gVar2.f(jsonParser, fVar, obj, strD);
                }
                try {
                    obj = vVarE.i(jsonParser, fVar, obj);
                } catch (Exception e12) {
                    d.L0(fVar, e12, obj, strD);
                    throw null;
                }
            } else if (com.fasterxml.jackson.databind.util.n.b(strD, this.f341562p, this.f341563q)) {
                C0(jsonParser, fVar, obj, strD);
            } else if (gVar2.e(jsonParser, fVar, obj, strD)) {
                continue;
            } else {
                u uVar = this.f341561o;
                if (uVar != null) {
                    try {
                        uVar.b(jsonParser, fVar, obj, strD);
                    } catch (Exception e13) {
                        d.L0(fVar, e13, obj, strD);
                        throw null;
                    }
                } else {
                    p0(jsonParser, fVar, obj, strD);
                }
            }
            jsonTokenF = jsonParser.g0();
        }
        gVar2.d(jsonParser, fVar, obj);
        return obj;
    }

    public final Object R0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, C c12) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (this.f341565s) {
            fVar.getClass();
        }
        JsonToken jsonTokenF = jsonParser.f();
        while (jsonTokenF == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            v vVarE = this.f341559m.e(strD);
            jsonParser.g0();
            if (vVarE != null) {
                try {
                    obj = vVarE.i(jsonParser, fVar, obj);
                } catch (Exception e12) {
                    d.L0(fVar, e12, obj, strD);
                    throw null;
                }
            } else if (com.fasterxml.jackson.databind.util.n.b(strD, this.f341562p, this.f341563q)) {
                C0(jsonParser, fVar, obj, strD);
            } else {
                c12.G(strD);
                c12.y0(jsonParser);
                u uVar = this.f341561o;
                if (uVar != null) {
                    uVar.b(jsonParser, fVar, obj, strD);
                }
            }
            jsonTokenF = jsonParser.g0();
        }
        c12.B();
        this.f341568v.a(fVar, obj, c12);
        return obj;
    }

    public final Object S0(com.fasterxml.jackson.databind.f fVar, Object obj) throws IOException {
        C36472k c36472k = this.f341587z;
        if (c36472k == null) {
            return obj;
        }
        try {
            return c36472k.f342054e.invoke(obj, null);
        } catch (Exception e12) {
            O0(e12, fVar);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        if (!jsonParser.c0()) {
            switch (jsonParser.g()) {
                case 2:
                case 5:
                    return S0(fVar, P0(jsonParser, fVar));
                case 3:
                    return E(jsonParser, fVar);
                case 4:
                case 11:
                default:
                    fVar.B(jsonParser, n0(fVar));
                    throw null;
                case 6:
                    return S0(fVar, B0(jsonParser, fVar));
                case 7:
                    return S0(fVar, y0(jsonParser, fVar));
                case 8:
                    return S0(fVar, x0(jsonParser, fVar));
                case 9:
                case 10:
                    return S0(fVar, w0(jsonParser, fVar));
                case 12:
                    return jsonParser.x();
            }
        }
        jsonParser.g0();
        if (!this.f341558l) {
            return S0(fVar, P0(jsonParser, fVar));
        }
        Object objY = this.f341553g.y(fVar);
        while (jsonParser.f() == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            jsonParser.g0();
            v vVarE = this.f341559m.e(strD);
            if (vVarE != null) {
                try {
                    objY = vVarE.i(jsonParser, fVar, objY);
                } catch (Exception e12) {
                    d.L0(fVar, e12, objY, strD);
                    throw null;
                }
            } else {
                F0(jsonParser, fVar, objY, strD);
            }
            jsonParser.g0();
        }
        return S0(fVar, objY);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws InvalidDefinitionException {
        Class<?> cls = this.f341551e.f341930b;
        Class<?> cls2 = obj.getClass();
        boolean zIsAssignableFrom = cls.isAssignableFrom(cls2);
        com.fasterxml.jackson.databind.h hVar = this.f341586A;
        if (zIsAssignableFrom) {
            fVar.i(String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", hVar, cls.getName()));
            throw null;
        }
        fVar.i(String.format("Deserialization of %s by passing existing instance (of %s) not supported", hVar, cls2.getName()));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.d, com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final Object r0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        com.fasterxml.jackson.databind.deser.impl.v vVar = this.f341556j;
        com.fasterxml.jackson.databind.deser.impl.y yVarD = vVar.d(jsonParser, fVar, this.f341570x);
        boolean z12 = this.f341565s;
        if (z12) {
            fVar.getClass();
        }
        JsonToken jsonTokenF = jsonParser.f();
        C cK2 = null;
        while (true) {
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            com.fasterxml.jackson.databind.h hVar = this.f341551e;
            if (jsonTokenF != jsonToken) {
                try {
                    Object objA = vVar.a(fVar, yVarD);
                    if (cK2 != null) {
                        if (objA.getClass() != hVar.f341930b) {
                            return D0(null, fVar, objA, cK2);
                        }
                        E0(fVar, objA, cK2);
                    }
                    return objA;
                } catch (Exception e12) {
                    O0(e12, fVar);
                    throw null;
                }
            }
            String strD = jsonParser.d();
            jsonParser.g0();
            v vVarC = vVar.c(strD);
            if (!yVarD.f(strD) || vVarC != null) {
                C36444c c36444c = this.f341559m;
                if (vVarC == null) {
                    v vVarE = c36444c.e(strD);
                    if (vVarE != null) {
                        yVarD.e(vVarE, vVarE.g(jsonParser, fVar));
                    } else if (com.fasterxml.jackson.databind.util.n.b(strD, this.f341562p, this.f341563q)) {
                        C0(jsonParser, fVar, hVar.f341930b, strD);
                    } else {
                        u uVar = this.f341561o;
                        if (uVar != null) {
                            yVarD.c(uVar, strD, uVar.a(jsonParser, fVar));
                        } else {
                            if (cK2 == null) {
                                cK2 = fVar.k(jsonParser);
                            }
                            cK2.G(strD);
                            cK2.y0(jsonParser);
                        }
                    }
                } else if (yVarD.b(vVarC, vVarC.g(jsonParser, fVar))) {
                    jsonParser.g0();
                    try {
                        Object objA2 = vVar.a(fVar, yVarD);
                        if (objA2.getClass() != hVar.f341930b) {
                            return D0(jsonParser, fVar, objA2, cK2);
                        }
                        if (cK2 != null) {
                            E0(fVar, objA2, cK2);
                        }
                        if (this.f341560n != null) {
                            G0(fVar, objA2);
                        }
                        if (this.f341568v != null) {
                            if (jsonParser.Y(JsonToken.START_OBJECT)) {
                                jsonParser.g0();
                            }
                            C cK3 = fVar.k(jsonParser);
                            cK3.e0();
                            return R0(jsonParser, fVar, objA2, cK3);
                        }
                        if (this.f341569w != null) {
                            return Q0(jsonParser, fVar, objA2);
                        }
                        if (z12) {
                            fVar.getClass();
                        }
                        JsonToken jsonTokenF2 = jsonParser.f();
                        if (jsonTokenF2 == JsonToken.START_OBJECT) {
                            jsonTokenF2 = jsonParser.g0();
                        }
                        while (jsonTokenF2 == JsonToken.FIELD_NAME) {
                            String strD2 = jsonParser.d();
                            jsonParser.g0();
                            v vVarE2 = c36444c.e(strD2);
                            if (vVarE2 != null) {
                                try {
                                    objA2 = vVarE2.i(jsonParser, fVar, objA2);
                                } catch (Exception e13) {
                                    d.L0(fVar, e13, objA2, strD2);
                                    throw null;
                                }
                            } else {
                                F0(jsonParser, fVar, objA2, strD2);
                            }
                            jsonTokenF2 = jsonParser.g0();
                        }
                        return objA2;
                    } catch (Exception e14) {
                        d.L0(fVar, e14, hVar.f341930b, strD);
                        throw null;
                    }
                }
            }
            jsonTokenF = jsonParser.g0();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.d, com.fasterxml.jackson.databind.i
    public final com.fasterxml.jackson.databind.i<Object> s(com.fasterxml.jackson.databind.util.t tVar) {
        return new h(this, tVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final d v0() {
        return new C36442a(this, this.f341586A, this.f341559m.f341608g, this.f341587z);
    }

    public h(h hVar) {
        super((d) hVar, true);
        this.f341587z = hVar.f341587z;
        this.f341586A = hVar.f341586A;
    }

    public h(h hVar, com.fasterxml.jackson.databind.util.t tVar) {
        super(hVar, tVar);
        this.f341587z = hVar.f341587z;
        this.f341586A = hVar.f341586A;
    }

    public h(h hVar, com.fasterxml.jackson.databind.deser.impl.s sVar) {
        super(hVar, sVar);
        this.f341587z = hVar.f341587z;
        this.f341586A = hVar.f341586A;
    }

    public h(h hVar, Set<String> set, Set<String> set2) {
        super(hVar, set, set2);
        this.f341587z = hVar.f341587z;
        this.f341586A = hVar.f341586A;
    }

    public h(h hVar, C36444c c36444c) {
        super(hVar, c36444c);
        this.f341587z = hVar.f341587z;
        this.f341586A = hVar.f341586A;
    }
}
