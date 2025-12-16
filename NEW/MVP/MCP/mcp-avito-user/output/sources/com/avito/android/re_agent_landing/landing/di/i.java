package com.avito.android.re_agent_landing.landing.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentProfileCreateLandingModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f250614a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f250615b;

    public i(u uVar, Provider provider) {
        this.f250614a = uVar;
        this.f250615b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f250614a.get();
        com.avito.konveyor.a aVar2 = this.f250615b.get();
        int i12 = c.f250606a;
        return new j(aVar, aVar2);
    }
}
