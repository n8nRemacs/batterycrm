package com.avito.android.loyalty.di.quality_service;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: QualityServiceModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final k f183162a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f183163b;

    public j(k kVar, dagger.internal.f fVar) {
        this.f183162a = kVar;
        this.f183163b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f183162a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f183163b.get();
        i.f183161a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
