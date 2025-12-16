package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: MarketplaceStocksItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class M5 implements dagger.internal.h<L5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73812a;

    public M5(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73812a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L5(this.f73812a.get());
    }
}
