package com.avito.android.str_seller_orders.orders_seller.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersItemsModule_ProvideFiltersAdapterPresenter$_avito_str_seller_orders_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f289307a;

    /* renamed from: b, reason: collision with root package name */
    public final u f289308b;

    public g(e eVar, u uVar) {
        this.f289307a = eVar;
        this.f289308b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f289308b.get();
        this.f289307a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
