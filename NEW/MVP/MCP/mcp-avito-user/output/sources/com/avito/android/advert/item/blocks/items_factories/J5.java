package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: MarketplaceSalesBannerOutOfBoundsImageItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class J5 implements dagger.internal.h<I5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73781a;

    public J5(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73781a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I5(this.f73781a.get());
    }
}
