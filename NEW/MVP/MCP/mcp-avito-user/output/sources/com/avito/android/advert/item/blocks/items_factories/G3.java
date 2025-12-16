package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsRealtyImvItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class G3 implements dagger.internal.h<F3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73755a;

    public G3(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73755a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F3(this.f73755a.get());
    }
}
