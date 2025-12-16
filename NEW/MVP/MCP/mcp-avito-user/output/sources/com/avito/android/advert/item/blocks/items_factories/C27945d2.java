package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelDescriptionItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.d2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27945d2 implements dagger.internal.h<C27938c2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73934a;

    public C27945d2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73934a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27938c2(this.f73934a.get());
    }
}
