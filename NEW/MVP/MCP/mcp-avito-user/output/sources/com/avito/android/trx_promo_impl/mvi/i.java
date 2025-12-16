package com.avito.android.trx_promo_impl.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f304356a;

    public i(u uVar) {
        this.f304356a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.trx_promo_impl.domain.a) this.f304356a.get());
    }
}
