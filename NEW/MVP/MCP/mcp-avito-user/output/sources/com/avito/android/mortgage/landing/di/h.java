package com.avito.android.mortgage.landing.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LandingAdapterModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f199611a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f199612b;

    public h(u uVar, Provider provider) {
        this.f199611a = uVar;
        this.f199612b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f199611a.get();
        com.avito.konveyor.a aVar2 = this.f199612b.get();
        int i12 = c.f199604a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
