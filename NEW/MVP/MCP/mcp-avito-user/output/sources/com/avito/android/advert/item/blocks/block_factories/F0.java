package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpOfferBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class F0 implements dagger.internal.h<E0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.C1> f73434a;

    public F0(Provider<com.avito.android.advert.item.blocks.items_factories.C1> provider) {
        this.f73434a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E0(this.f73434a.get());
    }
}
