package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class hj0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final k60 f386147a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final p4 f386148b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final t50 f386149c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final gj0 f386150d;

    public hj0(@j.N k60 k60Var, @j.N p4 p4Var, @j.N t50 t50Var, @j.P gj0 gj0Var) {
        this.f386147a = k60Var;
        this.f386148b = p4Var;
        this.f386149c = t50Var;
        this.f386150d = gj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z12 = !(this.f386147a.getVolume() == 0.0f);
        this.f386148b.a(this.f386149c.a(), z12);
        gj0 gj0Var = this.f386150d;
        if (gj0Var != null) {
            gj0Var.setMuted(z12);
        }
    }
}
