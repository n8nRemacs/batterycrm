package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsStatisticsBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class G2 implements dagger.internal.h<F2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.W2> f73440a;

    public G2(Provider<com.avito.android.advert.item.blocks.items_factories.W2> provider) {
        this.f73440a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F2(this.f73440a.get());
    }
}
