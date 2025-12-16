package com.avito.android.trx_promo_goods.screens.configure.item.discount_v2;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoDiscountV2BannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f303521a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f303522b;

    public b(u uVar, Provider provider) {
        this.f303521a = uVar;
        this.f303522b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f303521a.get(), this.f303522b.get());
    }
}
