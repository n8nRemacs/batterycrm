package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsGeoReferenceBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class N0 implements dagger.internal.h<M0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.Q1> f73464a;

    public N0(Provider<com.avito.android.advert.item.blocks.items_factories.Q1> provider) {
        this.f73464a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new M0(this.f73464a.get());
    }
}
