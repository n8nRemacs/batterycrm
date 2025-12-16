package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class wn0 implements of1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final in0 f391445a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final rf1 f391446b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ad1<yn0> f391447c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final mh1 f391448d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private uf1 f391449e;

    public class a implements qf1<yn0> {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void a(@j.N ff1<yn0> ff1Var, float f12) {
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void d(@j.N ff1<yn0> ff1Var) {
            wn0.this.f391446b.b();
            if (wn0.this.f391449e != null) {
                wn0.this.f391449e.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void e(@j.N ff1<yn0> ff1Var) {
            wn0.this.f391447c.c();
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void f(@j.N ff1<yn0> ff1Var) {
            a();
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void i(@j.N ff1<yn0> ff1Var) {
            wn0.this.f391446b.a();
            a();
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void j(@j.N ff1<yn0> ff1Var) {
            wn0.this.f391448d.g();
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void k(@j.N ff1<yn0> ff1Var) {
            wn0.this.f391448d.c();
        }

        public /* synthetic */ a(wn0 wn0Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void a(@j.N ff1<yn0> ff1Var) {
            a();
        }

        private void a() {
            if (wn0.this.f391449e != null) {
                wn0.this.f391449e.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void a(@j.N ff1<yn0> ff1Var, @j.N cg1 cg1Var) {
            ((du) wn0.this.f391445a).f();
            if (wn0.this.f391449e != null) {
                wn0.this.f391449e.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void b(@j.N ff1<yn0> ff1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void c(@j.N ff1<yn0> ff1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void g(@j.N ff1<yn0> ff1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.qf1
        public final void h(@j.N ff1<yn0> ff1Var) {
        }
    }

    public wn0(@j.N Context context, @j.N du duVar, @j.N ff1 ff1Var, @j.N lo0 lo0Var, @j.N wf1 wf1Var, @j.N ri1 ri1Var, @j.N hg1 hg1Var, @j.N mh1 mh1Var) {
        this.f391445a = duVar;
        this.f391448d = mh1Var;
        this.f391446b = new rf1(context, wf1Var);
        ad1<yn0> ad1Var = new ad1<>(context, new kn0(duVar), lo0Var, ff1Var, new co0(lo0Var), new qg1(), ri1Var, hg1Var, new a(this, 0));
        this.f391447c = ad1Var;
        ad1Var.a(wf1Var);
    }

    @Override // com.yandex.mobile.ads.impl.of1
    public final void play() {
        this.f391447c.d();
    }

    @Override // com.yandex.mobile.ads.impl.of1
    public final void stop() {
        this.f391447c.b();
        ((du) this.f391445a).l();
    }

    @Override // com.yandex.mobile.ads.impl.of1
    public final void a(@j.P uf1 uf1Var) {
        this.f391449e = uf1Var;
    }
}
