package com.avito.android.trx_promo_impl.item.discount_v2;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoStrDiscountV2BannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f304271a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f304272b;

    public b(u uVar, Provider provider) {
        this.f304271a = uVar;
        this.f304272b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f304271a.get(), this.f304272b.get());
    }
}
