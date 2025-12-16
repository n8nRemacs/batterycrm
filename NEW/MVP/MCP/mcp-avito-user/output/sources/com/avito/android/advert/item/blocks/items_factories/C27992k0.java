package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsClosingReasonItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.k0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27992k0 implements dagger.internal.h<C27985j0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73977a;

    public C27992k0(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73977a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27985j0(this.f73977a.get());
    }
}
