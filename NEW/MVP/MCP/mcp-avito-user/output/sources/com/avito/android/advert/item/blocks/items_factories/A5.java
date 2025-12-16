package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: MarketplaceRewardsBannerItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class A5 implements dagger.internal.h<z5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73700a;

    public A5(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73700a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z5(this.f73700a.get());
    }
}
