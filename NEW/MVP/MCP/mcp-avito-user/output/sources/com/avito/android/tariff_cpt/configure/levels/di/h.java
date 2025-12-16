package com.avito.android.tariff_cpt.configure.levels.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rC0.C47523a;

/* compiled from: TariffCptConfigureLevelsListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f297855a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f297856b;

    public h(u uVar, Provider provider) {
        this.f297855a = uVar;
        this.f297856b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f297855a.get();
        com.avito.konveyor.a aVar2 = this.f297856b.get();
        e.f297851a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new C47523a());
    }
}
