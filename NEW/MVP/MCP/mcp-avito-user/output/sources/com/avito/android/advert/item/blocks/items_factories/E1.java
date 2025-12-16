package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpOfferItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class E1 implements dagger.internal.h<D1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73737a;

    public E1(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73737a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D1(this.f73737a.get());
    }
}
