package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsComfortableDealInfoItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.q0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28034q0 implements dagger.internal.h<C28027p0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74006a;

    public C28034q0(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74006a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28027p0(this.f74006a.get());
    }
}
