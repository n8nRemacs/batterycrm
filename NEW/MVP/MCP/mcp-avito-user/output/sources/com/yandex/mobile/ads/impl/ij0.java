package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ij0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final k60 f386498a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final p4 f386499b;

    public ij0(@j.N k60 k60Var) {
        this.f386498a = k60Var;
        this.f386499b = new p4(k60Var);
    }

    public final void a(@j.N se1 se1Var, @j.N t50 t50Var) {
        float fA2 = t50Var.a();
        boolean zD2 = t50Var.d();
        gj0 gj0VarI = se1Var.i();
        hj0 hj0Var = new hj0(this.f386498a, this.f386499b, t50Var, gj0VarI);
        if (gj0VarI != null) {
            gj0VarI.setOnClickListener(hj0Var);
            gj0VarI.setMuted(zD2);
        }
        this.f386499b.a(fA2, zD2);
    }
}
