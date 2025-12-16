package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpCalculatorItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class A1 implements dagger.internal.h<C28088z1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73697a;

    public A1(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73697a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28088z1(this.f73697a.get());
    }
}
