package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsDomotekaReportTeaserItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.i1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27979i1 implements dagger.internal.h<C27972h1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73969a;

    public C27979i1(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73969a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27972h1(this.f73969a.get());
    }
}
