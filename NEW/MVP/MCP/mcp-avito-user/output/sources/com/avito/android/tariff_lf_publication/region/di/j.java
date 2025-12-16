package com.avito.android.tariff_lf_publication.region.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffLfPublicationRegionModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301080a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f301081b;

    public j(u uVar, Provider provider) {
        this.f301080a = uVar;
        this.f301081b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f301080a.get();
        com.avito.konveyor.a aVar2 = this.f301081b.get();
        g.f301076a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new WD0.a());
    }
}
