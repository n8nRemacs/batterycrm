package com.avito.android.trx_promo_impl.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoGetScreenDataUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f304170a;

    /* renamed from: b, reason: collision with root package name */
    public final u f304171b;

    public d(l lVar, u uVar) {
        this.f304170a = lVar;
        this.f304171b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f304170a.f393949a, (com.avito.android.trx_promo_impl.data.a) this.f304171b.get());
    }
}
