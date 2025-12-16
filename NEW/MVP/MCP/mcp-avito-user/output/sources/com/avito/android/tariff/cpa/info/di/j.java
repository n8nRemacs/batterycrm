package com.avito.android.tariff.cpa.info.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaInfoListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f294652a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f294653b;

    public j(u uVar, Provider provider) {
        this.f294652a = uVar;
        this.f294653b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f294652a.get();
        com.avito.konveyor.a aVar2 = this.f294653b.get();
        f.f294639a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
