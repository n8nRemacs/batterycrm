package com.avito.android.tariff_cpt.levels.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCptLevelsListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298597a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f298598b;

    public f(u uVar, Provider provider) {
        this.f298597a = uVar;
        this.f298598b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f298597a.get();
        com.avito.konveyor.a aVar2 = this.f298598b.get();
        c.f298593a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
