package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsMortgageCalculatorItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class I2 implements dagger.internal.h<H2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73773a;

    public I2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73773a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H2(this.f73773a.get());
    }
}
