package com.avito.android.loyalty.di.criteria;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CriteriaModule_Companion_ProvideViewPagerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f183041a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f183042b;

    public h(dagger.internal.f fVar, u uVar) {
        this.f183041a = uVar;
        this.f183042b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f183041a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f183042b.get();
        d.f183033a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
