package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersOpenParams;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f289625a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.orders_seller.domain.s> f289626b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.orders_seller.domain.c f289627c;

    /* renamed from: d, reason: collision with root package name */
    public final u f289628d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f289629e;

    public g(dagger.internal.l lVar, Provider provider, com.avito.android.str_seller_orders.orders_seller.domain.c cVar, u uVar, Provider provider2) {
        this.f289625a = lVar;
        this.f289626b = provider;
        this.f289627c = cVar;
        this.f289628d = uVar;
        this.f289629e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((StrSellerOrdersOpenParams) this.f289625a.f393949a, this.f289626b.get(), (com.avito.android.str_seller_orders.orders_seller.domain.b) this.f289627c.get(), (com.avito.android.str_core.c) this.f289628d.get(), this.f289629e.get());
    }
}
