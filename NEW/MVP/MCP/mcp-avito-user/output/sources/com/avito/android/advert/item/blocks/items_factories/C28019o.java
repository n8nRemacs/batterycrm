package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAdditionalSellerTitleItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28019o implements dagger.internal.h<C28012n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73996a;

    public C28019o(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73996a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28012n(this.f73996a.get());
    }
}
