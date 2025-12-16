package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class pg0 implements g6, xt0, InterfaceC39378x1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final og0 f388812a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final vt0 f388813b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.instream.d f388814c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39304a2 f388815d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final a f388816e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final re1 f388817f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private h6 f388818g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private C39375w1 f388819h;

    public class a implements th1 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.th1
        public final void a() {
            pg0.this.f388813b.b();
            if (pg0.this.f388819h != null) {
                pg0.this.f388819h.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.th1
        public final void onVideoCompleted() {
            pg0.a(pg0.this);
            pg0.this.f388813b.b();
            pg0.this.f388814c.a(null);
            if (pg0.this.f388818g != null) {
                pg0.this.f388818g.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.th1
        public final void onVideoError() {
            pg0.this.f388813b.b();
            pg0.this.f388814c.a(null);
            if (pg0.this.f388819h != null) {
                pg0.this.f388819h.c();
            }
            if (pg0.this.f388818g != null) {
                pg0.this.f388818g.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.th1
        public final void onVideoPaused() {
            pg0.this.f388813b.b();
        }

        @Override // com.yandex.mobile.ads.impl.th1
        public final void onVideoResumed() {
            pg0.this.f388813b.a();
        }

        public /* synthetic */ a(pg0 pg0Var, int i12) {
            this();
        }
    }

    public pg0(@j.N Context context, @j.N y40 y40Var, @j.N C39304a2 c39304a2, @j.N v40 v40Var, @j.N h50 h50Var, @j.N l50 l50Var, @j.N com.yandex.mobile.ads.instream.e eVar, @j.N com.yandex.mobile.ads.instream.d dVar) {
        this.f388814c = dVar;
        this.f388815d = c39304a2;
        re1 re1Var = new re1();
        this.f388817f = re1Var;
        this.f388812a = new og0(context, c39304a2, v40Var, h50Var, l50Var, re1Var);
        this.f388816e = new a(this, 0);
        this.f388813b = new wt0(eVar, c39304a2).a(y40Var, this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void f() {
        this.f388813b.b();
        C39375w1 c39375w1 = this.f388819h;
        if (c39375w1 != null) {
            c39375w1.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
    public final void g() {
        this.f388819h = null;
        this.f388814c.e();
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void prepare() {
        h6 h6Var = this.f388818g;
        if (h6Var != null) {
            h6Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void resume() {
        boolean z12 = this.f388819h != null;
        boolean zA2 = this.f388815d.a();
        if (!z12) {
            this.f388814c.e();
        } else if (zA2) {
            this.f388814c.c();
            this.f388819h.f();
        } else {
            this.f388814c.e();
            this.f388819h.d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void start() {
        this.f388814c.a(this.f388816e);
        this.f388814c.e();
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void a(@j.P h6 h6Var) {
        this.f388818g = h6Var;
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void c() {
        this.f388813b.b();
        C39375w1 c39375w1 = this.f388819h;
        if (c39375w1 != null) {
            c39375w1.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
    public final void d() {
        this.f388814c.c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
    public final void e() {
        this.f388819h = null;
        this.f388814c.e();
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void a(@j.P re1 re1Var) {
        this.f388817f.a(re1Var);
    }

    public final void b(@j.N p60 p60Var) {
        C39375w1 c39375w1A = this.f388812a.a(p60Var);
        C39375w1 c39375w1 = this.f388819h;
        if (c39375w1A != c39375w1 && c39375w1 != null) {
            c39375w1.a((InterfaceC39378x1) null);
            this.f388819h.e();
        }
        this.f388819h = c39375w1A;
        c39375w1A.a(this);
        this.f388819h.d();
    }

    public final void a(@j.N p60 p60Var) {
        C39375w1 c39375w1A = this.f388812a.a(p60Var);
        C39375w1 c39375w1 = this.f388819h;
        if (c39375w1A != c39375w1 && c39375w1 != null) {
            c39375w1.a((InterfaceC39378x1) null);
            this.f388819h.e();
        }
        this.f388819h = c39375w1A;
        c39375w1A.a(this);
        this.f388819h.g();
    }

    public static void a(pg0 pg0Var) {
        C39375w1 c39375w1 = pg0Var.f388819h;
        if (c39375w1 != null) {
            c39375w1.a((InterfaceC39378x1) null);
            pg0Var.f388819h.e();
        }
    }
}
