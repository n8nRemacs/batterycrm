package com.avito.android.tariff.cpr.configure.advance.di;

import dB0.C39554a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CprConfigureListModule_ProvideListRecyclerAdapter$_avito_tariff_cpr_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f295216a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f295217b;

    public j(u uVar, Provider provider) {
        this.f295216a = uVar;
        this.f295217b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f295216a.get();
        com.avito.konveyor.a aVar2 = this.f295217b.get();
        e.f295207a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new C39554a());
    }
}
