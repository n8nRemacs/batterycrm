package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class mf1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f387989a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final a4 f387990b;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final jf1 f387992d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final gd1 f387993e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final p21 f387994f;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final n2 f387991c = new n2(y6.f391939f);

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final ze1 f387995g = new ze1();

    public mf1(@j.N Context context, @j.N a4 a4Var) {
        this.f387989a = context.getApplicationContext();
        this.f387990b = a4Var;
        this.f387992d = jf1.a(context);
        this.f387993e = new gd1(a4Var);
        this.f387994f = new p21(context, v90.a().b(), a4Var);
    }

    public final void a(@j.N jk1 jk1Var, @j.N Object obj, @j.N c50 c50Var) {
        this.f387994f.a(new lf1(this, c50Var, jk1Var, obj));
    }

    public final void a(@j.N md1 md1Var, @j.N Object obj, @j.N pd1 pd1Var) {
        fd1 fd1VarA = this.f387993e.a(this.f387989a, md1Var, pd1Var);
        this.f387990b.a(z3.f392171k, md1Var);
        this.f387992d.a(this.f387989a, this.f387991c, md1Var, obj, fd1VarA);
    }

    public static void a(mf1 mf1Var, q8 q8Var, ts tsVar) {
        mf1Var.f387991c.a(q8Var);
        mf1Var.f387991c.a(tsVar);
    }
}
