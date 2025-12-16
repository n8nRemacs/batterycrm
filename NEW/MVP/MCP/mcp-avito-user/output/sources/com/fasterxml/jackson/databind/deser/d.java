package com.fasterxml.jackson.databind.deser;

import androidx.camera.core.Q;
import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.annotation.H;
import com.fasterxml.jackson.annotation.I;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.p;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.deser.impl.B;
import com.fasterxml.jackson.databind.deser.impl.C36444c;
import com.fasterxml.jackson.databind.deser.impl.D;
import com.fasterxml.jackson.databind.deser.impl.E;
import com.fasterxml.jackson.databind.deser.impl.z;
import com.fasterxml.jackson.databind.deser.std.C;
import com.fasterxml.jackson.databind.deser.x;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36465d;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.C;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: BeanDeserializerBase.java */
/* loaded from: classes4.dex */
public abstract class d extends C<Object> implements i, t, x.c, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.v f341550y = new com.fasterxml.jackson.databind.v("#temporary-name", null);

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341551e;

    /* renamed from: f, reason: collision with root package name */
    public final JsonFormat.Shape f341552f;

    /* renamed from: g, reason: collision with root package name */
    public final x f341553g;

    /* renamed from: h, reason: collision with root package name */
    public com.fasterxml.jackson.databind.i<Object> f341554h;

    /* renamed from: i, reason: collision with root package name */
    public com.fasterxml.jackson.databind.i<Object> f341555i;

    /* renamed from: j, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.impl.v f341556j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f341557k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f341558l;

    /* renamed from: m, reason: collision with root package name */
    public final C36444c f341559m;

    /* renamed from: n, reason: collision with root package name */
    public final E[] f341560n;

    /* renamed from: o, reason: collision with root package name */
    public u f341561o;

    /* renamed from: p, reason: collision with root package name */
    public final Set<String> f341562p;

    /* renamed from: q, reason: collision with root package name */
    public final Set<String> f341563q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f341564r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f341565s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f341566t;

    /* renamed from: u, reason: collision with root package name */
    public transient HashMap<com.fasterxml.jackson.databind.type.b, com.fasterxml.jackson.databind.i<Object>> f341567u;

    /* renamed from: v, reason: collision with root package name */
    public D f341568v;

    /* renamed from: w, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.impl.g f341569w;

    /* renamed from: x, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.impl.s f341570x;

    public d(e eVar, com.fasterxml.jackson.databind.b bVar, C36444c c36444c, HashMap map, HashSet hashSet, boolean z12, HashSet hashSet2, boolean z13) {
        super(bVar.f341454a);
        this.f341551e = bVar.f341454a;
        x xVar = eVar.f341579i;
        this.f341553g = xVar;
        E[] eArr = null;
        this.f341554h = null;
        this.f341555i = null;
        this.f341556j = null;
        this.f341559m = c36444c;
        this.f341566t = map;
        this.f341562p = hashSet;
        this.f341564r = z12;
        this.f341563q = hashSet2;
        this.f341561o = eVar.f341581k;
        ArrayList arrayList = eVar.f341575e;
        if (arrayList != null && !arrayList.isEmpty()) {
            eArr = (E[]) arrayList.toArray(new E[arrayList.size()]);
        }
        this.f341560n = eArr;
        com.fasterxml.jackson.databind.deser.impl.s sVar = eVar.f341580j;
        this.f341570x = sVar;
        this.f341557k = this.f341568v != null || xVar.l() || xVar.g() || !xVar.k();
        this.f341552f = bVar.f().f340948c;
        this.f341565s = z13;
        this.f341558l = !this.f341557k && eArr == null && !z13 && sVar == null;
    }

    public static void L0(com.fasterxml.jackson.databind.f fVar, Exception exc, Object obj, String str) throws IOException {
        Exception cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        com.fasterxml.jackson.databind.util.g.D(cause);
        boolean z12 = fVar == null || fVar.O(DeserializationFeature.WRAP_EXCEPTIONS);
        if (cause instanceof IOException) {
            if (!z12 || !(cause instanceof JacksonException)) {
                throw ((IOException) cause);
            }
        } else if (!z12) {
            com.fasterxml.jackson.databind.util.g.F(cause);
        }
        int i12 = JsonMappingException.f341373e;
        throw JsonMappingException.h(cause, new JsonMappingException.a(obj, str));
    }

    public static com.fasterxml.jackson.databind.i s0(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.introspect.o oVar) {
        c.b bVar = new c.b(f341550y, hVar, null, oVar, com.fasterxml.jackson.databind.u.f342513j);
        com.fasterxml.jackson.databind.jsontype.l lVarC = (com.fasterxml.jackson.databind.jsontype.l) hVar.f341933e;
        if (lVarC == null) {
            com.fasterxml.jackson.databind.e eVar = fVar.f341921d;
            eVar.getClass();
            com.fasterxml.jackson.databind.introspect.s sVar = (com.fasterxml.jackson.databind.introspect.s) eVar.i(hVar.f341930b);
            AnnotationIntrospector annotationIntrospectorD = eVar.d();
            C36465d c36465d = sVar.f342086e;
            com.fasterxml.jackson.databind.jsontype.n nVarC0 = annotationIntrospectorD.c0(hVar, eVar, c36465d);
            if (nVarC0 == null) {
                eVar.f341506c.getClass();
                lVarC = null;
            } else {
                lVarC = nVarC0.c(eVar, hVar, eVar.f341511e.e(eVar, c36465d));
            }
        }
        com.fasterxml.jackson.databind.i<?> iVar = (com.fasterxml.jackson.databind.i) hVar.f341932d;
        com.fasterxml.jackson.databind.i<?> iVarP = iVar == null ? fVar.p(hVar, bVar) : fVar.A(iVar, bVar, hVar);
        return lVarC != null ? new B(lVarC.f(bVar), iVarP) : iVarP;
    }

    public static void u0(C36444c c36444c, v[] vVarArr, v vVar, v vVar2) {
        int length = c36444c.f341607f.length;
        for (int i12 = 1; i12 < length; i12 += 2) {
            Object[] objArr = c36444c.f341607f;
            if (objArr[i12] == vVar) {
                objArr[i12] = vVar2;
                c36444c.f341608g[c36444c.a(vVar)] = vVar2;
                if (vVarArr != null) {
                    int length2 = vVarArr.length;
                    for (int i13 = 0; i13 < length2; i13++) {
                        if (vVarArr[i13] == vVar) {
                            vVarArr[i13] = vVar2;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException(AK.c.s(new StringBuilder("No entry '"), vVar.f341896d.f342656b, "' found, can't replace"));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.f r6) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.i r0 = r4.q0()
            com.fasterxml.jackson.databind.deser.x r1 = r4.f341553g
            if (r0 == 0) goto L18
            java.lang.Object r5 = r0.e(r5, r6)
            java.lang.Object r5 = r1.z(r6, r5)
            com.fasterxml.jackson.databind.deser.impl.E[] r0 = r4.f341560n
            if (r0 == 0) goto L17
            r4.G0(r6, r5)
        L17:
            return r5
        L18:
            com.fasterxml.jackson.databind.deser.impl.v r0 = r4.f341556j
            if (r0 == 0) goto L21
            java.lang.Object r5 = r4.r0(r5, r6)
            return r5
        L21:
            com.fasterxml.jackson.databind.h r5 = r4.f341551e
            java.lang.Class<?> r5 = r5.f341930b
            java.lang.annotation.Annotation[] r0 = com.fasterxml.jackson.databind.util.g.f342596a
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L43
            boolean r0 = com.fasterxml.jackson.databind.util.g.y(r5)
            if (r0 == 0) goto L3b
            r0 = r3
            goto L3f
        L3b:
            java.lang.Class r0 = r5.getEnclosingClass()
        L3f:
            if (r0 == 0) goto L43
            r0 = 1
            goto L44
        L43:
            r0 = r2
        L44:
            if (r0 == 0) goto L4e
            java.lang.String r0 = "non-static inner classes like this can only by instantiated using default, no-argument constructor"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r6.y(r5, r3, r0, r1)
            throw r3
        L4e:
            java.lang.String r0 = "cannot deserialize from Object value (no delegate- or property-based Creator)"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r6.y(r5, r1, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.d.A0(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.f):java.lang.Object");
    }

    public final Object B0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        if (this.f341570x != null) {
            return z0(jsonParser, fVar);
        }
        com.fasterxml.jackson.databind.i<Object> iVarQ0 = q0();
        if (iVarQ0 != null) {
            x xVar = this.f341553g;
            if (!xVar.h()) {
                Object objZ = xVar.z(fVar, iVarQ0.e(jsonParser, fVar));
                if (this.f341560n != null) {
                    G0(fVar, objZ);
                }
                return objZ;
            }
        }
        return G(jsonParser, fVar);
    }

    public final void C0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, String str) throws IgnoredPropertyException {
        if (!fVar.O(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            jsonParser.l0();
            return;
        }
        Collection<Object> collectionM = m();
        int i12 = IgnoredPropertyException.f341913h;
        IgnoredPropertyException ignoredPropertyException = new IgnoredPropertyException(jsonParser, Q.a("Ignored field \"", str, "\" (class ", (obj instanceof Class ? (Class) obj : obj.getClass()).getName(), ") encountered; mapper configured not to allow this"), jsonParser.m(), collectionM);
        ignoredPropertyException.e(obj, str);
        throw ignoredPropertyException;
    }

    public final Object D0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, com.fasterxml.jackson.databind.util.C c12) throws UnrecognizedPropertyException, InvalidDefinitionException, IgnoredPropertyException {
        com.fasterxml.jackson.databind.i<Object> iVarU;
        synchronized (this) {
            HashMap<com.fasterxml.jackson.databind.type.b, com.fasterxml.jackson.databind.i<Object>> map = this.f341567u;
            iVarU = map == null ? null : map.get(new com.fasterxml.jackson.databind.type.b(obj.getClass()));
        }
        if (iVarU == null && (iVarU = fVar.u(fVar.l(obj.getClass()))) != null) {
            synchronized (this) {
                try {
                    if (this.f341567u == null) {
                        this.f341567u = new HashMap<>();
                    }
                    this.f341567u.put(new com.fasterxml.jackson.databind.type.b(obj.getClass()), iVarU);
                } finally {
                }
            }
        }
        if (iVarU == null) {
            if (c12 != null) {
                E0(fVar, obj, c12);
            }
            return jsonParser != null ? f(jsonParser, fVar, obj) : obj;
        }
        if (c12 != null) {
            c12.B();
            C.b bVarX0 = c12.x0(c12.f342543c);
            bVarX0.g0();
            obj = iVarU.f(bVarX0, fVar, obj);
        }
        return jsonParser != null ? iVarU.f(jsonParser, fVar, obj) : obj;
    }

    public final void E0(com.fasterxml.jackson.databind.f fVar, Object obj, com.fasterxml.jackson.databind.util.C c12) throws UnrecognizedPropertyException, IgnoredPropertyException {
        c12.B();
        C.b bVarX0 = c12.x0(c12.f342543c);
        while (bVarX0.g0() != JsonToken.END_OBJECT) {
            String strD = bVarX0.d();
            bVarX0.g0();
            p0(bVarX0, fVar, obj, strD);
        }
    }

    public final void F0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, String str) throws IOException {
        if (com.fasterxml.jackson.databind.util.n.b(str, this.f341562p, this.f341563q)) {
            C0(jsonParser, fVar, obj, str);
            return;
        }
        u uVar = this.f341561o;
        if (uVar == null) {
            p0(jsonParser, fVar, obj, str);
            return;
        }
        try {
            uVar.b(jsonParser, fVar, obj, str);
        } catch (Exception e12) {
            L0(fVar, e12, obj, str);
            throw null;
        }
    }

    public final void G0(com.fasterxml.jackson.databind.f fVar, Object obj) {
        E[] eArr = this.f341560n;
        if (eArr.length <= 0) {
            return;
        }
        E e12 = eArr[0];
        fVar.q(e12.f341596f, e12, obj);
        throw null;
    }

    public d H0(C36444c c36444c) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    public abstract d I0(Set<String> set, Set<String> set2);

    public abstract d J0();

    public abstract d K0(com.fasterxml.jackson.databind.deser.impl.s sVar);

    public final void O0(Exception exc, com.fasterxml.jackson.databind.f fVar) throws IOException {
        Throwable cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        com.fasterxml.jackson.databind.util.g.D(cause);
        if (cause instanceof IOException) {
            throw ((IOException) cause);
        }
        if (fVar == null) {
            throw new IllegalArgumentException(cause.getMessage(), cause);
        }
        if (!fVar.O(DeserializationFeature.WRAP_EXCEPTIONS)) {
            com.fasterxml.jackson.databind.util.g.F(cause);
        }
        fVar.x(this.f341551e.f341930b, cause);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) throws InvalidDefinitionException {
        com.fasterxml.jackson.databind.deser.impl.s sVar;
        com.fasterxml.jackson.databind.introspect.D dZ2;
        com.fasterxml.jackson.databind.h hVar;
        v vVar;
        G gF2;
        com.fasterxml.jackson.databind.deser.impl.v vVar2;
        AnnotationIntrospector annotationIntrospectorD = fVar.f341921d.d();
        AbstractC36471j abstractC36471jB = cVar != null && annotationIntrospectorD != null ? cVar.b() : null;
        com.fasterxml.jackson.databind.h hVar2 = this.f341551e;
        C36444c c36444c = this.f341559m;
        com.fasterxml.jackson.databind.deser.impl.s sVar2 = this.f341570x;
        if (abstractC36471jB == null || (dZ2 = annotationIntrospectorD.z(abstractC36471jB)) == null) {
            sVar = sVar2;
        } else {
            com.fasterxml.jackson.databind.introspect.D dA2 = annotationIntrospectorD.A(abstractC36471jB, dZ2);
            Class<? extends G<?>> cls = dA2.f341941b;
            I iG2 = fVar.g(dA2);
            if (cls == H.d.class) {
                com.fasterxml.jackson.databind.v vVar3 = dA2.f341940a;
                String str = vVar3.f342656b;
                v vVarE = c36444c == null ? null : c36444c.e(str);
                if (vVarE == null && (vVar2 = this.f341556j) != null) {
                    vVarE = vVar2.c(str);
                }
                if (vVarE == null) {
                    fVar.i("Invalid Object Id definition for " + com.fasterxml.jackson.databind.util.g.A(hVar2.f341930b) + ": cannot find property with name " + com.fasterxml.jackson.databind.util.g.c(vVar3.f342656b));
                    throw null;
                }
                gF2 = new com.fasterxml.jackson.databind.deser.impl.w(dA2.f341943d);
                hVar = vVarE.f341897e;
                vVar = vVarE;
            } else {
                com.fasterxml.jackson.databind.h hVarL = fVar.l(cls);
                fVar.e().getClass();
                hVar = com.fasterxml.jackson.databind.type.n.n(hVarL, G.class)[0];
                vVar = null;
                gF2 = fVar.f(dA2);
            }
            sVar = new com.fasterxml.jackson.databind.deser.impl.s(hVar, dA2.f341940a, gF2, fVar.u(hVar), vVar, iG2);
        }
        d dVarK0 = (sVar == null || sVar == sVar2) ? this : K0(sVar);
        if (abstractC36471jB != null) {
            p.a aVarJ = annotationIntrospectorD.J(abstractC36471jB);
            if (aVarJ.f340993c && !this.f341564r) {
                dVarK0 = dVarK0.J0();
            }
            Set<String> setEmptySet = aVarJ.f340995e ? Collections.emptySet() : aVarJ.f340992b;
            boolean zIsEmpty = setEmptySet.isEmpty();
            Set<String> set = dVarK0.f341562p;
            if (zIsEmpty) {
                setEmptySet = set;
            } else if (set != null && !set.isEmpty()) {
                HashSet hashSet = new HashSet(set);
                hashSet.addAll(setEmptySet);
                setEmptySet = hashSet;
            }
            Set<String> set2 = annotationIntrospectorD.N(abstractC36471jB).f340998b;
            Set<String> set3 = dVarK0.f341563q;
            if (set3 != null) {
                if (set2 == null) {
                    set2 = set3;
                } else {
                    HashSet hashSet2 = new HashSet();
                    for (String str2 : set2) {
                        if (set3.contains(str2)) {
                            hashSet2.add(str2);
                        }
                    }
                    set2 = hashSet2;
                }
            }
            if (setEmptySet != set || set2 != set3) {
                dVarK0 = dVarK0.I0(setEmptySet, set2);
            }
        }
        JsonFormat.b bVarK0 = com.fasterxml.jackson.databind.deser.std.C.k0(fVar, cVar, hVar2.f341930b);
        if (bVarK0 != null) {
            JsonFormat.Shape shape = JsonFormat.Shape.f340932b;
            JsonFormat.Shape shape2 = bVarK0.f340948c;
            shape = shape2 != shape ? shape2 : null;
            Boolean boolB = bVarK0.b(JsonFormat.Feature.f340928c);
            if (boolB != null) {
                boolean zBooleanValue = boolB.booleanValue();
                C36444c c36444c2 = c36444c.f341603b == zBooleanValue ? c36444c : new C36444c(c36444c, zBooleanValue);
                if (c36444c2 != c36444c) {
                    dVarK0 = dVarK0.H0(c36444c2);
                }
            }
        }
        if (shape == null) {
            shape = this.f341552f;
        }
        return shape == JsonFormat.Shape.f340935e ? dVarK0.v0() : dVarK0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x016c, code lost:
    
        if (r14 != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019c  */
    @Override // com.fasterxml.jackson.databind.deser.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.fasterxml.jackson.databind.f r27) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.d.c(com.fasterxml.jackson.databind.f):void");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        Object objG;
        com.fasterxml.jackson.databind.deser.impl.s sVar = this.f341570x;
        if (sVar != null) {
            if (jsonParser.a() && (objG = jsonParser.G()) != null) {
                return t0(jsonParser, fVar, lVar.d(jsonParser, fVar), objG);
            }
            JsonToken jsonTokenF = jsonParser.f();
            if (jsonTokenF != null) {
                if (jsonTokenF.f341103i) {
                    return z0(jsonParser, fVar);
                }
                if (jsonTokenF == JsonToken.START_OBJECT) {
                    jsonTokenF = jsonParser.g0();
                }
                if (jsonTokenF == JsonToken.FIELD_NAME) {
                    sVar.f341668d.getClass();
                }
            }
        }
        return lVar.d(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final v i(String str) {
        HashMap map = this.f341566t;
        if (map == null) {
            return null;
        }
        return (v) map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final AccessPattern k() {
        return AccessPattern.f342526d;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
        try {
            return this.f341553g.y(fVar);
        } catch (IOException e12) {
            com.fasterxml.jackson.databind.util.g.C(fVar, e12);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final x l0() {
        return this.f341553g;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Collection<Object> m() {
        ArrayList arrayList = new ArrayList();
        Iterator<v> it = this.f341559m.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f341896d.f342656b);
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final com.fasterxml.jackson.databind.h m0() {
        return this.f341551e;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final com.fasterxml.jackson.databind.deser.impl.s n() {
        return this.f341570x;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Class<?> o() {
        return this.f341551e.f341930b;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final void p0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, String str) throws UnrecognizedPropertyException, IgnoredPropertyException {
        if (this.f341564r) {
            jsonParser.l0();
            return;
        }
        if (com.fasterxml.jackson.databind.util.n.b(str, this.f341562p, this.f341563q)) {
            C0(jsonParser, fVar, obj, str);
        }
        super.p0(jsonParser, fVar, obj, str);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342435e;
    }

    public final com.fasterxml.jackson.databind.i<Object> q0() {
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341554h;
        return iVar == null ? this.f341555i : iVar;
    }

    @Override // com.fasterxml.jackson.databind.i
    public Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.TRUE;
    }

    public abstract Object r0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar);

    @Override // com.fasterxml.jackson.databind.i
    public abstract com.fasterxml.jackson.databind.i<Object> s(com.fasterxml.jackson.databind.util.t tVar);

    public final Object t0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, Object obj2) {
        com.fasterxml.jackson.databind.deser.impl.s sVar = this.f341570x;
        com.fasterxml.jackson.databind.i<Object> iVar = sVar.f341670f;
        if (iVar.o() != obj2.getClass()) {
            com.fasterxml.jackson.databind.util.C cK2 = fVar.k(jsonParser);
            if (obj2 instanceof String) {
                cK2.i0((String) obj2);
            } else if (obj2 instanceof Long) {
                cK2.r0(JsonToken.VALUE_NUMBER_INT, (Long) obj2);
            } else if (obj2 instanceof Integer) {
                cK2.r0(JsonToken.VALUE_NUMBER_INT, (Integer) obj2);
            } else {
                cK2.writeObject(obj2);
            }
            C.b bVarX0 = cK2.x0(cK2.f342543c);
            bVarX0.g0();
            obj2 = iVar.e(bVarX0, fVar);
        }
        fVar.t(obj2, sVar.f341668d, sVar.f341669e).b(obj);
        v vVar = sVar.f341671g;
        return vVar != null ? vVar.A(obj, obj2) : obj;
    }

    public abstract d v0();

    public final Object w0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        com.fasterxml.jackson.databind.i<Object> iVarQ0 = q0();
        x xVar = this.f341553g;
        if (iVarQ0 == null || xVar.c()) {
            return xVar.q(fVar, jsonParser.f() == JsonToken.VALUE_TRUE);
        }
        Object objZ = xVar.z(fVar, iVarQ0.e(jsonParser, fVar));
        if (this.f341560n != null) {
            G0(fVar, objZ);
        }
        return objZ;
    }

    public final Object x0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        JsonParser.NumberType numberTypeB = jsonParser.B();
        JsonParser.NumberType numberType = JsonParser.NumberType.f341078f;
        E[] eArr = this.f341560n;
        x xVar = this.f341553g;
        if (numberTypeB == numberType || numberTypeB == JsonParser.NumberType.f341077e) {
            com.fasterxml.jackson.databind.i<Object> iVarQ0 = q0();
            if (iVarQ0 == null || xVar.d()) {
                return xVar.r(fVar, jsonParser.u());
            }
            Object objZ = xVar.z(fVar, iVarQ0.e(jsonParser, fVar));
            if (eArr != null) {
                G0(fVar, objZ);
            }
            return objZ;
        }
        if (numberTypeB != JsonParser.NumberType.f341079g) {
            fVar.y(this.f341551e.f341930b, xVar, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.D());
            throw null;
        }
        com.fasterxml.jackson.databind.i<Object> iVarQ02 = q0();
        if (iVarQ02 == null || xVar.a()) {
            return xVar.o(fVar, jsonParser.q());
        }
        Object objZ2 = xVar.z(fVar, iVarQ02.e(jsonParser, fVar));
        if (eArr != null) {
            G0(fVar, objZ2);
        }
        return objZ2;
    }

    public final Object y0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        if (this.f341570x != null) {
            return z0(jsonParser, fVar);
        }
        com.fasterxml.jackson.databind.i<Object> iVarQ0 = q0();
        JsonParser.NumberType numberTypeB = jsonParser.B();
        JsonParser.NumberType numberType = JsonParser.NumberType.f341074b;
        x xVar = this.f341553g;
        E[] eArr = this.f341560n;
        if (numberTypeB == numberType) {
            if (iVarQ0 == null || xVar.e()) {
                return xVar.s(fVar, jsonParser.z());
            }
            Object objZ = xVar.z(fVar, iVarQ0.e(jsonParser, fVar));
            if (eArr != null) {
                G0(fVar, objZ);
            }
            return objZ;
        }
        if (numberTypeB == JsonParser.NumberType.f341075c) {
            if (iVarQ0 == null || xVar.e()) {
                return xVar.t(fVar, jsonParser.A());
            }
            Object objZ2 = xVar.z(fVar, iVarQ0.e(jsonParser, fVar));
            if (eArr != null) {
                G0(fVar, objZ2);
            }
            return objZ2;
        }
        if (numberTypeB != JsonParser.NumberType.f341076d) {
            fVar.y(this.f341551e.f341930b, xVar, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.D());
            throw null;
        }
        if (iVarQ0 == null || xVar.b()) {
            return xVar.p(fVar, jsonParser.h());
        }
        Object objZ3 = xVar.z(fVar, iVarQ0.e(jsonParser, fVar));
        if (eArr != null) {
            G0(fVar, objZ3);
        }
        return objZ3;
    }

    public final Object z0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws UnresolvedForwardReference {
        com.fasterxml.jackson.databind.deser.impl.s sVar = this.f341570x;
        Object objE = sVar.f341670f.e(jsonParser, fVar);
        z zVarT = fVar.t(objE, sVar.f341668d, sVar.f341669e);
        Object objC = zVarT.f341699d.c(zVarT.f341697b);
        zVarT.f341696a = objC;
        if (objC != null) {
            return objC;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + objE + "] (for " + this.f341551e + ").", jsonParser.m(), zVarT);
    }

    public d(d dVar) {
        this(dVar, dVar.f341564r);
    }

    public d(d dVar, boolean z12) {
        super(dVar.f341551e);
        this.f341551e = dVar.f341551e;
        this.f341553g = dVar.f341553g;
        this.f341554h = dVar.f341554h;
        this.f341555i = dVar.f341555i;
        this.f341556j = dVar.f341556j;
        this.f341559m = dVar.f341559m;
        this.f341566t = dVar.f341566t;
        this.f341562p = dVar.f341562p;
        this.f341564r = z12;
        this.f341563q = dVar.f341563q;
        this.f341561o = dVar.f341561o;
        this.f341560n = dVar.f341560n;
        this.f341570x = dVar.f341570x;
        this.f341557k = dVar.f341557k;
        this.f341568v = dVar.f341568v;
        this.f341565s = dVar.f341565s;
        this.f341552f = dVar.f341552f;
        this.f341558l = dVar.f341558l;
    }

    public d(d dVar, com.fasterxml.jackson.databind.util.t tVar) {
        com.fasterxml.jackson.databind.v vVar;
        com.fasterxml.jackson.databind.i<Object> iVarS;
        com.fasterxml.jackson.databind.v vVar2;
        com.fasterxml.jackson.databind.i<Object> iVarS2;
        super(dVar.f341551e);
        this.f341551e = dVar.f341551e;
        this.f341553g = dVar.f341553g;
        this.f341554h = dVar.f341554h;
        this.f341555i = dVar.f341555i;
        this.f341556j = dVar.f341556j;
        this.f341566t = dVar.f341566t;
        this.f341562p = dVar.f341562p;
        this.f341564r = true;
        this.f341563q = dVar.f341563q;
        this.f341561o = dVar.f341561o;
        this.f341560n = dVar.f341560n;
        this.f341570x = dVar.f341570x;
        this.f341557k = dVar.f341557k;
        D d12 = dVar.f341568v;
        String str = null;
        if (d12 != null) {
            ArrayList arrayList = d12.f341595a;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v vVarB = (v) it.next();
                String strB = tVar.b(vVarB.f341896d.f342656b);
                com.fasterxml.jackson.databind.v vVar3 = vVarB.f341896d;
                if (vVar3 != null) {
                    strB = strB == null ? "" : strB;
                    vVar2 = strB.equals(vVar3.f342656b) ? vVar3 : new com.fasterxml.jackson.databind.v(strB, vVar3.f342657c);
                } else {
                    vVar2 = new com.fasterxml.jackson.databind.v(strB, null);
                }
                vVarB = vVar2 != vVar3 ? vVarB.B(vVar2) : vVarB;
                com.fasterxml.jackson.databind.i<Object> iVarR = vVarB.r();
                if (iVarR != null && (iVarS2 = iVarR.s(tVar)) != iVarR) {
                    vVarB = vVarB.E(iVarS2);
                }
                arrayList2.add(vVarB);
            }
            d12 = new D(arrayList2);
        }
        C36444c c36444c = dVar.f341559m;
        c36444c.getClass();
        if (tVar != com.fasterxml.jackson.databind.util.t.f342628b) {
            v[] vVarArr = c36444c.f341608g;
            int length = vVarArr.length;
            ArrayList arrayList3 = new ArrayList(length);
            int i12 = 0;
            while (i12 < length) {
                v vVarB2 = vVarArr[i12];
                if (vVarB2 == null) {
                    arrayList3.add(vVarB2);
                } else {
                    com.fasterxml.jackson.databind.v vVar4 = vVarB2.f341896d;
                    String strB2 = tVar.b(vVar4.f342656b);
                    if (vVar4 != null) {
                        strB2 = strB2 == null ? "" : strB2;
                        vVar = strB2.equals(vVar4.f342656b) ? vVar4 : new com.fasterxml.jackson.databind.v(strB2, vVar4.f342657c);
                    } else {
                        vVar = new com.fasterxml.jackson.databind.v(strB2, str);
                    }
                    vVarB2 = vVar != vVar4 ? vVarB2.B(vVar) : vVarB2;
                    com.fasterxml.jackson.databind.i<Object> iVarR2 = vVarB2.r();
                    if (iVarR2 != null && (iVarS = iVarR2.s(tVar)) != iVarR2) {
                        vVarB2 = vVarB2.E(iVarS);
                    }
                    arrayList3.add(vVarB2);
                }
                i12++;
                str = null;
            }
            c36444c = new C36444c(c36444c.f341603b, arrayList3, c36444c.f341609h, c36444c.f341611j);
        }
        this.f341559m = c36444c;
        this.f341568v = d12;
        this.f341565s = dVar.f341565s;
        this.f341552f = dVar.f341552f;
        this.f341558l = false;
    }

    public d(d dVar, com.fasterxml.jackson.databind.deser.impl.s sVar) {
        super(dVar.f341551e);
        this.f341551e = dVar.f341551e;
        this.f341553g = dVar.f341553g;
        this.f341554h = dVar.f341554h;
        this.f341555i = dVar.f341555i;
        this.f341556j = dVar.f341556j;
        this.f341566t = dVar.f341566t;
        this.f341562p = dVar.f341562p;
        this.f341564r = dVar.f341564r;
        this.f341563q = dVar.f341563q;
        this.f341561o = dVar.f341561o;
        this.f341560n = dVar.f341560n;
        this.f341557k = dVar.f341557k;
        this.f341568v = dVar.f341568v;
        this.f341565s = dVar.f341565s;
        this.f341552f = dVar.f341552f;
        this.f341570x = sVar;
        this.f341559m = dVar.f341559m.l(new com.fasterxml.jackson.databind.deser.impl.u(sVar, com.fasterxml.jackson.databind.u.f342512i));
        this.f341558l = false;
    }

    public d(d dVar, Set<String> set, Set<String> set2) {
        super(dVar.f341551e);
        this.f341551e = dVar.f341551e;
        this.f341553g = dVar.f341553g;
        this.f341554h = dVar.f341554h;
        this.f341555i = dVar.f341555i;
        this.f341556j = dVar.f341556j;
        this.f341566t = dVar.f341566t;
        this.f341562p = set;
        this.f341564r = dVar.f341564r;
        this.f341563q = set2;
        this.f341561o = dVar.f341561o;
        this.f341560n = dVar.f341560n;
        this.f341557k = dVar.f341557k;
        this.f341568v = dVar.f341568v;
        this.f341565s = dVar.f341565s;
        this.f341552f = dVar.f341552f;
        this.f341558l = dVar.f341558l;
        this.f341570x = dVar.f341570x;
        C36444c c36444c = dVar.f341559m;
        c36444c.getClass();
        if ((set != null && !set.isEmpty()) || set2 != null) {
            v[] vVarArr = c36444c.f341608g;
            ArrayList arrayList = new ArrayList(vVarArr.length);
            for (v vVar : vVarArr) {
                if (vVar != null && !com.fasterxml.jackson.databind.util.n.b(vVar.f341896d.f342656b, set, set2)) {
                    arrayList.add(vVar);
                }
            }
            c36444c = new C36444c(c36444c.f341603b, arrayList, c36444c.f341609h, c36444c.f341611j);
        }
        this.f341559m = c36444c;
    }

    public d(d dVar, C36444c c36444c) {
        super(dVar.f341551e);
        this.f341551e = dVar.f341551e;
        this.f341553g = dVar.f341553g;
        this.f341554h = dVar.f341554h;
        this.f341555i = dVar.f341555i;
        this.f341556j = dVar.f341556j;
        this.f341559m = c36444c;
        this.f341566t = dVar.f341566t;
        this.f341562p = dVar.f341562p;
        this.f341564r = dVar.f341564r;
        this.f341563q = dVar.f341563q;
        this.f341561o = dVar.f341561o;
        this.f341560n = dVar.f341560n;
        this.f341570x = dVar.f341570x;
        this.f341557k = dVar.f341557k;
        this.f341568v = dVar.f341568v;
        this.f341565s = dVar.f341565s;
        this.f341552f = dVar.f341552f;
        this.f341558l = dVar.f341558l;
    }
}
