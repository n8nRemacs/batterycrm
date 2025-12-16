package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class eo0 implements hx, xn0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sn0 f385045a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hv0 f385046b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final gv0 f385047c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC39327g1 f385048d;

    public eo0(@j.N sn0 sn0Var, @j.N hv0 hv0Var, @j.N f91 f91Var) {
        this.f385045a = sn0Var;
        this.f385046b = hv0Var;
        this.f385047c = f91Var.c();
        this.f385048d = f91Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void a() {
        this.f385046b.a();
        this.f385045a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void b() {
        this.f385046b.a();
        this.f385045a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void invalidate() {
        this.f385045a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void start() {
        this.f385045a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void a(long j12, long j13) {
        long jA2 = this.f385047c.a() + j13;
        long jA3 = this.f385048d.a(j12);
        if (jA2 >= jA3) {
            this.f385045a.b(this);
            this.f385046b.a();
        } else {
            this.f385046b.a(jA3, jA2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void resume() {
    }
}
