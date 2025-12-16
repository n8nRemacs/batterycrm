package com.avito.android.trx_promo_impl;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TrxPromoViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.mvi.l f304314a;

    public m(com.avito.android.trx_promo_impl.mvi.l lVar) {
        this.f304314a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.trx_promo_impl.mvi.k kVar = (com.avito.android.trx_promo_impl.mvi.k) this.f304314a.get();
        i2.f411430a.getClass();
        return new l(kVar, i2.a.f411433c);
    }
}
