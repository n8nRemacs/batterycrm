package com.avito.android.map.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertsInPinModule_ProvideSerpListAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f184868a;

    public l(dagger.internal.u uVar) {
        this.f184868a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f184868a.get();
        d dVar = d.f184841a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
