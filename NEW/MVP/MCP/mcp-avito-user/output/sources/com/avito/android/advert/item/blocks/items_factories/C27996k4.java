package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsScrollUpItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.k4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27996k4 implements dagger.internal.h<C27989j4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73981a;

    public C27996k4(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73981a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27989j4(this.f73981a.get());
    }
}
