package com.avito.android.tariff.cpa.prepaid_expense.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublicationAdvanceModule_ProvideAdapterPresenter$_avito_tariff_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f294999a;

    public h(u uVar) {
        this.f294999a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f294999a.get();
        g gVar = g.f294998a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
