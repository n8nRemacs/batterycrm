package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsB2CBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.M> f73418a;

    public B(Provider<com.avito.android.advert.item.blocks.items_factories.M> provider) {
        this.f73418a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A(this.f73418a.get());
    }
}
