package com.avito.android.developments_agency_search.screen.big_filters.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BigFiltersModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136586a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f136587b;

    public d(u uVar, Provider provider) {
        this.f136586a = uVar;
        this.f136587b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f136586a.get();
        com.avito.konveyor.a aVar2 = this.f136587b.get();
        c.f136585a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
