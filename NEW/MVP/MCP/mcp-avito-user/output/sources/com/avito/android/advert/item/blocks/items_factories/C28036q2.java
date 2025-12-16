package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelShowOnMapItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.q2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28036q2 implements dagger.internal.h<C28029p2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74009a;

    public C28036q2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74009a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28029p2(this.f74009a.get());
    }
}
