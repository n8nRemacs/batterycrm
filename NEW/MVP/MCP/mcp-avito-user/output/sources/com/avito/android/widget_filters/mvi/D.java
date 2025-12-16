package com.avito.android.widget_filters.mvi;

import javax.inject.Provider;

/* compiled from: WidgetFiltersViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f329949a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.utils.b> f329950b;

    public D(dagger.internal.u uVar, Provider provider) {
        this.f329949a = uVar;
        this.f329950b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C((MP0.a) this.f329949a.get(), this.f329950b.get());
    }
}
