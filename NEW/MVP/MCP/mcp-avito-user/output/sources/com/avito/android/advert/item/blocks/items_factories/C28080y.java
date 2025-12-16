package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAmenitiesItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28080y implements dagger.internal.h<C28074x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74081a;

    public C28080y(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74081a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28074x(this.f74081a.get());
    }
}
