package com.avito.android.mortgage.landing.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LandingAdapterModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f199605a;

    public d(u uVar) {
        this.f199605a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f199605a.get();
        int i12 = c.f199604a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
