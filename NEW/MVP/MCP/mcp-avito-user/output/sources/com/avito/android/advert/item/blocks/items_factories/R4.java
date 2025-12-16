package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsShowOnMapItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class R4 implements dagger.internal.h<Q4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73847a;

    public R4(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73847a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q4(this.f73847a.get());
    }
}
