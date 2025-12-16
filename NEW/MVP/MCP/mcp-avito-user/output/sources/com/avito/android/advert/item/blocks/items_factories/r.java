package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAddressGeoDistanceItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class r implements dagger.internal.h<C28033q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74016a;

    public r(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74016a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28033q(this.f74016a.get());
    }
}
