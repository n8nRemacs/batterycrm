package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.H5;
import javax.inject.Provider;

/* compiled from: MarketplaceSalesBannerOutOfBoundsImageBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class e3 implements dagger.internal.h<d3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H5> f73550a;

    public e3(Provider<H5> provider) {
        this.f73550a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d3(this.f73550a.get());
    }
}
