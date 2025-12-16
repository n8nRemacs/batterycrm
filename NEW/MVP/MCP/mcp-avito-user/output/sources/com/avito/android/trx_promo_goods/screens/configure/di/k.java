package com.avito.android.trx_promo_goods.screens.configure.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoGoodsConfigureModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f303461a;

    public k(u uVar) {
        this.f303461a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f303461a.get();
        j.f303460a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
