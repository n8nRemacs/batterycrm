package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xz0.C50025b;

/* compiled from: StrSellerOrdersActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.str_seller_orders.strsellerorders.domain.a> f289922a;

    /* renamed from: b, reason: collision with root package name */
    public final xz0.c f289923b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f289924c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f289925d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f289926e;

    public i(Provider provider, xz0.c cVar, Provider provider2, Provider provider3, Provider provider4) {
        this.f289922a = provider;
        this.f289923b = cVar;
        this.f289924c = provider2;
        this.f289925d = provider3;
        this.f289926e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f289922a.get(), (C50025b) this.f289923b.get(), this.f289924c.get(), this.f289925d.get(), this.f289926e.get());
    }
}
