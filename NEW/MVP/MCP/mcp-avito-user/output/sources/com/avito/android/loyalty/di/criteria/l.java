package com.avito.android.loyalty.di.criteria;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TabModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<com.avito.android.loyalty.ui.criteria.l> {

    /* renamed from: a, reason: collision with root package name */
    public final k f183075a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f183076b;

    public l(k kVar, dagger.internal.f fVar) {
        this.f183075a = kVar;
        this.f183076b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f183075a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f183076b.get();
        j.f183073a.getClass();
        return new com.avito.android.loyalty.ui.criteria.l(aVar, aVar2);
    }
}
