package com.avito.android.str_seller_orders.orders_seller.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.orders_seller.domain.g> f289644a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.orders_seller.domain.m> f289645b;

    /* renamed from: c, reason: collision with root package name */
    public final u f289646c;

    public o(u uVar, Provider provider, Provider provider2) {
        this.f289644a = provider;
        this.f289645b = provider2;
        this.f289646c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f289644a.get(), this.f289645b.get(), (p) this.f289646c.get());
    }
}
