package com.avito.android.tariff.cpx.info.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxInfoListModule_ProvideListRecyclerAdapter$_avito_tariff_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f296412a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f296413b;

    public k(u uVar, Provider provider) {
        this.f296412a = uVar;
        this.f296413b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f296412a.get();
        com.avito.konveyor.a aVar2 = this.f296413b.get();
        h.f296404a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
