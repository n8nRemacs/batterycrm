package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsGeoZonesBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class P0 implements dagger.internal.h<O0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.T1> f73474a;

    public P0(Provider<com.avito.android.advert.item.blocks.items_factories.T1> provider) {
        this.f73474a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O0(this.f73474a.get());
    }
}
