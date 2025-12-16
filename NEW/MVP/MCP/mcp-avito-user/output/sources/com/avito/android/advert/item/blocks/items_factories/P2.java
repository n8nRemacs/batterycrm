package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsMultiItemParamsItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class P2 implements dagger.internal.h<O2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73830a;

    public P2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73830a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O2(this.f73830a.get());
    }
}
