package com.avito.android.trx_promo_goods.screens.configure.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoGoodsConfigureModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f303468a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f303469b;

    public n(u uVar, Provider provider) {
        this.f303468a = uVar;
        this.f303469b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f303468a.get();
        com.avito.konveyor.a aVar2 = this.f303469b.get();
        j.f303460a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new NF0.a());
    }
}
