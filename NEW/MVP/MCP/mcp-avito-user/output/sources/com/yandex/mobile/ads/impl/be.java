package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes8.dex */
public final class be<T extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ViewTreeObserver.OnPreDrawListener f383929a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private up<T> f383930b;

    public be(@Y61.k ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.f383929a = onPreDrawListener;
    }

    public final void a(@Y61.k ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        up<T> upVar = this.f383930b;
        if (upVar != null) {
            upVar.c();
        }
    }

    public final void a(@Y61.k ViewGroup viewGroup, @Y61.k T t12, @Y61.k u80<T> u80Var) {
        viewGroup.removeAllViews();
        fj1.a(viewGroup, t12, viewGroup.getContext(), null, this.f383929a);
        up<T> upVar = (up<T>) u80Var.a();
        this.f383930b = upVar;
        if (upVar != null) {
            upVar.a(t12);
        }
    }
}
