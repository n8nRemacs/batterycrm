package com.avito.android.vas_performance.di.competitive;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitiveVasModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f319963a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f319964b;

    public q(Provider<com.avito.konveyor.adapter.a> provider, Provider<com.avito.konveyor.a> provider2) {
        this.f319963a = provider;
        this.f319964b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f319963a.get();
        com.avito.konveyor.a aVar2 = this.f319964b.get();
        int i12 = p.f319962a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
