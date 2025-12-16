package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsCampaignsItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.e0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27950e0 implements dagger.internal.h<C27943d0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73940a;

    public C27950e0(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73940a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27943d0(this.f73940a.get());
    }
}
