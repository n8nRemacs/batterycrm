package com.avito.android.safedeal.delivery.di.module;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RdsOrderCancellationBlueprintsModule_ProvideAdapterPresenter$_avito_safedeal_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f256060a;

    public b(u uVar) {
        this.f256060a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f256060a.get();
        a.f256059a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
