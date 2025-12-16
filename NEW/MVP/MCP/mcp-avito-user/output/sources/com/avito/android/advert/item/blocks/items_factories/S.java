package com.avito.android.advert.item.blocks.items_factories;

import h4.InterfaceC40768a;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBadgeBarLightItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73848a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f73849b;

    public S(dagger.internal.u uVar, Provider provider) {
        this.f73848a = provider;
        this.f73849b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q(this.f73848a.get(), (InterfaceC40768a) this.f73849b.get());
    }
}
