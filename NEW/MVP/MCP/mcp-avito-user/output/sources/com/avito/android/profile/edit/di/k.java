package com.avito.android.profile.edit.di;

import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideDataAwareAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<androidx.recyclerview.widget.C> f222170a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f222171b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f222172c;

    public k(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f222170a = provider;
        this.f222171b = provider2;
        this.f222172c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f222170a);
        com.avito.konveyor.adapter.a aVar = this.f222171b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f222172c.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
