package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AdvertDetailsParkingAddressItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.e3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27953e3 implements dagger.internal.h<C27946d3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73943a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C43617a> f73944b;

    public C27953e3(Provider<com.avito.android.advert.item.similars.j> provider, Provider<C43617a> provider2) {
        this.f73943a = provider;
        this.f73944b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27946d3(this.f73943a.get(), this.f73944b.get());
    }
}
