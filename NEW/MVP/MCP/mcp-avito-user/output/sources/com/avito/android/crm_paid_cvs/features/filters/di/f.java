package com.avito.android.crm_paid_cvs.features.filters.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersModule_ProvideFilterAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f130616a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f130617b;

    public f(u uVar, Provider provider) {
        this.f130616a = uVar;
        this.f130617b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f130616a.get();
        com.avito.konveyor.a aVar2 = this.f130617b.get();
        e.f130615a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new com.avito.android.crm_paid_cvs.render.c());
    }
}
