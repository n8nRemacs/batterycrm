package com.avito.android.extended_profile_adverts.di;

import javax.inject.Provider;

/* compiled from: ProfileAdvertsAdapterModule_ProvideDataAwareAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30493b f150797a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<androidx.recyclerview.widget.C> f150798b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f150799c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f150800d;

    public e(C30493b c30493b, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f150797a = c30493b;
        this.f150798b = provider;
        this.f150799c = provider2;
        this.f150800d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f150798b);
        com.avito.konveyor.adapter.a aVar = this.f150799c.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f150800d.get();
        this.f150797a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
