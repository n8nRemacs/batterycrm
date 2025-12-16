package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelPromoWidgetItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.j2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27987j2 implements dagger.internal.h<C27980i2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73974a;

    public C27987j2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73974a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27980i2(this.f73974a.get());
    }
}
