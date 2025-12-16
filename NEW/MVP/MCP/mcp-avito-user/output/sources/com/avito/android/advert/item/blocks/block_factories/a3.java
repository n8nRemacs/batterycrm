package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.B5;
import javax.inject.Provider;

/* compiled from: MarketplaceSalesAdvertPromoBannerBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class a3 implements dagger.internal.h<Z2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B5> f73524a;

    public a3(Provider<B5> provider) {
        this.f73524a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Z2(this.f73524a.get());
    }
}
