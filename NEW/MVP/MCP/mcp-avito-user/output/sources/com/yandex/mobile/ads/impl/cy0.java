package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class cy0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xi1 f384486a;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ey0 f384488c;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ag f384487b = new ag();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ay0 f384489d = new ay0();

    public cy0(@j.N xi1 xi1Var, @j.N iy0 iy0Var) {
        this.f384486a = xi1Var;
        this.f384488c = new ey0(xi1Var, iy0Var);
    }

    public final void a() {
        ho0 ho0VarB = this.f384486a.b();
        if (ho0VarB != null) {
            dy0 dy0VarB = ho0VarB.a().b();
            this.f384488c.a(dy0VarB);
            this.f384487b.a(ho0VarB.c().getBitmap(), new by0(this, ho0VarB, dy0VarB));
        }
    }
}
