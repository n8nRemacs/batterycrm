package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsRepairCalculatorItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class P3 implements dagger.internal.h<O3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.B2> f73831a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73832b;

    public P3(Provider<com.avito.android.B2> provider, Provider<com.avito.android.advert.item.similars.j> provider2) {
        this.f73831a = provider;
        this.f73832b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O3(this.f73831a.get(), this.f73832b.get());
    }
}
