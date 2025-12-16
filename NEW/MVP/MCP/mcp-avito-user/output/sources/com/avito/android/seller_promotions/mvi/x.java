package com.avito.android.seller_promotions.mvi;

import javax.inject.Provider;

/* compiled from: SellerPromotionsBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f268066a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f268067b;

    public x(dagger.internal.u uVar, Provider provider) {
        this.f268066a = uVar;
        this.f268067b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((B) this.f268066a.get(), this.f268067b.get());
    }
}
