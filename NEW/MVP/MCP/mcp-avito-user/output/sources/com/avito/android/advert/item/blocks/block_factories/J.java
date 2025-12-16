package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsBuzzoolaCreditBannerBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.Z> f73449a;

    public J(Provider<com.avito.android.advert.item.blocks.items_factories.Z> provider) {
        this.f73449a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I(this.f73449a.get());
    }
}
