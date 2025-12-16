package com.avito.android.developments_agency_search.screen.big_filters.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BigFiltersModule_ProvideSuggestLocationItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136600a;

    public l(u uVar) {
        this.f136600a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.adapter.suggest_location.d dVar = (com.avito.android.search.filter.adapter.suggest_location.d) this.f136600a.get();
        c.f136585a.getClass();
        return new com.avito.android.search.filter.adapter.suggest_location.b(dVar);
    }
}
