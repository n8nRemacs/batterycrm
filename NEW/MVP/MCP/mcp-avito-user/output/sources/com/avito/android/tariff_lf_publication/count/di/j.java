package com.avito.android.tariff_lf_publication.count.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffLfPublicationCountModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300790a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f300791b;

    public j(u uVar, Provider provider) {
        this.f300790a = uVar;
        this.f300791b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f300790a.get();
        com.avito.konveyor.a aVar2 = this.f300791b.get();
        g.f300786a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new ND0.a());
    }
}
