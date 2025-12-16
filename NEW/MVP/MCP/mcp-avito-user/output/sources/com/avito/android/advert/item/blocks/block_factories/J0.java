package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsGalleryBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class J0 implements dagger.internal.h<I0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.K1> f73450a;

    public J0(Provider<com.avito.android.advert.item.blocks.items_factories.K1> provider) {
        this.f73450a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I0(this.f73450a.get());
    }
}
