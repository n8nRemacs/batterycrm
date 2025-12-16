package com.avito.android.tariff.cpa.configure_advance.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfigureAdvanceModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f294271a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f294272b;

    public h(u uVar, Provider provider) {
        this.f294271a = uVar;
        this.f294272b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f294271a.get();
        com.avito.konveyor.a aVar2 = this.f294272b.get();
        d dVar = d.f294266a;
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new com.avito.android.tariff.cpa.configure_advance.ui.b());
    }
}
