package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsStickedSalesBannerItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.a5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27927a5 implements dagger.internal.h<Z4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.Z0> f73912a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.sales_banner.analytics.b f73913b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73914c;

    public C27927a5(Provider provider, com.avito.android.advert.item.sales_banner.analytics.b bVar, Provider provider2) {
        this.f73912a = provider;
        this.f73913b = bVar;
        this.f73914c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Z4(this.f73912a.get(), (com.avito.android.advert.item.sales_banner.analytics.a) this.f73913b.get(), this.f73914c.get());
    }
}
