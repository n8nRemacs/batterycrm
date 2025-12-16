package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsMortgageSnippetItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class M2 implements dagger.internal.h<L2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73810a;

    public M2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73810a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L2(this.f73810a.get());
    }
}
