package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAutoRecallMeItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73743a;

    public F(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73743a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E(this.f73743a.get());
    }
}
