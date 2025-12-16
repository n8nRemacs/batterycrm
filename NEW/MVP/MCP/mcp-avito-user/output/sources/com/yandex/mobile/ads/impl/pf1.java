package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class pf1<T> implements dg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ff1<T> f388799a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ag1<T> f388800b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final lg1 f388801c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final kg1 f388802d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final qf1<T> f388803e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final aj1 f388804f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final qg1 f388805g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final a4 f388806h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final ri1 f388807i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private zf1 f388808j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f388809k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f388810l;

    public pf1(@j.N ff1<T> ff1Var, @j.N ag1<T> ag1Var, @j.N yi1 yi1Var, @j.N kg1 kg1Var, @j.N lg1 lg1Var, @j.N qg1 qg1Var, @j.N a4 a4Var, @j.N ri1 ri1Var, @j.N qf1<T> qf1Var) {
        this.f388799a = ff1Var;
        this.f388800b = ag1Var;
        this.f388802d = kg1Var;
        this.f388801c = lg1Var;
        this.f388803e = qf1Var;
        this.f388805g = qg1Var;
        this.f388806h = a4Var;
        this.f388807i = ri1Var;
        this.f388804f = qi0.a(yi1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void a() {
        if (this.f388810l) {
            this.f388805g.b(pg1.f388824d);
            this.f388807i.j();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void b() {
        if (this.f388810l) {
            this.f388805g.b(pg1.f388828h);
            this.f388807i.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void c() {
        this.f388810l = true;
        this.f388805g.b(pg1.f388824d);
        if (this.f388804f.a()) {
            this.f388809k = true;
            this.f388807i.a(this.f388800b.d());
        }
        this.f388802d.a();
        this.f388808j = new zf1(this.f388800b, this.f388807i);
        this.f388803e.d(this.f388799a);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void d() {
        this.f388810l = false;
        this.f388809k = false;
        this.f388805g.b(pg1.f388826f);
        this.f388807i.b();
        this.f388802d.b();
        this.f388801c.c();
        this.f388803e.i(this.f388799a);
        this.f388800b.a((pf1) null);
        this.f388803e.g(this.f388799a);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void e() {
        this.f388807i.g();
        this.f388810l = false;
        this.f388809k = false;
        this.f388805g.b(pg1.f388825e);
        this.f388802d.b();
        this.f388801c.d();
        this.f388803e.f(this.f388799a);
        this.f388800b.a((pf1) null);
        this.f388803e.g(this.f388799a);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void f() {
        this.f388805g.b(pg1.f388824d);
        if (this.f388809k) {
            this.f388807i.c();
        } else if (this.f388804f.a()) {
            this.f388809k = true;
            this.f388807i.a(this.f388800b.d());
        }
        this.f388802d.a();
        this.f388803e.h(this.f388799a);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void g() {
        this.f388807i.e();
        this.f388810l = false;
        this.f388809k = false;
        this.f388805g.b(pg1.f388825e);
        this.f388802d.b();
        this.f388801c.d();
        this.f388803e.a(this.f388799a);
        this.f388800b.a((pf1) null);
        this.f388803e.g(this.f388799a);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void h() {
        this.f388805g.b(pg1.f388823c);
        this.f388806h.a(z3.f392173m);
        this.f388803e.e(this.f388799a);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void i() {
        this.f388805g.b(pg1.f388827g);
        if (this.f388809k) {
            this.f388807i.d();
        }
        this.f388803e.b(this.f388799a);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void onVolumeChanged(float f12) {
        this.f388807i.a(f12);
        zf1 zf1Var = this.f388808j;
        if (zf1Var != null) {
            zf1Var.a(f12);
        }
        this.f388803e.a(this.f388799a, f12);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    public final void a(@j.N cg1 cg1Var) {
        pg1 pg1Var;
        this.f388810l = false;
        this.f388809k = false;
        if (this.f388805g.a(pg1.f388823c)) {
            pg1Var = pg1.f388829i;
        } else {
            pg1Var = pg1.f388830j;
        }
        this.f388805g.b(pg1Var);
        this.f388802d.b();
        this.f388801c.a(cg1Var);
        this.f388807i.a(cg1Var);
        this.f388803e.a(this.f388799a, cg1Var);
        this.f388800b.a((pf1) null);
        this.f388803e.g(this.f388799a);
    }
}
