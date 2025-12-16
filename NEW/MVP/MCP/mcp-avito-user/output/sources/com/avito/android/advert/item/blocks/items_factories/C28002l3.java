package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsPortfolioBlockItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.l3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28002l3 implements dagger.internal.h<C27995k3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.B2> f73986a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73987b;

    public C28002l3(Provider<com.avito.android.B2> provider, Provider<com.avito.android.advert.item.similars.j> provider2) {
        this.f73986a = provider;
        this.f73987b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27995k3(this.f73986a.get(), this.f73987b.get());
    }
}
