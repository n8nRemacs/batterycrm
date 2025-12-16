package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsBadgeBarLightFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.P> f73426a;

    public D(Provider<com.avito.android.advert.item.blocks.items_factories.P> provider) {
        this.f73426a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C(this.f73426a.get());
    }
}
