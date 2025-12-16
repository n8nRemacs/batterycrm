package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsNormalizedAndHistoryPricesBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.n1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27872n1 implements dagger.internal.h<C27868m1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.Q2> f73632a;

    public C27872n1(Provider<com.avito.android.advert.item.blocks.items_factories.Q2> provider) {
        this.f73632a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27868m1(this.f73632a.get());
    }
}
