package com.avito.android.tariff.cpx.configure.advance.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureAdvanceListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f295590a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f295591b;

    public g(u uVar, Provider provider) {
        this.f295590a = uVar;
        this.f295591b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f295590a.get();
        com.avito.konveyor.a aVar2 = this.f295591b.get();
        d.f295585a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
