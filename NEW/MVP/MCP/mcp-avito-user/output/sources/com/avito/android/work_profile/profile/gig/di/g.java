package com.avito.android.work_profile.profile.gig.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigModule_ProvideContentRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f331123a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f331124b;

    public g(u uVar, Provider provider) {
        this.f331123a = uVar;
        this.f331124b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f331123a.get();
        com.avito.konveyor.a aVar2 = this.f331124b.get();
        d.f331120a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
