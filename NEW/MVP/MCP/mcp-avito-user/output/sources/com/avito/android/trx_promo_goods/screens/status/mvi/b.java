package com.avito.android.trx_promo_goods.screens.status.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoGoodsStatusActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.status.domain.b f303837a;

    public b(com.avito.android.trx_promo_goods.screens.status.domain.b bVar) {
        this.f303837a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.trx_promo_goods.screens.status.domain.a) this.f303837a.get());
    }
}
