package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsDeveloperButtonItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class T0 implements dagger.internal.h<S0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73859a;

    public T0(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73859a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new S0(this.f73859a.get());
    }
}
