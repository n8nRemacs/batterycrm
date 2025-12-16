package com.avito.android.trx_promo_goods.screens.status.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoGoodsStatusBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.status.domain.b f303839a;

    public d(com.avito.android.trx_promo_goods.screens.status.domain.b bVar) {
        this.f303839a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.trx_promo_goods.screens.status.domain.a) this.f303839a.get());
    }
}
