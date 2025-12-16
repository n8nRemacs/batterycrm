package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesPriceItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class C4 implements dagger.internal.h<B4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73718a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.B2> f73719b;

    public C4(Provider<com.avito.android.advert.item.similars.j> provider, Provider<com.avito.android.B2> provider2) {
        this.f73718a = provider;
        this.f73719b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B4(this.f73719b.get(), this.f73718a.get());
    }
}
