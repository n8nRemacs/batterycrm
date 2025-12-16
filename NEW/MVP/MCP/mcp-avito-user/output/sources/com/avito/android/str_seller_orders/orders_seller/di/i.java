package com.avito.android.str_seller_orders.orders_seller.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersItemsModule_ProvideFiltersRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final e f289311a;

    /* renamed from: b, reason: collision with root package name */
    public final u f289312b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f289313c;

    public i(e eVar, u uVar, Provider provider) {
        this.f289311a = eVar;
        this.f289312b = uVar;
        this.f289313c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f289312b.get();
        com.avito.konveyor.a aVar2 = this.f289313c.get();
        this.f289311a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
