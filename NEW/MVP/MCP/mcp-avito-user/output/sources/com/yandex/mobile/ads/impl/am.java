package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class am implements qb1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final bm f383596a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final cc f383597b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final j50 f383598c = new j50();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final g50 f383599d;

    public am(@j.N Context context, @j.N o40 o40Var, @j.N k60 k60Var, @j.N p60 p60Var, @j.N ff1 ff1Var, @j.N ri1 ri1Var, @j.N hs0 hs0Var, @j.N re1 re1Var) {
        this.f383599d = new g50(o40Var, y50.a(q21.b().a(context)));
        this.f383596a = new bm(context, p60Var, k60Var, re1Var, ff1Var, ri1Var);
        this.f383597b = new cc(new vb(context, ff1Var, p60Var, ri1Var, re1Var, hs0Var, q50.a(context, ff1Var)).a());
    }

    @Override // com.yandex.mobile.ads.impl.qb1
    public final void a(@j.N lu luVar) {
        this.f383598c.getClass();
        se1 se1VarA = j50.a(luVar);
        if (se1VarA != null) {
            luVar.removeView(se1VarA.a());
        }
        this.f383598c.getClass();
        j50.a(luVar, null);
    }

    @Override // com.yandex.mobile.ads.impl.qb1
    public final void a(@j.N lu luVar, @j.N t50 t50Var) {
        se1 se1VarA = this.f383599d.a(luVar);
        if (se1VarA != null) {
            this.f383596a.a(se1VarA, t50Var);
            this.f383597b.a(se1VarA);
            luVar.addView(se1VarA.a(), new ViewGroup.LayoutParams(-1, -1));
        }
        this.f383598c.getClass();
        j50.a(luVar, se1VarA);
    }
}
