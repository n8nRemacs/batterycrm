package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.y5;
import javax.inject.Provider;

/* compiled from: MarketplaceRewardsBannerBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Y2 implements dagger.internal.h<X2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<y5> f73514a;

    public Y2(Provider<y5> provider) {
        this.f73514a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X2(this.f73514a.get());
    }
}
