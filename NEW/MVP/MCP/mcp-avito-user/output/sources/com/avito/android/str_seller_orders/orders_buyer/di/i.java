package com.avito.android.str_seller_orders.orders_buyer.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersBuyerItemsModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f288961a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f288962b;

    public i(u uVar, Provider provider) {
        this.f288961a = uVar;
        this.f288962b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f288961a.get();
        com.avito.konveyor.a aVar2 = this.f288962b.get();
        f.f288958a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
