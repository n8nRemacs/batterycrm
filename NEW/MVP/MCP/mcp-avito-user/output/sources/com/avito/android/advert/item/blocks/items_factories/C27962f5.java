package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsTiresBannerItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.f5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27962f5 implements dagger.internal.h<C27955e5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73953a;

    public C27962f5(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73953a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27955e5(this.f73953a.get());
    }
}
