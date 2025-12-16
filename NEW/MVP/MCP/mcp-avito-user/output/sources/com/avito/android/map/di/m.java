package com.avito.android.map.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertsInPinModule_ProvideSerpRetryPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<com.avito.android.serp.adapter.retry.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f184869a;

    public m(dagger.internal.u uVar) {
        this.f184869a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.retry.a aVar = (com.avito.android.serp.adapter.retry.a) this.f184869a.get();
        d dVar = d.f184841a;
        return new com.avito.android.serp.adapter.retry.g(aVar);
    }
}
