package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.z;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import rX0.InterfaceC47610a;

/* compiled from: MapDeserializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class t extends AbstractC36455i<Map<Object, Object>> implements com.fasterxml.jackson.databind.deser.i, com.fasterxml.jackson.databind.deser.t {
    private static final long serialVersionUID = 1;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.m f341826i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f341827j;

    /* renamed from: k, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341828k;

    /* renamed from: l, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.l f341829l;

    /* renamed from: m, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.x f341830m;

    /* renamed from: n, reason: collision with root package name */
    public com.fasterxml.jackson.databind.i<Object> f341831n;

    /* renamed from: o, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.impl.v f341832o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f341833p;

    /* renamed from: q, reason: collision with root package name */
    public Set<String> f341834q;

    /* renamed from: r, reason: collision with root package name */
    public Set<String> f341835r;

    /* renamed from: s, reason: collision with root package name */
    public n.a f341836s;

    /* compiled from: MapDeserializer.java */
    public static class a extends z.a {

        /* renamed from: b, reason: collision with root package name */
        public final b f341837b;

        /* renamed from: c, reason: collision with root package name */
        public final LinkedHashMap f341838c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f341839d;

        public a(b bVar, UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            super(unresolvedForwardReference);
            this.f341838c = new LinkedHashMap();
            this.f341837b = bVar;
            this.f341839d = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.z.a
        public final void a(Object obj, Object obj2) {
            b bVar = this.f341837b;
            Iterator it = bVar.f341841b.iterator();
            Map<Object, Object> map = bVar.f341840a;
            while (it.hasNext()) {
                a aVar = (a) it.next();
                boolean zEquals = obj.equals(aVar.f341700a.f341520f.f341697b.f340903d);
                LinkedHashMap linkedHashMap = aVar.f341838c;
                if (zEquals) {
                    it.remove();
                    map.put(aVar.f341839d, obj2);
                    map.putAll(linkedHashMap);
                    return;
                }
                map = linkedHashMap;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    /* compiled from: MapDeserializer.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<Object, Object> f341840a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f341841b = new ArrayList();

        public b(Class<?> cls, Map<Object, Object> map) {
            this.f341840a = map;
        }

        public final void a(Object obj, Object obj2) {
            ArrayList arrayList = this.f341841b;
            if (arrayList.isEmpty()) {
                this.f341840a.put(obj, obj2);
            } else {
                ((a) androidx.appcompat.app.r.j(1, arrayList)).f341838c.put(obj, obj2);
            }
        }
    }

    public t(com.fasterxml.jackson.databind.type.g gVar, com.fasterxml.jackson.databind.deser.x xVar, com.fasterxml.jackson.databind.m mVar, com.fasterxml.jackson.databind.i iVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        super(gVar, (com.fasterxml.jackson.databind.deser.s) null, (Boolean) null);
        this.f341826i = mVar;
        this.f341828k = iVar;
        this.f341829l = lVar;
        this.f341830m = xVar;
        this.f341833p = xVar.k();
        this.f341831n = null;
        this.f341832o = null;
        this.f341827j = s0(gVar, mVar);
        this.f341836s = null;
    }

    public static boolean s0(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.m mVar) {
        com.fasterxml.jackson.databind.h hVarR;
        if (mVar == null || (hVarR = hVar.r()) == null) {
            return true;
        }
        Class<?> cls = hVarR.f341930b;
        return (cls == String.class || cls == Object.class) && com.fasterxml.jackson.databind.util.g.x(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4 A[PHI: r3
  0x00c4: PHI (r3v3 java.util.Set<java.lang.String>) = 
  (r3v2 java.util.Set<java.lang.String>)
  (r3v2 java.util.Set<java.lang.String>)
  (r3v2 java.util.Set<java.lang.String>)
  (r3v5 java.util.Set<java.lang.String>)
  (r3v5 java.util.Set<java.lang.String>)
 binds: [B:24:0x004d, B:25:0x004f, B:27:0x0055, B:44:0x0094, B:46:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fasterxml.jackson.databind.deser.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f r13, com.fasterxml.jackson.databind.c r14) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.t.a(com.fasterxml.jackson.databind.f, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.i");
    }

    @Override // com.fasterxml.jackson.databind.deser.t
    public final void c(com.fasterxml.jackson.databind.f fVar) throws InvalidDefinitionException {
        com.fasterxml.jackson.databind.deser.x xVar = this.f341830m;
        boolean zL2 = xVar.l();
        com.fasterxml.jackson.databind.h hVar = this.f341784e;
        if (zL2) {
            com.fasterxml.jackson.databind.h hVarF = xVar.F(fVar.f341921d);
            if (hVarF == null) {
                fVar.i(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", hVar, xVar.getClass().getName()));
                throw null;
            }
            this.f341831n = fVar.p(hVarF, null);
        } else if (xVar.i()) {
            com.fasterxml.jackson.databind.h hVarB = xVar.B(fVar.f341921d);
            if (hVarB == null) {
                fVar.i(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", hVar, xVar.getClass().getName()));
                throw null;
            }
            this.f341831n = fVar.p(hVarB, null);
        }
        if (xVar.g()) {
            this.f341832o = com.fasterxml.jackson.databind.deser.impl.v.b(fVar, xVar, xVar.G(fVar.f341921d), fVar.f341921d.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this.f341827j = s0(hVar, this.f341826i);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        String strD;
        Object objE;
        Object objE2;
        com.fasterxml.jackson.databind.deser.impl.v vVar = this.f341832o;
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341829l;
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341828k;
        com.fasterxml.jackson.databind.deser.s sVar = this.f341785f;
        boolean z12 = this.f341786g;
        com.fasterxml.jackson.databind.h hVar = this.f341784e;
        if (vVar != null) {
            com.fasterxml.jackson.databind.deser.impl.y yVarD = vVar.d(jsonParser, fVar, null);
            String strE0 = jsonParser.c0() ? jsonParser.e0() : jsonParser.Y(JsonToken.FIELD_NAME) ? jsonParser.d() : null;
            while (strE0 != null) {
                JsonToken jsonTokenG0 = jsonParser.g0();
                n.a aVar = this.f341836s;
                if (aVar == null || !aVar.a(strE0)) {
                    com.fasterxml.jackson.databind.deser.v vVarC = vVar.c(strE0);
                    if (vVarC == null) {
                        Object objA = this.f341826i.a(fVar, strE0);
                        try {
                            if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                                objE2 = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
                            } else if (!z12) {
                                objE2 = sVar.d(fVar);
                            }
                            yVarD.d(objA, objE2);
                        } catch (Exception e12) {
                            AbstractC36455i.r0(fVar, e12, hVar.f341930b, strE0);
                            throw null;
                        }
                    } else if (yVarD.b(vVarC, vVarC.g(jsonParser, fVar))) {
                        jsonParser.g0();
                        try {
                            Map<Object, Object> map = (Map) vVar.a(fVar, yVarD);
                            t0(jsonParser, fVar, map);
                            return map;
                        } catch (Exception e13) {
                            AbstractC36455i.r0(fVar, e13, hVar.f341930b, strE0);
                            throw null;
                        }
                    }
                } else {
                    jsonParser.l0();
                }
                strE0 = jsonParser.e0();
            }
            try {
                return (Map) vVar.a(fVar, yVarD);
            } catch (Exception e14) {
                AbstractC36455i.r0(fVar, e14, hVar.f341930b, strE0);
                throw null;
            }
        }
        com.fasterxml.jackson.databind.i<Object> iVar2 = this.f341831n;
        com.fasterxml.jackson.databind.deser.x xVar = this.f341830m;
        if (iVar2 != null) {
            return (Map) xVar.z(fVar, iVar2.e(jsonParser, fVar));
        }
        if (!this.f341833p) {
            fVar.y(hVar.f341930b, xVar, "no default constructor found", new Object[0]);
            throw null;
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
        Map<Object, Object> map2 = (Map) xVar.y(fVar);
        if (!this.f341827j) {
            t0(jsonParser, fVar, map2);
            return map2;
        }
        boolean z13 = iVar.n() != null;
        b bVar = z13 ? new b(hVar.n().f341930b, map2) : null;
        if (jsonParser.c0()) {
            strD = jsonParser.e0();
        } else {
            JsonToken jsonTokenF = jsonParser.f();
            if (jsonTokenF == JsonToken.END_OBJECT) {
                return map2;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenF != jsonToken) {
                fVar.Y(this, jsonToken, null, new Object[0]);
                throw null;
            }
            strD = jsonParser.d();
        }
        while (strD != null) {
            JsonToken jsonTokenG02 = jsonParser.g0();
            n.a aVar2 = this.f341836s;
            if (aVar2 == null || !aVar2.a(strD)) {
                try {
                    if (jsonTokenG02 != JsonToken.VALUE_NULL) {
                        objE = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
                    } else if (!z12) {
                        objE = sVar.d(fVar);
                    }
                    if (z13) {
                        bVar.a(strD, objE);
                    } else {
                        map2.put(strD, objE);
                    }
                } catch (UnresolvedForwardReference e15) {
                    u0(fVar, bVar, strD, e15);
                } catch (Exception e16) {
                    AbstractC36455i.r0(fVar, e16, map2, strD);
                    throw null;
                }
            } else {
                jsonParser.l0();
            }
            strD = jsonParser.e0();
        }
        return map2;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IOException {
        String strD;
        String strD2;
        Map map = (Map) obj;
        jsonParser.k0(map);
        JsonToken jsonTokenF = jsonParser.f();
        if (jsonTokenF != JsonToken.START_OBJECT && jsonTokenF != JsonToken.FIELD_NAME) {
            fVar.E(this.f341784e.f341930b, jsonParser);
            throw null;
        }
        boolean z12 = this.f341827j;
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341829l;
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341828k;
        com.fasterxml.jackson.databind.deser.s sVar = this.f341785f;
        boolean z13 = this.f341786g;
        if (z12) {
            if (jsonParser.c0()) {
                strD2 = jsonParser.e0();
            } else {
                JsonToken jsonTokenF2 = jsonParser.f();
                if (jsonTokenF2 != JsonToken.END_OBJECT) {
                    JsonToken jsonToken = JsonToken.FIELD_NAME;
                    if (jsonTokenF2 != jsonToken) {
                        fVar.Y(this, jsonToken, null, new Object[0]);
                        throw null;
                    }
                    strD2 = jsonParser.d();
                }
            }
            while (strD2 != null) {
                JsonToken jsonTokenG0 = jsonParser.g0();
                n.a aVar = this.f341836s;
                if (aVar == null || !aVar.a(strD2)) {
                    try {
                        if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                            Object obj2 = map.get(strD2);
                            Object objF = obj2 != null ? lVar == null ? iVar.f(jsonParser, fVar, obj2) : iVar.h(jsonParser, fVar, lVar) : lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
                            if (objF != obj2) {
                                map.put(strD2, objF);
                            }
                        } else if (!z13) {
                            map.put(strD2, sVar.d(fVar));
                        }
                    } catch (Exception e12) {
                        AbstractC36455i.r0(fVar, e12, map, strD2);
                        throw null;
                    }
                } else {
                    jsonParser.l0();
                }
                strD2 = jsonParser.e0();
            }
        } else {
            if (jsonParser.c0()) {
                strD = jsonParser.e0();
            } else {
                JsonToken jsonTokenF3 = jsonParser.f();
                if (jsonTokenF3 != JsonToken.END_OBJECT) {
                    JsonToken jsonToken2 = JsonToken.FIELD_NAME;
                    if (jsonTokenF3 != jsonToken2) {
                        fVar.Y(this, jsonToken2, null, new Object[0]);
                        throw null;
                    }
                    strD = jsonParser.d();
                }
            }
            while (strD != null) {
                Object objA = this.f341826i.a(fVar, strD);
                JsonToken jsonTokenG02 = jsonParser.g0();
                n.a aVar2 = this.f341836s;
                if (aVar2 == null || !aVar2.a(strD)) {
                    try {
                        if (jsonTokenG02 != JsonToken.VALUE_NULL) {
                            Object obj3 = map.get(objA);
                            Object objF2 = obj3 != null ? lVar == null ? iVar.f(jsonParser, fVar, obj3) : iVar.h(jsonParser, fVar, lVar) : lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
                            if (objF2 != obj3) {
                                map.put(objA, objF2);
                            }
                        } else if (!z13) {
                            map.put(objA, sVar.d(fVar));
                        }
                    } catch (Exception e13) {
                        AbstractC36455i.r0(fVar, e13, map, strD);
                        throw null;
                    }
                } else {
                    jsonParser.l0();
                }
                strD = jsonParser.e0();
            }
        }
        return map;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.d(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final com.fasterxml.jackson.databind.deser.x l0() {
        return this.f341830m;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36455i, com.fasterxml.jackson.databind.deser.std.C
    public final com.fasterxml.jackson.databind.h m0() {
        return this.f341784e;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return this.f341828k == null && this.f341826i == null && this.f341829l == null && this.f341834q == null && this.f341835r == null;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342434d;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36455i
    public final com.fasterxml.jackson.databind.i<Object> q0() {
        return this.f341828k;
    }

    public final void t0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Map<Object, Object> map) throws IOException {
        String strD;
        Object objE;
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341828k;
        boolean z12 = iVar.n() != null;
        b bVar = z12 ? new b(this.f341784e.n().f341930b, map) : null;
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
            Object objA = this.f341826i.a(fVar, strD);
            JsonToken jsonTokenG0 = jsonParser.g0();
            n.a aVar = this.f341836s;
            if (aVar == null || !aVar.a(strD)) {
                try {
                    if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341829l;
                        objE = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
                    } else if (!this.f341786g) {
                        objE = this.f341785f.d(fVar);
                    }
                    if (z12) {
                        bVar.a(objA, objE);
                    } else {
                        map.put(objA, objE);
                    }
                } catch (UnresolvedForwardReference e12) {
                    u0(fVar, bVar, objA, e12);
                } catch (Exception e13) {
                    AbstractC36455i.r0(fVar, e13, map, strD);
                    throw null;
                }
            } else {
                jsonParser.l0();
            }
            strD = jsonParser.e0();
        }
    }

    public final void u0(com.fasterxml.jackson.databind.f fVar, b bVar, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws MismatchedInputException {
        if (bVar != null) {
            a aVar = new a(bVar, unresolvedForwardReference, obj);
            bVar.f341841b.add(aVar);
            unresolvedForwardReference.f341520f.a(aVar);
        } else {
            fVar.V(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
            throw null;
        }
    }

    public t(t tVar, com.fasterxml.jackson.databind.m mVar, com.fasterxml.jackson.databind.i<Object> iVar, com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.deser.s sVar, Set<String> set, Set<String> set2) {
        super(tVar, sVar, tVar.f341787h);
        this.f341826i = mVar;
        this.f341828k = iVar;
        this.f341829l = lVar;
        this.f341830m = tVar.f341830m;
        this.f341832o = tVar.f341832o;
        this.f341831n = tVar.f341831n;
        this.f341833p = tVar.f341833p;
        this.f341834q = set;
        this.f341835r = set2;
        this.f341836s = com.fasterxml.jackson.databind.util.n.a(set, set2);
        this.f341827j = s0(this.f341784e, mVar);
    }
}
