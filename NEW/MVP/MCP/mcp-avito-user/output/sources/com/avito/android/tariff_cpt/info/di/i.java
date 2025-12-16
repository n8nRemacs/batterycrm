package com.avito.android.tariff_cpt.info.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptInfoV2ListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298175a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f298176b;

    public i(u uVar, Provider provider) {
        this.f298175a = uVar;
        this.f298176b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f298175a.get();
        com.avito.konveyor.a aVar2 = this.f298176b.get();
        f.f298166a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
