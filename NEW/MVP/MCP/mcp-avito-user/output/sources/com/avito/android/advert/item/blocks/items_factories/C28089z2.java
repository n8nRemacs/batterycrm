package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsImvCarsV4FactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.z2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28089z2 implements dagger.internal.h<C28083y2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74088a;

    public C28089z2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74088a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28083y2(this.f74088a.get());
    }
}
