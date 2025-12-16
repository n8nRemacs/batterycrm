package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsGeoMarketReportBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class L0 implements dagger.internal.h<K0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.N1> f73456a;

    public L0(Provider<com.avito.android.advert.item.blocks.items_factories.N1> provider) {
        this.f73456a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K0(this.f73456a.get());
    }
}
