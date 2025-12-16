package com.avito.android.str_seller_orders.orders_seller.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.orders_seller.domain.s> f289553a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.orders_seller.domain.c f289554b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.orders_seller.domain.d> f289555c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.orders_seller.domain.p> f289556d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.orders_seller.domain.m> f289557e;

    /* renamed from: f, reason: collision with root package name */
    public final u f289558f;

    public e(Provider provider, com.avito.android.str_seller_orders.orders_seller.domain.c cVar, Provider provider2, Provider provider3, Provider provider4, u uVar) {
        this.f289553a = provider;
        this.f289554b = cVar;
        this.f289555c = provider2;
        this.f289556d = provider3;
        this.f289557e = provider4;
        this.f289558f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f289553a.get(), (com.avito.android.str_seller_orders.orders_seller.domain.b) this.f289554b.get(), this.f289555c.get(), this.f289556d.get(), this.f289557e.get(), (com.avito.android.str_seller_orders.orders_seller.domain.j) this.f289558f.get());
    }
}
