package com.avito.android.widget_filters.domain;

import javax.inject.Provider;

/* compiled from: WidgetFiltersParametersUpdaterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.use_case.n> f329841a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.use_case.e> f329842b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.use_case.k> f329843c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.domain.use_case.h> f329844d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f329845e;

    public A(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f329841a = provider;
        this.f329842b = provider2;
        this.f329843c = provider3;
        this.f329844d = provider4;
        this.f329845e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z(this.f329841a.get(), this.f329842b.get(), this.f329843c.get(), this.f329844d.get(), (v) this.f329845e.get());
    }
}
