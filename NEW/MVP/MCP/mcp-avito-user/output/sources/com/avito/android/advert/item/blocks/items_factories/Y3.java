package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsRichGeoBlockItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Y3 implements dagger.internal.h<X3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73900a;

    public Y3(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73900a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X3(this.f73900a.get());
    }
}
