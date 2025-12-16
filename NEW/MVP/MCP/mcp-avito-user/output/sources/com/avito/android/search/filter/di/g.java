package com.avito.android.search.filter.di;

import javax.inject.Provider;

/* compiled from: FiltersCoreModule_ProvideDiffCalculator$_avito_search_filter_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.adapter.b> f263226a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f263227b;

    public g(dagger.internal.u uVar, Provider provider) {
        this.f263226a = provider;
        this.f263227b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.adapter.b bVar = this.f263226a.get();
        com.avito.android.search.filter.adapter.e eVar = (com.avito.android.search.filter.adapter.e) this.f263227b.get();
        f fVar = f.f263225a;
        return new com.avito.android.recycler.data_aware.i(bVar, new com.avito.android.recycler.data_aware.j(), true, eVar);
    }
}
