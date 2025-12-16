package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsRealtorBonusBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class J1 implements dagger.internal.h<I1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.A2> f73451a;

    public J1(Provider<com.avito.android.advert.item.blocks.items_factories.A2> provider) {
        this.f73451a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I1(this.f73451a.get());
    }
}
