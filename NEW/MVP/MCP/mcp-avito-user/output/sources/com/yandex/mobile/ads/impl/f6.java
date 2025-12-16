package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ws0 f385184a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final qe1 f385185b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final tu0 f385186c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private e6 f385187d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private e6 f385188e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private e6 f385189f;

    public f6(@j.N Context context, @j.N o60 o60Var, @j.N v40 v40Var, @j.N l50 l50Var, @j.N com.yandex.mobile.ads.instream.e eVar, @j.N com.yandex.mobile.ads.instream.d dVar, @j.N re1 re1Var) {
        this.f385185b = re1Var;
        this.f385186c = new tu0(eVar);
        this.f385184a = new ws0(context, o60Var, v40Var, l50Var, eVar, dVar);
    }

    @j.N
    public final e6 a() {
        if (this.f385188e == null) {
            e6 e6Var = new e6(this.f385184a.a());
            e6Var.a(this.f385185b);
            this.f385188e = e6Var;
        }
        return this.f385188e;
    }

    @j.P
    public final e6 b() {
        g6 g6VarB;
        if (this.f385189f == null && (g6VarB = this.f385184a.b()) != null) {
            e6 e6Var = new e6(g6VarB);
            e6Var.a(this.f385185b);
            this.f385189f = e6Var;
        }
        return this.f385189f;
    }

    @j.P
    public final e6 c() {
        g6 g6VarC;
        if (this.f385187d == null && this.f385186c.a() && (g6VarC = this.f385184a.c()) != null) {
            e6 e6Var = new e6(g6VarC);
            e6Var.a(this.f385185b);
            this.f385187d = e6Var;
        }
        return this.f385187d;
    }
}
