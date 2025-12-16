package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideDataAwareAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class H implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<androidx.recyclerview.widget.C> f319262a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f319263b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f319264c;

    public H(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f319262a = provider;
        this.f319263b = provider2;
        this.f319264c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f319262a);
        com.avito.konveyor.adapter.a aVar = this.f319263b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f319264c.get();
        A.f319242a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
