package com.avito.android.advert.item.blocks.items_factories;

import aO.InterfaceC19797c;
import javax.inject.Provider;

/* compiled from: AdvertDetailsInstallmentsBlockItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class F2 implements dagger.internal.h<E2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73744a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC19797c> f73745b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Boolean> f73746c;

    public F2(Provider<com.avito.android.advert.item.similars.j> provider, Provider<InterfaceC19797c> provider2, Provider<Boolean> provider3) {
        this.f73744a = provider;
        this.f73745b = provider2;
        this.f73746c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E2(this.f73744a.get(), this.f73745b.get(), this.f73746c.get().booleanValue());
    }
}
