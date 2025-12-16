package com.avito.android.tariff.cpx.configure.landing.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pB0.C46929a;

/* compiled from: CpxConfigureLandingListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f295905a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f295906b;

    public i(u uVar, Provider provider) {
        this.f295905a = uVar;
        this.f295906b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f295905a.get();
        com.avito.konveyor.a aVar2 = this.f295906b.get();
        f.f295899a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new C46929a());
    }
}
