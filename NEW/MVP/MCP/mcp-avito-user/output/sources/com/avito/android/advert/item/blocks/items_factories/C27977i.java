package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAdditionalSellerButtonItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27977i implements dagger.internal.h<C27970h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73968a;

    public C27977i(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73968a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27970h(this.f73968a.get());
    }
}
