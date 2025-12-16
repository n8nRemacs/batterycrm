package com.avito.android.widget_filters.mvi;

import javax.inject.Provider;

/* compiled from: WidgetFiltersReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B> f329939a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f329940b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.use_case.n> f329941c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.use_case.e> f329942d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.use_case.h> f329943e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.use_case.k> f329944f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.v> f329945g;

    public A(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f329939a = provider;
        this.f329940b = uVar;
        this.f329941c = provider2;
        this.f329942d = provider3;
        this.f329943e = provider4;
        this.f329944f = provider5;
        this.f329945g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z(this.f329939a.get(), (MP0.e) this.f329940b.get(), this.f329941c.get(), this.f329942d.get(), this.f329943e.get(), this.f329944f.get(), this.f329945g.get());
    }
}
