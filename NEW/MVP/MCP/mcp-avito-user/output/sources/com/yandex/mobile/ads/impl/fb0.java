package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i91;
import com.yandex.mobile.ads.impl.jd0;

/* loaded from: classes8.dex */
public final class fb0 extends xk<Void> {

    /* renamed from: k, reason: collision with root package name */
    private final jd0 f385244k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f385245l;

    /* renamed from: m, reason: collision with root package name */
    private final i91.d f385246m;

    /* renamed from: n, reason: collision with root package name */
    private final i91.b f385247n;

    /* renamed from: o, reason: collision with root package name */
    private a f385248o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private eb0 f385249p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f385250q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f385251r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f385252s;

    public static final class a extends yw {

        /* renamed from: e, reason: collision with root package name */
        public static final Object f385253e = new Object();

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private final Object f385254c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private final Object f385255d;

        private a(i91 i91Var, @j.P Object obj, @j.P Object obj2) {
            super(i91Var);
            this.f385254c = obj;
            this.f385255d = obj2;
        }

        public static a a(xc0 xc0Var) {
            return new a(new b(xc0Var), i91.d.f386400r, f385253e);
        }

        public static a a(i91 i91Var, @j.P Object obj, @j.P Object obj2) {
            return new a(i91Var, obj, obj2);
        }

        public final a a(i91 i91Var) {
            return new a(i91Var, this.f385254c, this.f385255d);
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final i91.d a(int i12, i91.d dVar, long j12) {
            this.f392080b.a(i12, dVar, j12);
            if (pc1.a(dVar.f386404a, this.f385254c)) {
                dVar.f386404a = i91.d.f386400r;
            }
            return dVar;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final i91.b a(int i12, i91.b bVar, boolean z12) {
            this.f392080b.a(i12, bVar, z12);
            if (pc1.a(bVar.f386390b, this.f385255d) && z12) {
                bVar.f386390b = f385253e;
            }
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.yw, com.yandex.mobile.ads.impl.i91
        public final int a(Object obj) {
            Object obj2;
            i91 i91Var = this.f392080b;
            if (f385253e.equals(obj) && (obj2 = this.f385255d) != null) {
                obj = obj2;
            }
            return i91Var.a(obj);
        }

        @Override // com.yandex.mobile.ads.impl.yw, com.yandex.mobile.ads.impl.i91
        public final Object a(int i12) {
            Object objA = this.f392080b.a(i12);
            return pc1.a(objA, this.f385255d) ? f385253e : objA;
        }
    }

    @j.k0
    public static final class b extends i91 {

        /* renamed from: b, reason: collision with root package name */
        private final xc0 f385256b;

        public b(xc0 xc0Var) {
            this.f385256b = xc0Var;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int b() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final i91.d a(int i12, i91.d dVar, long j12) {
            dVar.a(i91.d.f386400r, this.f385256b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f386415l = true;
            return dVar;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final i91.b a(int i12, i91.b bVar, boolean z12) {
            bVar.a(z12 ? 0 : null, z12 ? a.f385253e : null, 0, -9223372036854775807L, 0L, g4.f385558g, true);
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final int a(Object obj) {
            return obj == a.f385253e ? 0 : -1;
        }

        @Override // com.yandex.mobile.ads.impl.i91
        public final Object a(int i12) {
            return a.f385253e;
        }
    }

    public fb0(jd0 jd0Var, boolean z12) {
        boolean z13;
        this.f385244k = jd0Var;
        if (z12) {
            jd0Var.getClass();
            z13 = true;
        } else {
            z13 = false;
        }
        this.f385245l = z13;
        this.f385246m = new i91.d();
        this.f385247n = new i91.b();
        jd0Var.getClass();
        this.f385248o = a.a(jd0Var.getMediaItem());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.xk
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Void r19, com.yandex.mobile.ads.impl.jd0 r20, com.yandex.mobile.ads.impl.i91 r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fb0.a(java.lang.Object, com.yandex.mobile.ads.impl.jd0, com.yandex.mobile.ads.impl.i91):void");
    }

    @Override // com.yandex.mobile.ads.impl.xk, com.yandex.mobile.ads.impl.cf
    public final void e() {
        this.f385251r = false;
        this.f385250q = false;
        super.e();
    }

    public final i91 f() {
        return this.f385248o;
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final xc0 getMediaItem() {
        return this.f385244k.getMediaItem();
    }

    @Override // com.yandex.mobile.ads.impl.xk
    @j.P
    public final jd0.b a(Void r22, jd0.b bVar) {
        Object obj = bVar.f385280a;
        if (this.f385248o.f385255d != null && this.f385248o.f385255d.equals(obj)) {
            obj = a.f385253e;
        }
        return bVar.b(obj);
    }

    @Override // com.yandex.mobile.ads.impl.xk, com.yandex.mobile.ads.impl.cf
    public final void a(@j.P ua1 ua1Var) {
        super.a(ua1Var);
        if (this.f385245l) {
            return;
        }
        this.f385250q = true;
        a((fb0) null, this.f385244k);
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void a(dd0 dd0Var) {
        ((eb0) dd0Var).c();
        if (dd0Var == this.f385249p) {
            this.f385249p = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eb0 a(jd0.b bVar, h9 h9Var, long j12) {
        eb0 eb0Var = new eb0(bVar, h9Var, j12);
        eb0Var.a(this.f385244k);
        if (this.f385251r) {
            Object obj = bVar.f385280a;
            if (this.f385248o.f385255d != null && obj.equals(a.f385253e)) {
                obj = this.f385248o.f385255d;
            }
            eb0Var.a(bVar.b(obj));
        } else {
            this.f385249p = eb0Var;
            if (!this.f385250q) {
                this.f385250q = true;
                a((fb0) null, this.f385244k);
            }
        }
        return eb0Var;
    }
}
