package com.avito.android.trx_promo_impl.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f304156a;

    public p(u uVar) {
        this.f304156a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f304156a.get();
        o.f304155a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
