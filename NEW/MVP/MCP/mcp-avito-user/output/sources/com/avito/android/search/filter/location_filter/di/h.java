package com.avito.android.search.filter.location_filter.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationFiltersAdapterModule_ProvideRedesignDataAwareAdapterPresenter$_avito_search_filter_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f263612a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f263613b;

    /* renamed from: c, reason: collision with root package name */
    public final u f263614c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f263612a = provider;
        this.f263613b = provider2;
        this.f263614c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f263612a.get();
        com.avito.konveyor.adapter.a aVar = this.f263613b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f263614c.get();
        int i12 = c.f263596a;
        return new com.avito.android.recycler.data_aware.d(dagger.internal.l.a(c12), aVar, eVar);
    }
}
