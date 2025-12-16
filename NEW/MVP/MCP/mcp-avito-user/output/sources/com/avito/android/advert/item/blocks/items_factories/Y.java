package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsBuyerTrustBannerItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Y implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73890a;

    public Y(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73890a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X(this.f73890a.get());
    }
}
