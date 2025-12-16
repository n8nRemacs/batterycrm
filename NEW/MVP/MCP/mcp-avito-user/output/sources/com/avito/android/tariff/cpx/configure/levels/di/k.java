package com.avito.android.tariff.cpx.configure.levels.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxConfigureLevelsListModule_ProvideListRecyclerAdapter$_avito_tariff_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f296121a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f296122b;

    public k(u uVar, Provider provider) {
        this.f296121a = uVar;
        this.f296122b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f296121a.get();
        com.avito.konveyor.a aVar2 = this.f296122b.get();
        g.f296115a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new com.avito.android.tariff.cpx.configure.levels.a());
    }
}
