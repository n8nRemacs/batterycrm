package com.avito.android.str_seller_orders.orders_filters.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersFiltersViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.orders_filters.domain.e> f289212a;

    /* renamed from: b, reason: collision with root package name */
    public final u f289213b;

    public p(u uVar, Provider provider) {
        this.f289212a = provider;
        this.f289213b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f289212a.get(), (com.avito.android.str_seller_orders.orders_filters.domain.e) this.f289213b.get());
    }
}
