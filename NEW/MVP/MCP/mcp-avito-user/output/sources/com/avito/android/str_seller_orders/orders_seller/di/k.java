package com.avito.android.str_seller_orders.orders_seller.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersItemsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final e f289316a;

    /* renamed from: b, reason: collision with root package name */
    public final u f289317b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f289318c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.orders_seller.items.b f289319d;

    public k(e eVar, u uVar, Provider provider, com.avito.android.str_seller_orders.orders_seller.items.b bVar) {
        this.f289316a = eVar;
        this.f289317b = uVar;
        this.f289318c = provider;
        this.f289319d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f289317b.get();
        com.avito.konveyor.a aVar2 = this.f289318c.get();
        this.f289319d.getClass();
        com.avito.android.str_seller_orders.orders_seller.items.a aVar3 = new com.avito.android.str_seller_orders.orders_seller.items.a();
        this.f289316a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, aVar3);
    }
}
