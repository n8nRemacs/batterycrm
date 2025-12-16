package com.avito.android.trx_promo_goods.screens.configure.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoGoodsConfigureBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.domain.b f303603a;

    public j(com.avito.android.trx_promo_goods.screens.configure.domain.b bVar) {
        this.f303603a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.trx_promo_goods.screens.configure.domain.a) this.f303603a.get());
    }
}
