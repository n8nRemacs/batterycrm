package com.avito.android.tariff_lf.package_info.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffPackageInfoModule_ProvideAdapterPresenter$_avito_tariff_lf_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299221a;

    public i(u uVar) {
        this.f299221a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f299221a.get();
        h hVar = h.f299220a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
