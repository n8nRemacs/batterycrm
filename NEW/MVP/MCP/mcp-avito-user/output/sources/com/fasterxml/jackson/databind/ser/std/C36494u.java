package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ser.impl.k;
import com.fasterxml.jackson.databind.util.n;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import rX0.InterfaceC47610a;

/* compiled from: MapSerializer.java */
@InterfaceC47610a
/* renamed from: com.fasterxml.jackson.databind.ser.std.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36494u extends com.fasterxml.jackson.databind.ser.i<Map<?, ?>> implements com.fasterxml.jackson.databind.ser.j {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.c f342397d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f342398e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342399f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342400g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342401h;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342402i;

    /* renamed from: j, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.o f342403j;

    /* renamed from: k, reason: collision with root package name */
    public com.fasterxml.jackson.databind.ser.impl.k f342404k;

    /* renamed from: l, reason: collision with root package name */
    public final Set<String> f342405l;

    /* renamed from: m, reason: collision with root package name */
    public final Set<String> f342406m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f342407n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f342408o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f342409p;

    /* renamed from: q, reason: collision with root package name */
    public final n.a f342410q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f342411r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.type.k f342395s = com.fasterxml.jackson.databind.type.n.p();

    /* renamed from: t, reason: collision with root package name */
    public static final JsonInclude.Include f342396t = JsonInclude.Include.f340956d;

    /* compiled from: MapSerializer.java */
    /* renamed from: com.fasterxml.jackson.databind.ser.std.u$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342412a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f342412a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342412a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342412a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342412a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342412a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f342412a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C36494u(C36494u c36494u, com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.l<?> lVar, com.fasterxml.jackson.databind.l<?> lVar2, Set<String> set, Set<String> set2) {
        super(Map.class, 0);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f342405l = set;
        this.f342406m = set2;
        this.f342399f = c36494u.f342399f;
        this.f342400g = c36494u.f342400g;
        this.f342398e = c36494u.f342398e;
        this.f342403j = c36494u.f342403j;
        this.f342401h = lVar;
        this.f342402i = lVar2;
        this.f342404k = com.fasterxml.jackson.databind.ser.impl.k.a();
        this.f342397d = cVar;
        this.f342407n = c36494u.f342407n;
        this.f342411r = c36494u.f342411r;
        this.f342408o = c36494u.f342408o;
        this.f342409p = c36494u.f342409p;
        this.f342410q = com.fasterxml.jackson.databind.util.n.a(set, set2);
    }

    public static C36494u s(Set<String> set, Set<String> set2, com.fasterxml.jackson.databind.h hVar, boolean z12, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<Object> lVar, com.fasterxml.jackson.databind.l<Object> lVar2, Object obj) {
        com.fasterxml.jackson.databind.h hVarP;
        com.fasterxml.jackson.databind.h hVar2;
        boolean z13;
        if (hVar == null) {
            hVar2 = f342395s;
            hVarP = hVar2;
        } else {
            com.fasterxml.jackson.databind.h hVarR = hVar.r();
            hVarP = hVar.x(Properties.class) ? com.fasterxml.jackson.databind.type.n.p() : hVar.n();
            hVar2 = hVarR;
        }
        if (z12) {
            z13 = hVarP.f341930b == Object.class ? false : z12;
        } else {
            z13 = hVarP != null && hVarP.E();
        }
        C36494u c36494u = new C36494u(set, set2, hVar2, hVarP, z13, oVar, lVar, lVar2);
        if (obj == null) {
            return c36494u;
        }
        com.fasterxml.jackson.databind.util.g.G(c36494u, C36494u.class, "withFilterId");
        return new C36494u(c36494u, obj, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    @Override // com.fasterxml.jackson.databind.ser.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A r20, com.fasterxml.jackson.databind.c r21) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.C36494u.a(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.l");
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return true;
        }
        boolean z12 = this.f342409p;
        Object obj2 = this.f342408o;
        if (obj2 != null || z12) {
            boolean z13 = f342396t == obj2;
            com.fasterxml.jackson.databind.l<Object> lVar = this.f342402i;
            if (lVar != null) {
                for (Object obj3 : map.values()) {
                    if (obj3 == null) {
                        if (z12) {
                        }
                    } else if (z13) {
                        if (!lVar.d(a12, obj3)) {
                        }
                    } else if (obj2 == null || !obj2.equals(map)) {
                    }
                }
                return true;
            }
            for (Object obj4 : map.values()) {
                if (obj4 != null) {
                    try {
                        com.fasterxml.jackson.databind.l<Object> lVarR = r(a12, obj4);
                        if (z13) {
                            if (!lVarR.d(a12, obj4)) {
                            }
                        } else if (obj2 == null || !obj2.equals(map)) {
                        }
                    } catch (DatabindException unused) {
                    }
                } else if (z12) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) throws IOException {
        Map<?, ?> map = (Map) obj;
        jsonGenerator.f0(map);
        u(map, jsonGenerator, a12);
        jsonGenerator.B();
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) throws IOException {
        Map<?, ?> map = (Map) obj;
        jsonGenerator.j(map);
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.START_OBJECT, map));
        u(map, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdE);
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final com.fasterxml.jackson.databind.ser.i p(com.fasterxml.jackson.databind.jsontype.o oVar) {
        if (this.f342403j == oVar) {
            return this;
        }
        com.fasterxml.jackson.databind.util.g.G(this, C36494u.class, "_withValueTypeSerializer");
        return new C36494u(this, oVar, this.f342408o, this.f342409p);
    }

    public final com.fasterxml.jackson.databind.l<Object> r(com.fasterxml.jackson.databind.A a12, Object obj) {
        Class<?> cls = obj.getClass();
        com.fasterxml.jackson.databind.l<Object> lVarD = this.f342404k.d(cls);
        if (lVarD != null) {
            return lVarD;
        }
        com.fasterxml.jackson.databind.h hVar = this.f342400g;
        boolean zV2 = hVar.v();
        com.fasterxml.jackson.databind.c cVar = this.f342397d;
        if (zV2) {
            com.fasterxml.jackson.databind.ser.impl.k kVar = this.f342404k;
            k.d dVarB = kVar.b(a12.n(hVar, cls), a12, cVar);
            com.fasterxml.jackson.databind.ser.impl.k kVar2 = dVarB.f342296b;
            if (kVar != kVar2) {
                this.f342404k = kVar2;
            }
            return dVarB.f342295a;
        }
        com.fasterxml.jackson.databind.ser.impl.k kVar3 = this.f342404k;
        kVar3.getClass();
        com.fasterxml.jackson.databind.l<Object> lVarQ = a12.q(cls, cVar);
        com.fasterxml.jackson.databind.ser.impl.k kVarC = kVar3.c(cls, lVarQ);
        if (kVar3 != kVarC) {
            this.f342404k = kVarC;
        }
        return lVarQ;
    }

    public final void t(Map<?, ?> map, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, Object obj) throws IOException {
        com.fasterxml.jackson.databind.l lVar;
        com.fasterxml.jackson.databind.l<Object> lVarR;
        boolean z12 = f342396t == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                lVar = a12.f341336h;
            } else {
                n.a aVar = this.f342410q;
                if (aVar == null || !aVar.a(key)) {
                    lVar = this.f342401h;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                lVarR = this.f342402i;
                if (lVarR == null) {
                    lVarR = r(a12, value);
                }
                if (z12) {
                    if (lVarR.d(a12, value)) {
                        continue;
                    } else {
                        lVar.f(key, jsonGenerator, a12);
                        lVarR.g(value, jsonGenerator, a12, this.f342403j);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    lVar.f(key, jsonGenerator, a12);
                    lVarR.g(value, jsonGenerator, a12, this.f342403j);
                }
            } else if (this.f342409p) {
                continue;
            } else {
                lVarR = a12.f341335g;
                lVar.f(key, jsonGenerator, a12);
                try {
                    lVarR.g(value, jsonGenerator, a12, this.f342403j);
                } catch (Exception e12) {
                    M.o(a12, e12, map, String.valueOf(key));
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019f A[EXC_TOP_SPLITTER, PHI: r15
  0x019f: PHI (r15v1 com.fasterxml.jackson.databind.l<java.lang.Object>) = 
  (r15v0 com.fasterxml.jackson.databind.l<java.lang.Object>)
  (r15v3 com.fasterxml.jackson.databind.l<java.lang.Object>)
  (r15v3 com.fasterxml.jackson.databind.l<java.lang.Object>)
  (r15v3 com.fasterxml.jackson.databind.l<java.lang.Object>)
 binds: [B:120:0x0182, B:126:0x0193, B:128:0x0196, B:130:0x019c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.fasterxml.jackson.databind.ser.std.M, com.fasterxml.jackson.databind.ser.std.u] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.util.Map<?, ?> r18, com.fasterxml.jackson.core.JsonGenerator r19, com.fasterxml.jackson.databind.A r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.C36494u.u(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.A):void");
    }

    public final C36494u v(Object obj, boolean z12) {
        if (obj == this.f342408o && z12 == this.f342409p) {
            return this;
        }
        com.fasterxml.jackson.databind.util.g.G(this, C36494u.class, "withContentInclusion");
        return new C36494u(this, this.f342403j, obj, z12);
    }

    public C36494u(C36494u c36494u, com.fasterxml.jackson.databind.jsontype.o oVar, Object obj, boolean z12) {
        super(Map.class, 0);
        this.f342405l = c36494u.f342405l;
        this.f342406m = c36494u.f342406m;
        this.f342399f = c36494u.f342399f;
        this.f342400g = c36494u.f342400g;
        this.f342398e = c36494u.f342398e;
        this.f342403j = oVar;
        this.f342401h = c36494u.f342401h;
        this.f342402i = c36494u.f342402i;
        this.f342404k = c36494u.f342404k;
        this.f342397d = c36494u.f342397d;
        this.f342407n = c36494u.f342407n;
        this.f342411r = c36494u.f342411r;
        this.f342408o = obj;
        this.f342409p = z12;
        this.f342410q = c36494u.f342410q;
    }

    public C36494u(C36494u c36494u, Object obj, boolean z12) {
        super(Map.class, 0);
        this.f342405l = c36494u.f342405l;
        this.f342406m = c36494u.f342406m;
        this.f342399f = c36494u.f342399f;
        this.f342400g = c36494u.f342400g;
        this.f342398e = c36494u.f342398e;
        this.f342403j = c36494u.f342403j;
        this.f342401h = c36494u.f342401h;
        this.f342402i = c36494u.f342402i;
        this.f342404k = com.fasterxml.jackson.databind.ser.impl.k.a();
        this.f342397d = c36494u.f342397d;
        this.f342407n = obj;
        this.f342411r = z12;
        this.f342408o = c36494u.f342408o;
        this.f342409p = c36494u.f342409p;
        this.f342410q = c36494u.f342410q;
    }

    public C36494u(Set<String> set, Set<String> set2, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h hVar2, boolean z12, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<?> lVar, com.fasterxml.jackson.databind.l<?> lVar2) {
        super(Map.class, 0);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f342405l = set;
        this.f342406m = set2;
        this.f342399f = hVar;
        this.f342400g = hVar2;
        this.f342398e = z12;
        this.f342403j = oVar;
        this.f342401h = lVar;
        this.f342402i = lVar2;
        this.f342404k = com.fasterxml.jackson.databind.ser.impl.k.a();
        this.f342397d = null;
        this.f342407n = null;
        this.f342411r = false;
        this.f342408o = null;
        this.f342409p = false;
        this.f342410q = com.fasterxml.jackson.databind.util.n.a(set, set2);
    }
}
