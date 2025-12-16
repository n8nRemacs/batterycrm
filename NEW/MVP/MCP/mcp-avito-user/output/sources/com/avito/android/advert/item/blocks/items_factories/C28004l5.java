package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsWalletInfoItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.l5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28004l5 implements dagger.internal.h<C27997k5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73988a;

    public C28004l5(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73988a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27997k5(this.f73988a.get());
    }
}
