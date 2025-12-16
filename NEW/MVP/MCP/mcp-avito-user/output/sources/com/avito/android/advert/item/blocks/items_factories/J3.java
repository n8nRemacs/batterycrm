package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsRealtyUspItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class J3 implements dagger.internal.h<I3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73780a;

    public J3(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73780a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I3(this.f73780a.get());
    }
}
