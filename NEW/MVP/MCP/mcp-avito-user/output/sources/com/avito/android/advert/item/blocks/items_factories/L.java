package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAvitoForBusinessItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class L implements dagger.internal.h<K> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73787a;

    public L(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73787a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K(this.f73787a.get());
    }
}
