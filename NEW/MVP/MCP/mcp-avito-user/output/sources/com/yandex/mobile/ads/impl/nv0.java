package com.yandex.mobile.ads.impl;

import android.os.Looper;
import com.yandex.mobile.ads.impl.gn;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.kv0;
import com.yandex.mobile.ads.impl.lv0;
import com.yandex.mobile.ads.impl.xc0;

/* loaded from: classes8.dex */
public final class nv0 extends cf implements lv0.b {

    /* renamed from: h, reason: collision with root package name */
    private final xc0 f388380h;

    /* renamed from: i, reason: collision with root package name */
    private final xc0.f f388381i;

    /* renamed from: j, reason: collision with root package name */
    private final gn.a f388382j;

    /* renamed from: k, reason: collision with root package name */
    private final kv0.a f388383k;

    /* renamed from: l, reason: collision with root package name */
    private final com.yandex.mobile.ads.exo.drm.g f388384l;

    /* renamed from: m, reason: collision with root package name */
    private final p90 f388385m;

    /* renamed from: n, reason: collision with root package name */
    private final int f388386n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f388387o;

    /* renamed from: p, reason: collision with root package name */
    private long f388388p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f388389q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f388390r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    private ua1 f388391s;

    public static final class a implements jd0.a {

        /* renamed from: a, reason: collision with root package name */
        private final gn.a f388392a;

        /* renamed from: b, reason: collision with root package name */
        private kv0.a f388393b;

        /* renamed from: c, reason: collision with root package name */
        private ur f388394c;

        /* renamed from: d, reason: collision with root package name */
        private p90 f388395d;

        public a(gn.a aVar, vu vuVar) {
            this(aVar, new G0(vuVar, 13));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ kv0 a(vu vuVar, jt0 jt0Var) {
            return new tg(vuVar);
        }

        public a(gn.a aVar, kv0.a aVar2) {
            this(aVar, aVar2, new com.yandex.mobile.ads.exo.drm.d(), new ap());
        }

        public final nv0 a(xc0 xc0Var) {
            xc0Var.f391606b.getClass();
            Object obj = xc0Var.f391606b.f391660g;
            return new nv0(xc0Var, this.f388392a, this.f388393b, this.f388394c.a(xc0Var), this.f388395d, 1048576, 0);
        }

        public a(gn.a aVar, kv0.a aVar2, com.yandex.mobile.ads.exo.drm.d dVar, ap apVar) {
            this.f388392a = aVar;
            this.f388393b = aVar2;
            this.f388394c = dVar;
            this.f388395d = apVar;
        }
    }

    public /* synthetic */ nv0(xc0 xc0Var, gn.a aVar, kv0.a aVar2, com.yandex.mobile.ads.exo.drm.g gVar, p90 p90Var, int i12, int i13) {
        this(xc0Var, aVar, aVar2, gVar, p90Var, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.mobile.ads.impl.mv0] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.yandex.mobile.ads.impl.cf, com.yandex.mobile.ads.impl.nv0] */
    @Override // com.yandex.mobile.ads.impl.cf
    public final void a(@j.P ua1 ua1Var) {
        this.f388391s = ua1Var;
        this.f388384l.prepare();
        com.yandex.mobile.ads.exo.drm.g gVar = this.f388384l;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        gVar.a(looperMyLooper, c());
        long j12 = this.f388388p;
        i41 i41Var = new i41(j12, j12, this.f388389q, this.f388390r, this.f388380h);
        if (this.f388387o) {
            i41Var = new mv0(i41Var);
        }
        a(i41Var);
    }

    @Override // com.yandex.mobile.ads.impl.cf
    public final void e() {
        this.f388384l.release();
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final xc0 getMediaItem() {
        return this.f388380h;
    }

    private nv0(xc0 xc0Var, gn.a aVar, kv0.a aVar2, com.yandex.mobile.ads.exo.drm.g gVar, p90 p90Var, int i12) {
        this.f388381i = (xc0.f) db.a(xc0Var.f391606b);
        this.f388380h = xc0Var;
        this.f388382j = aVar;
        this.f388383k = aVar2;
        this.f388384l = gVar;
        this.f388385m = p90Var;
        this.f388386n = i12;
        this.f388387o = true;
        this.f388388p = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final dd0 a(jd0.b bVar, h9 h9Var, long j12) {
        gn gnVarA = this.f388382j.a();
        ua1 ua1Var = this.f388391s;
        if (ua1Var != null) {
            gnVarA.a(ua1Var);
        }
        return new lv0(this.f388381i.f391654a, gnVarA, this.f388383k.a(c()), this.f388384l, a(bVar), this.f388385m, b(bVar), this, h9Var, this.f388381i.f391658e, this.f388386n);
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void a(dd0 dd0Var) {
        ((lv0) dd0Var).l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.yandex.mobile.ads.impl.mv0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.mobile.ads.impl.cf, com.yandex.mobile.ads.impl.nv0] */
    public final void a(long j12, boolean z12, boolean z13) {
        if (j12 == -9223372036854775807L) {
            j12 = this.f388388p;
        }
        if (!this.f388387o && this.f388388p == j12 && this.f388389q == z12 && this.f388390r == z13) {
            return;
        }
        this.f388388p = j12;
        this.f388389q = z12;
        this.f388390r = z13;
        this.f388387o = false;
        long j13 = this.f388388p;
        i41 i41Var = new i41(j13, j13, this.f388389q, this.f388390r, this.f388380h);
        if (this.f388387o) {
            i41Var = new mv0(i41Var);
        }
        a(i41Var);
    }
}
