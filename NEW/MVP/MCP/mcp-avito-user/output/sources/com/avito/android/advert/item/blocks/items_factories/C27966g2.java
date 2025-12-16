package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelOfferItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.g2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27966g2 implements dagger.internal.h<C27959f2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73955a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f73956b;

    public C27966g2(dagger.internal.u uVar, Provider provider) {
        this.f73955a = provider;
        this.f73956b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27959f2(this.f73955a.get(), (com.avito.android.advert.item.hotel.hotel_offer.m) this.f73956b.get());
    }
}
