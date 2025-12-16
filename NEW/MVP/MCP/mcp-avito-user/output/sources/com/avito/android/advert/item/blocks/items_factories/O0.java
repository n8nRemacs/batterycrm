package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsDeliveryTrustFactorsFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class O0 implements dagger.internal.h<N0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73817a;

    public O0(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73817a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N0(this.f73817a.get());
    }
}
