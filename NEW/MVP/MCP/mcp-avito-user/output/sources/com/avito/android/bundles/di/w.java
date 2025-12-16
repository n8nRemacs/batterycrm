package com.avito.android.bundles.di;

import javax.inject.Provider;

/* compiled from: VasBundlesModule_ProvideDataAwareAdapterPresenter$_avito_vas_bundles_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class w implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<androidx.recyclerview.widget.C> f108318a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f108319b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f108320c;

    public w(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f108318a = provider;
        this.f108319b = provider2;
        this.f108320c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        androidx.recyclerview.widget.C c12 = this.f108318a.get();
        com.avito.konveyor.adapter.a aVar = this.f108319b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f108320c.get();
        t tVar = t.f108315a;
        return new com.avito.android.recycler.data_aware.d(dagger.internal.l.a(c12), aVar, eVar);
    }
}
