package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;
import lD.C43617a;

/* compiled from: MarketplaceSalesBannerItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class G5 implements dagger.internal.h<F5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C43617a> f73756a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73757b;

    public G5(Provider<C43617a> provider, Provider<com.avito.android.advert.item.similars.j> provider2) {
        this.f73756a = provider;
        this.f73757b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F5(this.f73757b.get(), this.f73756a.get());
    }
}
