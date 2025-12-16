package com.avito.android.extended_profile_serp.di;

import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpModule_ProvideDataAwareAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class q implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<androidx.recyclerview.widget.C> f152862a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f152863b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f152864c;

    public q(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f152862a = provider;
        this.f152863b = provider2;
        this.f152864c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f152862a);
        com.avito.konveyor.adapter.a aVar = this.f152863b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f152864c.get();
        C30538h.f152853a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
