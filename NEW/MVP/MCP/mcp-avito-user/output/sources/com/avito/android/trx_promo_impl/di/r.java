package com.avito.android.trx_promo_impl.di;

import bG0.C25509a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f304163a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f304164b;

    public r(u uVar, Provider provider) {
        this.f304163a = uVar;
        this.f304164b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f304163a.get();
        com.avito.konveyor.a aVar2 = this.f304164b.get();
        o.f304155a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new C25509a());
    }
}
