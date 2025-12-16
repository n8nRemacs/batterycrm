package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class jy0 implements of1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final in0 f387000a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ff1<yn0> f387001b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final kg1 f387002c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final a f387003d = new a(this, 0);

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private uf1 f387004e;

    public class a implements dg1 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void a() {
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void c() {
            jy0.this.f387002c.a();
            if (jy0.this.f387004e != null) {
                jy0.this.f387004e.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void d() {
            jy0.this.f387002c.b();
            ((du) jy0.this.f387000a).a((dg1) null);
            if (jy0.this.f387004e != null) {
                jy0.this.f387004e.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void e() {
            jy0.this.f387002c.b();
            ((du) jy0.this.f387000a).a((dg1) null);
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void g() {
            jy0.this.f387002c.b();
            ((du) jy0.this.f387000a).a((dg1) null);
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void h() {
            ((du) jy0.this.f387000a).j();
        }

        public /* synthetic */ a(jy0 jy0Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void a(@j.N cg1 cg1Var) {
            jy0.this.f387002c.b();
            ((du) jy0.this.f387000a).a((dg1) null);
            ((du) jy0.this.f387000a).f();
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void b() {
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void f() {
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void i() {
        }

        @Override // com.yandex.mobile.ads.impl.dg1
        public final void onVolumeChanged(float f12) {
        }
    }

    public jy0(@j.N du duVar, @j.N ff1 ff1Var, @j.N hg1 hg1Var) {
        this.f387000a = duVar;
        this.f387001b = ff1Var;
        this.f387002c = new kg1(new kn0(duVar), hg1Var);
    }

    @Override // com.yandex.mobile.ads.impl.of1
    public final void play() {
        ((du) this.f387000a).a(this.f387003d);
        ((du) this.f387000a).a(this.f387001b.c());
    }

    @Override // com.yandex.mobile.ads.impl.of1
    public final void stop() {
        this.f387002c.b();
        ((du) this.f387000a).i();
        ((du) this.f387000a).l();
    }

    @Override // com.yandex.mobile.ads.impl.of1
    public final void a(@j.P uf1 uf1Var) {
        this.f387004e = uf1Var;
    }
}
