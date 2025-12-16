package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertBadgeBarItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27935c implements dagger.internal.h<C27928b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73927a;

    public C27935c(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73927a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27928b(this.f73927a.get());
    }
}
