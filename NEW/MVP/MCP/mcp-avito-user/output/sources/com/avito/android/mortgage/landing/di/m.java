package com.avito.android.mortgage.landing.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import v00.C49136a;

/* compiled from: LandingModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f199614a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f199615b;

    /* renamed from: c, reason: collision with root package name */
    public final v00.b f199616c;

    public m(Provider provider, Provider provider2, v00.b bVar) {
        this.f199614a = provider;
        this.f199615b = provider2;
        this.f199616c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f199614a.get();
        com.avito.konveyor.a aVar2 = this.f199615b.get();
        C49136a c49136a = (C49136a) this.f199616c.get();
        l.f199613a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, c49136a);
    }
}
