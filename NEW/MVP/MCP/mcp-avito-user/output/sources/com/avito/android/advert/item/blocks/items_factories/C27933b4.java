package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealInfoItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.b4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27933b4 implements dagger.internal.h<C27926a4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73924a;

    public C27933b4(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73924a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27926a4(this.f73924a.get());
    }
}
