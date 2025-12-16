package com.avito.android.fees_methods.screen.fees_methods_v2.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesMethodsV2ListModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f158245a;

    public h(u uVar) {
        this.f158245a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f158245a.get();
        g.f158244a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
