package com.avito.android.autoteka.di.landing;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaLandingModule_Companion_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96430a;

    public c(u uVar) {
        this.f96430a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f96430a.get();
        b.f96428a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
