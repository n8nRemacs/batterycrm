package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceDescriptionButtonItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.r3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28042r3 implements dagger.internal.h<C28037q3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74019a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f74020b;

    public C28042r3(dagger.internal.u uVar, Provider provider) {
        this.f74019a = provider;
        this.f74020b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28037q3(this.f74019a.get(), (com.avito.android.advert.item.price_description_button.a) this.f74020b.get());
    }
}
