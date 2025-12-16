package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class x61<T extends View> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final x9<T> f391567b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final T f391568c;

    /* JADX WARN: Multi-variable type inference failed */
    public x61(@j.N View view, @j.N rk rkVar) {
        this.f391568c = view;
        this.f391567b = rkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f391567b.a(this.f391568c);
    }
}
