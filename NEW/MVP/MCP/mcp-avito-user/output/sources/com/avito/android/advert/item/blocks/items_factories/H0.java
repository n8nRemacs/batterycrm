package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsCreditCalculatorItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class H0 implements dagger.internal.h<G0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.credits.q> f73760a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73761b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Boolean> f73762c;

    public H0(Provider<com.avito.android.credits.q> provider, Provider<com.avito.android.advert.item.similars.j> provider2, Provider<Boolean> provider3) {
        this.f73760a = provider;
        this.f73761b = provider2;
        this.f73762c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G0(this.f73760a.get(), this.f73761b.get(), this.f73762c.get().booleanValue());
    }
}
