package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h4 f390463a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final xf f390464b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final hh1 f390465c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final hu0 f390466d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f390467e;

    public u7(@j.N xf xfVar, @j.N h4 h4Var, @j.N hh1 hh1Var, @j.N hu0 hu0Var) {
        this.f390464b = xfVar;
        this.f390463a = h4Var;
        this.f390465c = hh1Var;
        this.f390466d = hu0Var;
    }

    public final void a() {
        lt0 lt0VarB;
        vf vfVarA = this.f390464b.a();
        if (vfVarA == null || (lt0VarB = this.f390466d.b()) == null) {
            return;
        }
        this.f390467e = true;
        int iC2 = this.f390463a.a().c(com.google.android.exoplayer2.util.U.H(lt0VarB.a()), com.google.android.exoplayer2.util.U.H(this.f390465c.a()));
        if (iC2 == -1) {
            vfVarA.a();
        } else if (iC2 == this.f390463a.a().f346183c) {
            this.f390464b.c();
        } else {
            vfVarA.a();
        }
    }

    public final boolean b() {
        return this.f390467e;
    }
}
