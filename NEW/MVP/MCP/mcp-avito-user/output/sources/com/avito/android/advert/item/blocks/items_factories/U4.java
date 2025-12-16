package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsSimilarsItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class U4 implements dagger.internal.h<T4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73866a;

    public U4(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73866a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new T4(this.f73866a.get());
    }
}
