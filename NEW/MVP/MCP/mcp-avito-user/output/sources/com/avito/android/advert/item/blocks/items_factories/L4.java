package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesTransportationGeoItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class L4 implements dagger.internal.h<K4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.B2> f73800a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73801b;

    public L4(Provider<com.avito.android.B2> provider, Provider<com.avito.android.advert.item.similars.j> provider2) {
        this.f73800a = provider;
        this.f73801b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K4(this.f73800a.get(), this.f73801b.get());
    }
}
