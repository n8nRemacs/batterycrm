package com.avito.android.trx_promo_impl.item.commission;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoCommissionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f304225a;

    public b(u uVar) {
        this.f304225a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f304225a.get());
    }
}
