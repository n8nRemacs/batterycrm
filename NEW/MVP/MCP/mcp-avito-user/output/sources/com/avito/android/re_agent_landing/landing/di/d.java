package com.avito.android.re_agent_landing.landing.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReAgentProfileCreateLandingModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f250607a;

    public d(u uVar) {
        this.f250607a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f250607a.get();
        int i12 = c.f250606a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
