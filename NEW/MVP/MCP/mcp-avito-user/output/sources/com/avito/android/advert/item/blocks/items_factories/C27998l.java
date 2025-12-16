package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAdditionalSellerFeaturesItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27998l implements dagger.internal.h<C27991k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73983a;

    public C27998l(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73983a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27991k(this.f73983a.get());
    }
}
