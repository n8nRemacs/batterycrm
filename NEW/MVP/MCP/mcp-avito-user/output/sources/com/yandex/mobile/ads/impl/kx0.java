package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class kx0 implements kotlin.properties.h<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private WeakReference<Object> f387277a;

    public kx0(Object obj) {
        this.f387277a = new WeakReference<>(obj);
    }

    @Override // kotlin.properties.g
    @Y61.l
    public final Object getValue(@Y61.l Object obj, @Y61.k kotlin.reflect.n<?> nVar) {
        return this.f387277a.get();
    }

    @Override // kotlin.properties.h
    public final void setValue(@Y61.l Object obj, @Y61.k kotlin.reflect.n<?> nVar, @Y61.l Object obj2) {
        this.f387277a = new WeakReference<>(obj2);
    }
}
