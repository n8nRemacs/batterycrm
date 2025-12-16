package com.avito.android.str_seller_orders.orders_buyer.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersBuyerActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f289073a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f289074b;

    public c(u uVar, Provider provider) {
        this.f289073a = uVar;
        this.f289074b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.str_seller_orders.orders_buyer.domain.a) this.f289073a.get(), this.f289074b.get());
    }
}
