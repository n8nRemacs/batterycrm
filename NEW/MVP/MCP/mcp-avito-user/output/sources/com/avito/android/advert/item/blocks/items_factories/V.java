package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsBeduinItemsItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class V implements dagger.internal.h<U> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73867a;

    public V(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73867a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new U(this.f73867a.get());
    }
}
