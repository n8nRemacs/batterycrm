package com.avito.android.tariff_lf_constructor.configure.locations.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfigureLocationsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299884a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f299885b;

    public g(u uVar, Provider provider) {
        this.f299884a = uVar;
        this.f299885b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f299884a.get();
        com.avito.konveyor.a aVar2 = this.f299885b.get();
        b bVar = b.f299879a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
