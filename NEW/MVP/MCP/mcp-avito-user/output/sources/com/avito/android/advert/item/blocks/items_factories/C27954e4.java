package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealPaymentBlockItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.e4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27954e4 implements dagger.internal.h<C27947d4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.Z0> f73945a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73946b;

    public C27954e4(Provider<com.avito.android.Z0> provider, Provider<com.avito.android.advert.item.similars.j> provider2) {
        this.f73945a = provider;
        this.f73946b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27947d4(this.f73945a.get(), this.f73946b.get());
    }
}
