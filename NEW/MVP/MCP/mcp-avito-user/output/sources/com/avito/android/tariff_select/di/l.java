package com.avito.android.tariff_select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffSelectListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301210a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f301211b;

    public l(u uVar, Provider provider) {
        this.f301210a = uVar;
        this.f301211b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f301210a.get();
        com.avito.konveyor.a aVar2 = this.f301211b.get();
        i.f301206a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
