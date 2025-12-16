package com.avito.android.str_seller_orders.orders_seller.domain;

import javax.inject.Provider;
import yF0.InterfaceC50108b;

/* compiled from: LoadBannerUseCase_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50108b> f289331a;

    public c(Provider<InterfaceC50108b> provider) {
        this.f289331a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f289331a.get());
    }
}
