package com.avito.android.developments_agency_search.screen.realty_agency_search.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchResultItemModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class u implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f138637a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f138638b;

    public u(dagger.internal.u uVar, Provider provider) {
        this.f138637a = uVar;
        this.f138638b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f138637a.get();
        com.avito.konveyor.a aVar2 = this.f138638b.get();
        t.f138636a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
