package com.avito.android.rubricator.list.service.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceListModule_ProvideSimpleRecyclerPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255982a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f255983b;

    public m(u uVar, Provider provider) {
        this.f255982a = uVar;
        this.f255983b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f255982a.get();
        com.avito.konveyor.a aVar = this.f255983b.get();
        e.f255972a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
