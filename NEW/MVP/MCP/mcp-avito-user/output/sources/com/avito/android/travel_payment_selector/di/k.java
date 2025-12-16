package com.avito.android.travel_payment_selector.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentSelectorModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f302606a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f302607b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f302608c;

    /* renamed from: d, reason: collision with root package name */
    public final u f302609d;

    public k(g gVar, dagger.internal.f fVar, Provider provider, u uVar) {
        this.f302606a = gVar;
        this.f302607b = fVar;
        this.f302608c = provider;
        this.f302609d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f302607b);
        com.avito.konveyor.adapter.h hVar = this.f302608c.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f302609d.get();
        this.f302606a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
