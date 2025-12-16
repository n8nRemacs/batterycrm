package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class gy0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xi1 f385857a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final iy0 f385858b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ey0 f385859c;

    public gy0(@j.N xi1 xi1Var, @j.N iy0 iy0Var, @j.N ey0 ey0Var) {
        this.f385857a = xi1Var;
        this.f385858b = iy0Var;
        this.f385859c = ey0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@j.N View view) {
        ho0 ho0VarB = this.f385857a.b();
        if (ho0VarB != null) {
            dy0 dy0VarB = ho0VarB.a().b();
            this.f385859c.getClass();
            dy0VarB.setBackground(null);
            dy0VarB.setVisibility(8);
            dy0VarB.a().setOnClickListener(null);
            this.f385858b.a();
        }
    }
}
