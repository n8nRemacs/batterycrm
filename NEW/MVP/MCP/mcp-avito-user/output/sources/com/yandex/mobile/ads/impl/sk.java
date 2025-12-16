package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class sk<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final up<V>[] f389972a;

    @SafeVarargs
    public sk(@j.N up<V>... upVarArr) {
        this.f389972a = upVarArr;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        for (up<V> upVar : this.f389972a) {
            upVar.a(v12);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
        for (up<V> upVar : this.f389972a) {
            upVar.c();
        }
    }
}
