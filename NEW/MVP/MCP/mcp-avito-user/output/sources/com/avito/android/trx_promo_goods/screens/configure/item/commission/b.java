package com.avito.android.trx_promo_goods.screens.configure.item.commission;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoGoodsConfigureCommissionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f303485a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f303486b;

    public b(u uVar, Provider provider) {
        this.f303485a = uVar;
        this.f303486b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f303485a.get(), this.f303486b.get());
    }
}
