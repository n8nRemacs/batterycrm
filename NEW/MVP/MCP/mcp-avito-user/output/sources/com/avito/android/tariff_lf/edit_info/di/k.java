package com.avito.android.tariff_lf.edit_info.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditInfoModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298863a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f298864b;

    public k(u uVar, Provider provider) {
        this.f298863a = uVar;
        this.f298864b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f298863a.get();
        com.avito.konveyor.a aVar = this.f298864b.get();
        c cVar2 = c.f298839a;
        return new com.avito.konveyor.adapter.j(cVar, aVar);
    }
}
