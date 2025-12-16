package com.avito.android.map.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertsInPinModule_ProvideRetryBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<com.avito.android.serp.adapter.retry.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f184867a;

    public k(dagger.internal.u uVar) {
        this.f184867a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.retry.e eVar = (com.avito.android.serp.adapter.retry.e) this.f184867a.get();
        d dVar = d.f184841a;
        return new com.avito.android.serp.adapter.retry.d(eVar);
    }
}
