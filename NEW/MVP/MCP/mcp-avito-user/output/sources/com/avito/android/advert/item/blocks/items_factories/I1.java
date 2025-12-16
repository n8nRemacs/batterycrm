package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpProductsItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class I1 implements dagger.internal.h<H1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73772a;

    public I1(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73772a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H1(this.f73772a.get());
    }
}
