package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.util.t;

/* compiled from: ReferenceTypeSerializer.java */
/* loaded from: classes4.dex */
public abstract class B<T> extends M<T> implements com.fasterxml.jackson.databind.ser.j {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342333d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.c f342334e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.o f342335f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342336g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.util.t f342337h;

    /* renamed from: i, reason: collision with root package name */
    public transient com.fasterxml.jackson.databind.ser.impl.k f342338i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f342339j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f342340k;

    /* compiled from: ReferenceTypeSerializer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342341a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f342341a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342341a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342341a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342341a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342341a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f342341a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public B(com.fasterxml.jackson.databind.type.i iVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l lVar) {
        super(iVar);
        this.f342333d = iVar.f342460k;
        this.f342334e = null;
        this.f342335f = oVar;
        this.f342336g = lVar;
        this.f342337h = null;
        this.f342339j = null;
        this.f342340k = false;
        this.f342338i = com.fasterxml.jackson.databind.ser.impl.k.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    @Override // com.fasterxml.jackson.databind.ser.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A r11, com.fasterxml.jackson.databind.c r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.B.a(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.l");
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, T t12) {
        if (!s(t12)) {
            return true;
        }
        Object objQ = q(t12);
        if (objQ == null) {
            return this.f342340k;
        }
        Object obj = this.f342339j;
        if (obj == null) {
            return false;
        }
        com.fasterxml.jackson.databind.l<Object> lVarP = this.f342336g;
        if (lVarP == null) {
            try {
                lVarP = p(a12, objQ.getClass());
            } catch (JsonMappingException e12) {
                throw new RuntimeJsonMappingException(e12);
            }
        }
        return obj == JsonInclude.Include.f340956d ? lVarP.d(a12, objQ) : obj.equals(objQ);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean e() {
        return this.f342337h != null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        Object objR = r(t12);
        if (objR == null) {
            if (this.f342337h == null) {
                a12.o(jsonGenerator);
                return;
            }
            return;
        }
        com.fasterxml.jackson.databind.l<Object> lVarP = this.f342336g;
        if (lVarP == null) {
            lVarP = p(a12, objR.getClass());
        }
        com.fasterxml.jackson.databind.jsontype.o oVar = this.f342335f;
        if (oVar != null) {
            lVarP.g(objR, jsonGenerator, a12, oVar);
        } else {
            lVarP.f(objR, jsonGenerator, a12);
        }
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        Object objR = r(t12);
        if (objR == null) {
            if (this.f342337h == null) {
                a12.o(jsonGenerator);
            }
        } else {
            com.fasterxml.jackson.databind.l<Object> lVarP = this.f342336g;
            if (lVarP == null) {
                lVarP = p(a12, objR.getClass());
            }
            lVarP.g(objR, jsonGenerator, a12, oVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.l
    public final com.fasterxml.jackson.databind.l<T> h(com.fasterxml.jackson.databind.util.t tVar) {
        com.fasterxml.jackson.databind.l<Object> lVarH;
        com.fasterxml.jackson.databind.l<Object> lVar = this.f342336g;
        if (lVar != null) {
            lVarH = lVar.h(tVar);
            if (lVarH == lVar) {
                return this;
            }
        } else {
            lVarH = lVar;
        }
        com.fasterxml.jackson.databind.util.t tVar2 = this.f342337h;
        if (tVar2 != null) {
            t.e eVar = com.fasterxml.jackson.databind.util.t.f342628b;
            tVar = new t.d(tVar, tVar2);
        }
        return (lVar == lVarH && tVar2 == tVar) ? this : u(this.f342334e, this.f342335f, lVarH, tVar);
    }

    public final com.fasterxml.jackson.databind.l<Object> p(com.fasterxml.jackson.databind.A a12, Class<?> cls) {
        com.fasterxml.jackson.databind.l<Object> lVarD = this.f342338i.d(cls);
        if (lVarD != null) {
            return lVarD;
        }
        com.fasterxml.jackson.databind.h hVar = this.f342333d;
        boolean zV2 = hVar.v();
        com.fasterxml.jackson.databind.c cVar = this.f342334e;
        com.fasterxml.jackson.databind.l<Object> lVarT = zV2 ? a12.t(a12.n(hVar, cls), cVar) : a12.u(cls, cVar);
        com.fasterxml.jackson.databind.util.t tVar = this.f342337h;
        if (tVar != null) {
            lVarT = lVarT.h(tVar);
        }
        com.fasterxml.jackson.databind.l<Object> lVar = lVarT;
        this.f342338i = this.f342338i.c(cls, lVar);
        return lVar;
    }

    public abstract Object q(T t12);

    public abstract Object r(T t12);

    public abstract boolean s(T t12);

    public abstract C36477c t(Object obj, boolean z12);

    public abstract C36477c u(com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l lVar, com.fasterxml.jackson.databind.util.t tVar);

    public B(C36477c c36477c, com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l lVar, com.fasterxml.jackson.databind.util.t tVar, Object obj, boolean z12) {
        super(c36477c);
        this.f342333d = c36477c.f342333d;
        this.f342338i = com.fasterxml.jackson.databind.ser.impl.k.a();
        this.f342334e = cVar;
        this.f342335f = oVar;
        this.f342336g = lVar;
        this.f342337h = tVar;
        this.f342339j = obj;
        this.f342340k = z12;
    }
}
