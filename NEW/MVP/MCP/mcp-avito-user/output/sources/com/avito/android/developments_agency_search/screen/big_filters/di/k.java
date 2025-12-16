package com.avito.android.developments_agency_search.screen.big_filters.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BigFiltersModule_ProvideSelectItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136599a;

    public k(u uVar) {
        this.f136599a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.adapter.select.d dVar = (com.avito.android.search.filter.adapter.select.d) this.f136599a.get();
        c.f136585a.getClass();
        return new com.avito.android.search.filter.adapter.select.b(dVar);
    }
}
