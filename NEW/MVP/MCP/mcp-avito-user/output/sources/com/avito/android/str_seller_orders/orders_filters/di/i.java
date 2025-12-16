package com.avito.android.str_seller_orders.orders_filters.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersFiltersModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f289148a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f289149b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.orders_filters.items.b f289150c;

    public i(u uVar, Provider provider, com.avito.android.str_seller_orders.orders_filters.items.b bVar) {
        this.f289148a = uVar;
        this.f289149b = provider;
        this.f289150c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f289148a.get();
        com.avito.konveyor.a aVar2 = this.f289149b.get();
        this.f289150c.getClass();
        com.avito.android.str_seller_orders.orders_filters.items.a aVar3 = new com.avito.android.str_seller_orders.orders_filters.items.a();
        f.f289145a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, aVar3);
    }
}
