package com.avito.android.mortgage.person_form.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PersonFormModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f200554a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f200555b;

    /* renamed from: c, reason: collision with root package name */
    public final A00.b f200556c;

    public g(Provider provider, Provider provider2, A00.b bVar) {
        this.f200554a = provider;
        this.f200555b = provider2;
        this.f200556c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f200554a.get();
        com.avito.konveyor.a aVar2 = this.f200555b.get();
        A00.a aVar3 = (A00.a) this.f200556c.get();
        e.f200552a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, aVar3);
    }
}
