package com.avito.android.social_management.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SocialManagementModule_ProvideDataAwareAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f284654a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f284655b;

    /* renamed from: c, reason: collision with root package name */
    public final u f284656c;

    public j(dagger.internal.f fVar, u uVar, Provider provider) {
        this.f284654a = fVar;
        this.f284655b = provider;
        this.f284656c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f284654a);
        com.avito.konveyor.adapter.a aVar = this.f284655b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f284656c.get();
        g.f284647a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
