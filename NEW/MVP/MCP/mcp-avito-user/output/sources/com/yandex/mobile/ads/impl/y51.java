package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class y51 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a61 f391933a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hc1 f391934b = new hc1();

    public y51(@j.N a61 a61Var) {
        this.f391933a = a61Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@j.N View view) {
        this.f391934b.a(view.getContext(), this.f391933a.a());
    }
}
