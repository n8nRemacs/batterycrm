package com.avito.android.developments_agency_search.screen.big_filters.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BigFiltersModule_ProvideCheckBoxItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136591a;

    public f(u uVar) {
        this.f136591a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.adapter.checkbox.d dVar = (com.avito.android.search.filter.adapter.checkbox.d) this.f136591a.get();
        c.f136585a.getClass();
        return new com.avito.android.search.filter.adapter.checkbox.b(dVar);
    }
}
