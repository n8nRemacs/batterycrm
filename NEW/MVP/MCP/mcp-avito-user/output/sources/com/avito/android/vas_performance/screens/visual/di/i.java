package com.avito.android.vas_performance.screens.visual.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VisualVasListModule_ProvideAdapterPresenter$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f321027a;

    public i(u uVar) {
        this.f321027a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f321027a.get();
        h.f321026a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
