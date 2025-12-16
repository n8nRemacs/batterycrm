package com.avito.android.orders.feature.beduin_orders_list.mvi;

import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: UpdateOrderUseCase_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.orders.feature.beduin_orders_list.data.e f210072a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f210073b;

    public D(com.avito.android.orders.feature.beduin_orders_list.data.e eVar, Provider provider) {
        this.f210072a = eVar;
        this.f210073b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C((com.avito.android.orders.feature.beduin_orders_list.data.a) this.f210072a.get(), this.f210073b.get());
    }
}
