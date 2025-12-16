package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsDeliveryTrustFactorsBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.p0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27879p0 implements dagger.internal.h<C27875o0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.M0> f73639a;

    public C27879p0(Provider<com.avito.android.advert.item.blocks.items_factories.M0> provider) {
        this.f73639a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27875o0(this.f73639a.get());
    }
}
