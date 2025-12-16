package com.avito.android.developments_agency_search.screen.deal_cabinet.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealCabinetModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136976a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f136977b;

    public e(u uVar, Provider provider) {
        this.f136976a = uVar;
        this.f136977b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f136976a.get();
        com.avito.konveyor.a aVar2 = this.f136977b.get();
        d.f136975a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
