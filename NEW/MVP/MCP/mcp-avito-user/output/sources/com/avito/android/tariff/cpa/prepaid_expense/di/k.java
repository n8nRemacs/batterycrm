package com.avito.android.tariff.cpa.prepaid_expense.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublicationAdvanceModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f295003a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f295004b;

    public k(u uVar, Provider provider) {
        this.f295003a = uVar;
        this.f295004b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f295003a.get();
        com.avito.konveyor.a aVar2 = this.f295004b.get();
        g gVar = g.f294998a;
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new com.avito.android.tariff.cpa.prepaid_expense.ui.b());
    }
}
