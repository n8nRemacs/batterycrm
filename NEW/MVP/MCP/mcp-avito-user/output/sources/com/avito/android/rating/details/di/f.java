package com.avito.android.rating.details.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingDetailsModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f246982a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f246983b;

    public f(u uVar, Provider provider) {
        this.f246982a = uVar;
        this.f246983b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f246982a.get();
        com.avito.konveyor.a aVar = this.f246983b.get();
        e.f246981a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(cVar, aVar);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
