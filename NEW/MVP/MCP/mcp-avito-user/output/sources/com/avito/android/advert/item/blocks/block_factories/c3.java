package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.E5;
import javax.inject.Provider;

/* compiled from: MarketplaceSalesBannerBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class c3 implements dagger.internal.h<b3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E5> f73535a;

    public c3(Provider<E5> provider) {
        this.f73535a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b3(this.f73535a.get());
    }
}
