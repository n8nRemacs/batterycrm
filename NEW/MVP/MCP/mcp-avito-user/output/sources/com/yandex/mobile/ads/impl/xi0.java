package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class xi0 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ri0 f391726a;

    /* renamed from: b, reason: collision with root package name */
    private final long f391727b;

    public xi0(@Y61.k ri0 ri0Var, long j12) {
        this.f391726a = ri0Var;
        this.f391727b = j12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        this.f391726a.a(this.f391727b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        this.f391726a.b();
    }
}
