package com.avito.android.trx_promo_impl.status_screen.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoStatusBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f304454a;

    public d(u uVar) {
        this.f304454a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.trx_promo_impl.status_screen.domain.a) this.f304454a.get());
    }
}
