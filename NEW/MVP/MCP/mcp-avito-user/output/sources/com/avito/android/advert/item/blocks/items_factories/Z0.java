package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsDevelopmentOffersItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Z0 implements dagger.internal.h<Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73901a;

    public Z0(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73901a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y0(this.f73901a.get());
    }
}
