package com.avito.android.trx_promo_impl.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.data.mapper.c f304370a;

    public p(com.avito.android.trx_promo_impl.data.mapper.c cVar) {
        this.f304370a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f304370a.getClass();
        return new o(new com.avito.android.trx_promo_impl.data.mapper.b());
    }
}
