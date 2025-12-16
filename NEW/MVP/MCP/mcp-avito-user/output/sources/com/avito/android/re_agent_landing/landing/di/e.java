package com.avito.android.re_agent_landing.landing.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentProfileCreateLandingModule_ProvideDataAwareAdapterPresenterImplFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f250608a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f250609b;

    /* renamed from: c, reason: collision with root package name */
    public final u f250610c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f250608a = provider;
        this.f250609b = provider2;
        this.f250610c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f250608a);
        com.avito.konveyor.adapter.h hVar = this.f250609b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f250610c.get();
        int i12 = c.f250606a;
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
