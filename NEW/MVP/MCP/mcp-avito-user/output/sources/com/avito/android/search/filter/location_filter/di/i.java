package com.avito.android.search.filter.location_filter.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationFiltersAdapterModule_ProvideRedesignListUpdateCallback$_avito_search_filter_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.j> f263615a;

    public i(Provider<com.avito.konveyor.adapter.j> provider) {
        this.f263615a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = this.f263615a.get();
        int i12 = c.f263596a;
        return jVar;
    }
}
