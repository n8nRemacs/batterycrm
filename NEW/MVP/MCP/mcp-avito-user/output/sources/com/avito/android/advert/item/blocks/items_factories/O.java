package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsB2CItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class O implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73816a;

    public O(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73816a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N(this.f73816a.get());
    }
}
