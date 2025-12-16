package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealTrustFactorsItemsFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.h4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27975h4 implements dagger.internal.h<C27968g4> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.item.safedeal.trust_factors.c f73964a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.safedeal.trust_factors.h f73965b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<I6.a> f73966c;

    public C27975h4(com.avito.android.advert.item.safedeal.trust_factors.c cVar, com.avito.android.advert.item.safedeal.trust_factors.h hVar, Provider provider) {
        this.f73964a = cVar;
        this.f73965b = hVar;
        this.f73966c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f73964a.getClass();
        return new C27968g4(new com.avito.android.advert.item.safedeal.trust_factors.a(), (com.avito.android.advert.item.safedeal.trust_factors.f) this.f73965b.get(), this.f73966c.get());
    }
}
