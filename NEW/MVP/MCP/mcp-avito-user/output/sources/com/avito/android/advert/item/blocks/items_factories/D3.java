package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsRatingItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class D3 implements dagger.internal.h<C3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73728a;

    public D3(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73728a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C3(this.f73728a.get());
    }
}
