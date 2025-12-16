package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;

/* loaded from: classes8.dex */
public final class dv0 implements gg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final l50 f384692a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final j50 f384693b = new j50();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final yu0 f384694c = new yu0();

    public dv0(@j.N l50 l50Var) {
        this.f384692a = l50Var;
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j12, long j13) {
        k50 k50VarA = this.f384692a.a();
        ProgressBar progressBarJ = null;
        lu luVarB = k50VarA != null ? k50VarA.b() : null;
        if (luVarB != null) {
            this.f384693b.getClass();
            se1 se1VarA = j50.a(luVarB);
            if (se1VarA != null) {
                progressBarJ = se1VarA.j();
            }
        }
        ProgressBar progressBar = progressBarJ;
        if (progressBar != null) {
            this.f384694c.a(progressBar, j13, j12);
        }
    }
}
