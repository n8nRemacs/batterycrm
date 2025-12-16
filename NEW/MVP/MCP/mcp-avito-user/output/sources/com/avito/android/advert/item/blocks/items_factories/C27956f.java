package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAbuseItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27956f implements dagger.internal.h<C27949e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73948a;

    public C27956f(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73948a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27949e(this.f73948a.get());
    }
}
