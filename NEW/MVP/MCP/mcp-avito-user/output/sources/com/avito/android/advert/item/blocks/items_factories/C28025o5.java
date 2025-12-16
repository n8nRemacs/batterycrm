package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertVideoCallRequestItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.o5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28025o5 implements dagger.internal.h<C28018n5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74000a;

    public C28025o5(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74000a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28018n5(this.f74000a.get());
    }
}
