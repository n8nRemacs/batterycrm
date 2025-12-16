package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsGeoZonesItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class V1 implements dagger.internal.h<U1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.B2> f73869a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73870b;

    public V1(Provider<com.avito.android.B2> provider, Provider<com.avito.android.advert.item.similars.j> provider2) {
        this.f73869a = provider;
        this.f73870b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new U1(this.f73869a.get(), this.f73870b.get());
    }
}
