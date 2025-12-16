package com.avito.android.developments_agency_search.screen.big_filters.di;

import com.avito.android.developments_agency_search.screen.big_filters.di.m;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BigFiltersModule_ProvideLocationGroupItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136597a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f136598b;

    public j(u uVar, Provider provider) {
        this.f136597a = uVar;
        this.f136598b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.adapter.location_group.d dVar = (com.avito.android.search.filter.adapter.location_group.d) this.f136597a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) ((m.b.c) this.f136598b).get();
        c.f136585a.getClass();
        return new com.avito.android.search.filter.adapter.location_group.b(dVar, aVar);
    }
}
