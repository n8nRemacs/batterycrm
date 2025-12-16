package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpProductsBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class H0 implements dagger.internal.h<G0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.G1> f73442a;

    public H0(Provider<com.avito.android.advert.item.blocks.items_factories.G1> provider) {
        this.f73442a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G0(this.f73442a.get());
    }
}
