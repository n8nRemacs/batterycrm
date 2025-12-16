package com.avito.android.search.filter.location_filter.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationFiltersAdapterModule_ProvideDiffCalculator$_avito_search_filter_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.adapter.b> f263598a;

    /* renamed from: b, reason: collision with root package name */
    public final u f263599b;

    public e(u uVar, Provider provider) {
        this.f263598a = provider;
        this.f263599b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.adapter.b bVar = this.f263598a.get();
        com.avito.android.search.filter.adapter.e eVar = (com.avito.android.search.filter.adapter.e) this.f263599b.get();
        int i12 = c.f263596a;
        return new com.avito.android.recycler.data_aware.i(bVar, new com.avito.android.recycler.data_aware.j(), true, eVar);
    }
}
