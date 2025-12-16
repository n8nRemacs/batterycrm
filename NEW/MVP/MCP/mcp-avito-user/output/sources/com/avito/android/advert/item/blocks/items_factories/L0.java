package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsDeliverySuggestsFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class L0 implements dagger.internal.h<K0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73788a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.price_with_delivery.c> f73789b;

    public L0(Provider<com.avito.android.advert.item.similars.j> provider, Provider<com.avito.android.advert_core.price_with_delivery.c> provider2) {
        this.f73788a = provider;
        this.f73789b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K0(this.f73788a.get(), this.f73789b.get());
    }
}
