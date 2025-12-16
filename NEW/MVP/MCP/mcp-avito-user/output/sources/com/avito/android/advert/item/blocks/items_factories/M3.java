package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsRentAgreementItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class M3 implements dagger.internal.h<L3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73811a;

    public M3(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73811a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L3(this.f73811a.get());
    }
}
