package com.avito.android.tariff_lf.package_info.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffPackageInfoModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299226a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f299227b;

    public n(u uVar, Provider provider) {
        this.f299226a = uVar;
        this.f299227b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f299226a.get();
        com.avito.konveyor.a aVar2 = this.f299227b.get();
        h hVar = h.f299220a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
