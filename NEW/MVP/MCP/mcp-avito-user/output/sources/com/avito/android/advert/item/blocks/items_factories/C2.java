package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsInformationAboutItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class C2 implements dagger.internal.h<B2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73716a;

    public C2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73716a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B2(this.f73716a.get());
    }
}
