package com.avito.android.wallet.page.topup.form.di;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TopUpFormModule_ProvideDataAwareAdapterPresenterFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f328277a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f328278b;

    /* renamed from: c, reason: collision with root package name */
    public final l f328279c;

    public k(dagger.internal.f fVar, Provider provider, l lVar) {
        this.f328277a = fVar;
        this.f328278b = provider;
        this.f328279c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f328277a);
        com.avito.konveyor.adapter.a aVar = this.f328278b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f328279c.get();
        g.f328273a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
