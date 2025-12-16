package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsComfortableDealPromoItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.t0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28051t0 implements dagger.internal.h<C28045s0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74027a;

    public C28051t0(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74027a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28045s0(this.f74027a.get());
    }
}
