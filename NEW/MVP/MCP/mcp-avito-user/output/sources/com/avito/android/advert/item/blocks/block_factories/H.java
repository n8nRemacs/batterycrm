package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsBuyerTrustBannerBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.W> f73441a;

    public H(Provider<com.avito.android.advert.item.blocks.items_factories.W> provider) {
        this.f73441a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G(this.f73441a.get());
    }
}
