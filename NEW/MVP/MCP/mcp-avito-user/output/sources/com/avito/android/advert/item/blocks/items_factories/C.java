package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAnchorTrustFactorsFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73715a;

    public C(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73715a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B(this.f73715a.get());
    }
}
