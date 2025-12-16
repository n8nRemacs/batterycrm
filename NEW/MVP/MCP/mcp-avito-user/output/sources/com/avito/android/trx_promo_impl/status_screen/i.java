package com.avito.android.trx_promo_impl.status_screen;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TrxPromoStatusViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.status_screen.mvi.g f304448a;

    public i(com.avito.android.trx_promo_impl.status_screen.mvi.g gVar) {
        this.f304448a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.trx_promo_impl.status_screen.mvi.f fVar = (com.avito.android.trx_promo_impl.status_screen.mvi.f) this.f304448a.get();
        i2.f411430a.getClass();
        return new h(fVar, i2.a.f411433c);
    }
}
