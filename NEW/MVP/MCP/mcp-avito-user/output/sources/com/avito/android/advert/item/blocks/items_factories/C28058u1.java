package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsFMPBannerItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.u1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28058u1 implements dagger.internal.h<C28052t1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74036a;

    public C28058u1(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74036a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28052t1(this.f74036a.get());
    }
}
