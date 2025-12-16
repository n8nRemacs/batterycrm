package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsPromoMechanicsItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class A3 implements dagger.internal.h<C28090z3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.Z0> f73698a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73699b;

    public A3(Provider<com.avito.android.Z0> provider, Provider<com.avito.android.advert.item.similars.j> provider2) {
        this.f73698a = provider;
        this.f73699b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28090z3(this.f73698a.get(), this.f73699b.get());
    }
}
