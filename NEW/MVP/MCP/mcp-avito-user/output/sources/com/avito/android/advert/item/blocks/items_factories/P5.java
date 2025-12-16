package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: ModelSpecsItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class P5 implements dagger.internal.h<O5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73833a;

    public P5(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73833a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O5(this.f73833a.get());
    }
}
