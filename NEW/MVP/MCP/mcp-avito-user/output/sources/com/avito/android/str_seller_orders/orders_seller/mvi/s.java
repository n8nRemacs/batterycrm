package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f289648a;

    public s(Provider<J0> provider) {
        this.f289648a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f289648a.get());
    }
}
