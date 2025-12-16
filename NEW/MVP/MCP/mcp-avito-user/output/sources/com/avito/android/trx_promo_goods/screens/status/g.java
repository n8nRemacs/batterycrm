package com.avito.android.trx_promo_goods.screens.status;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TrxPromoGoodsStatusViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.status.mvi.g f303835a;

    public g(com.avito.android.trx_promo_goods.screens.status.mvi.g gVar) {
        this.f303835a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.trx_promo_goods.screens.status.mvi.f fVar = (com.avito.android.trx_promo_goods.screens.status.mvi.f) this.f303835a.get();
        i2.f411430a.getClass();
        return new f(fVar, i2.a.f411433c);
    }
}
