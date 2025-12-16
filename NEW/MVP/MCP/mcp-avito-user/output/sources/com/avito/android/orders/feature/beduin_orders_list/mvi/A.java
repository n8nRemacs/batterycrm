package com.avito.android.orders.feature.beduin_orders_list.mvi;

import javax.inject.Provider;
import n50.InterfaceC44196b;

/* compiled from: LoadContentUseCase_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.orders.feature.beduin_orders_list.data.e f210063a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.orders.feature.beduin_orders_list.f> f210064b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f210065c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC44196b> f210066d;

    public A(com.avito.android.orders.feature.beduin_orders_list.data.e eVar, Provider provider, dagger.internal.l lVar, Provider provider2) {
        this.f210063a = eVar;
        this.f210064b = provider;
        this.f210065c = lVar;
        this.f210066d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new z((com.avito.android.orders.feature.beduin_orders_list.data.a) this.f210063a.get(), this.f210064b.get(), (com.avito.android.orders.feature.beduin_orders_list.i) this.f210065c.f393949a, this.f210066d.get());
    }
}
