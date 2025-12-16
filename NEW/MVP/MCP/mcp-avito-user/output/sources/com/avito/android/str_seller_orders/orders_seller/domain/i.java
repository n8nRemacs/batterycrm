package com.avito.android.str_seller_orders.orders_seller.domain;

import com.avito.android.J0;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersBookingItemsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f289335a;

    public i(Provider<J0> provider) {
        this.f289335a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f289335a.get());
    }
}
