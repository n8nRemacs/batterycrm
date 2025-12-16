package com.avito.android.screens.bbip_v2.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wp0.C49667a;

/* compiled from: BbipV2ListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f261444a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f261445b;

    public g(u uVar, Provider provider) {
        this.f261444a = uVar;
        this.f261445b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f261444a.get();
        com.avito.konveyor.a aVar2 = this.f261445b.get();
        d.f261438a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new C49667a());
    }
}
