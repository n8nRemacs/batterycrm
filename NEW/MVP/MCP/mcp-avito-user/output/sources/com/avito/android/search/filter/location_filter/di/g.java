package com.avito.android.search.filter.location_filter.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationFiltersAdapterModule_ProvideRecyclerAdapter$_avito_search_filter_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f263610a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f263611b;

    public g(u uVar, Provider provider) {
        this.f263610a = uVar;
        this.f263611b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f263610a.get();
        com.avito.konveyor.a aVar2 = this.f263611b.get();
        int i12 = c.f263596a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
