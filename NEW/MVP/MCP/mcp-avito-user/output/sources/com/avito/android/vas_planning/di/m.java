package com.avito.android.vas_planning.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlanningModule_ProvideSimpleAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f322302a;

    public m(u uVar) {
        this.f322302a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f322302a.get();
        h.f322295a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
