package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalSearchFilterMultiSelectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f273501a;

    public n(Provider<g> provider) {
        this.f273501a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f273501a.get());
    }
}
