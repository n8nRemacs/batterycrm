package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class ao0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final oh1 f383608a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final xi1 f383609b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final jn0 f383610c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final xu0 f383611d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final io0 f383612e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final cy0 f383613f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final xs0 f383614g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final xs0 f383615h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final a f383616i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final xn0 f383617j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private xs0 f383618k;

    public class a implements uf1 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.uf1
        public final void a() {
            ao0.this.f383617j.a();
        }

        @Override // com.yandex.mobile.ads.impl.uf1
        public final void b() {
            ao0.this.f383618k = null;
            ao0.this.f383613f.a();
            ao0.this.f383617j.b();
        }

        @Override // com.yandex.mobile.ads.impl.uf1
        public final void c() {
            ho0 ho0VarB = ao0.this.f383609b.b();
            if (ho0VarB != null) {
                ho0VarB.setClickable(true);
            }
        }

        public /* synthetic */ a(ao0 ao0Var, int i12) {
            this();
        }
    }

    public class b implements iy0 {
        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.iy0
        public final void a() {
            ao0 ao0Var = ao0.this;
            ao0.a(ao0Var, ao0Var.f383614g);
        }

        public /* synthetic */ b(ao0 ao0Var, int i12) {
            this();
        }
    }

    public ao0(@j.N Context context, @j.N du duVar, @j.N ff1 ff1Var, @j.N oh1 oh1Var, @j.N xi1 xi1Var, @j.N wf1 wf1Var, @j.N ri1 ri1Var, @j.N mh1 mh1Var, @j.N xn0 xn0Var) {
        this.f383608a = oh1Var;
        this.f383609b = xi1Var;
        this.f383617j = xn0Var;
        lo0 lo0Var = new lo0(xi1Var);
        this.f383610c = new jn0(duVar);
        this.f383612e = new io0(duVar);
        hg1 hg1Var = new hg1();
        new nn0(xi1Var, duVar, lo0Var, xn0Var).a(hg1Var);
        wn0 wn0Var = new wn0(context, duVar, ff1Var, lo0Var, wf1Var, ri1Var, hg1Var, mh1Var);
        jy0 jy0Var = new jy0(duVar, ff1Var, hg1Var);
        jo0 jo0Var = new jo0(duVar, oh1Var);
        xu0 xu0Var = new xu0();
        this.f383611d = xu0Var;
        this.f383615h = new xs0(xi1Var, wn0Var, jo0Var, xu0Var);
        this.f383614g = new xs0(xi1Var, jy0Var, jo0Var, xu0Var);
        int i12 = 0;
        this.f383616i = new a(this, i12);
        this.f383613f = new cy0(xi1Var, new b(this, i12));
    }

    public final void a() {
        ho0 ho0VarB = this.f383609b.b();
        if (ho0VarB != null) {
            ho0VarB.setClickable(false);
        }
    }

    public final void b(@j.N ho0 ho0Var) {
        xs0 xs0Var = this.f383618k;
        if (xs0Var != null) {
            xs0Var.a(ho0Var);
        }
        this.f383612e.b(ho0Var);
    }

    public final void a(@j.N ho0 ho0Var) {
        this.f383610c.a(this.f383608a);
        this.f383612e.a(ho0Var);
        rh1 rh1VarB = ho0Var.b();
        this.f383611d.getClass();
        rh1VarB.a().setVisibility(0);
        xs0 xs0Var = this.f383615h;
        this.f383618k = xs0Var;
        xs0Var.a(this.f383616i);
        this.f383618k.a();
    }

    public static void a(ao0 ao0Var, xs0 xs0Var) {
        ao0Var.f383618k = xs0Var;
        xs0Var.a(ao0Var.f383616i);
        ao0Var.f383618k.a();
    }
}
