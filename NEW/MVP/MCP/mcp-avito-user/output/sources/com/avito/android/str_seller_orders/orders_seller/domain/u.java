package com.avito.android.str_seller_orders.orders_seller.domain;

import com.avito.android.util.R0;
import ez0.InterfaceC40183a;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40183a> f289358a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f289359b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f289360c;

    public u(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f289358a = provider;
        this.f289359b = provider2;
        this.f289360c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f289358a.get(), this.f289359b.get(), (w) this.f289360c.get());
    }
}
