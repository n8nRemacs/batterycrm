package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.ky0;

/* loaded from: classes8.dex */
public final class ad1<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ag1<T> f383529a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ff1<T> f383530b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final a4 f383531c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final lg1 f383532d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final kg1 f383533e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final pf1<T> f383534f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final qg1 f383535g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final ri1 f383536h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final yi1 f383537i;

    public ad1(@j.N Context context, @j.N ag1<T> ag1Var, @j.N yi1 yi1Var, @j.N ff1<T> ff1Var, @j.N ei1 ei1Var, @j.N qg1 qg1Var, @j.N ri1 ri1Var, @j.N hg1 hg1Var, @j.N qf1<T> qf1Var) {
        this.f383529a = ag1Var;
        this.f383530b = ff1Var;
        this.f383535g = qg1Var;
        this.f383536h = ri1Var;
        this.f383537i = yi1Var;
        new jg1(context, ff1Var, yi1Var, qg1Var, ri1Var, qf1Var).a(hg1Var);
        a4 a4Var = new a4();
        this.f383531c = a4Var;
        kg1 kg1Var = new kg1(ag1Var, hg1Var);
        this.f383533e = kg1Var;
        lg1 lg1Var = new lg1(context, ff1Var, a4Var, qg1Var, yi1Var, ei1Var, ri1Var);
        this.f383532d = lg1Var;
        this.f383534f = new pf1<>(ff1Var, ag1Var, yi1Var, kg1Var, lg1Var, qg1Var, a4Var, ri1Var, qf1Var);
    }

    public final void a(@j.N k40 k40Var) {
        this.f383532d.b(k40Var);
    }

    public final void b() {
        this.f383533e.b();
        this.f383529a.a();
    }

    public final void c() {
        this.f383529a.e();
    }

    public final void d() {
        this.f383529a.a(this.f383534f);
        this.f383529a.a(this.f383530b);
        this.f383531c.b(z3.f392173m);
        View view = this.f383537i.getView();
        if (view != null) {
            this.f383536h.a(view, this.f383537i.a());
        }
        this.f383532d.f();
        this.f383535g.b(pg1.f388822b);
    }

    public final void e() {
        this.f383529a.c();
    }

    public final void f() {
        this.f383529a.b();
    }

    public final void a(@j.N ky0.a aVar) {
        this.f383532d.a(aVar);
    }

    public final void a() {
        this.f383533e.b();
        this.f383529a.a((pf1) null);
        this.f383535g.b();
        this.f383532d.e();
        this.f383531c.a();
    }
}
