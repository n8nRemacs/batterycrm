package com.avito.android.passport.profile_add.merge.business_vrf_duplication;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BusinessVrfDuplicationModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f212492a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f212493b;

    public h(u uVar, Provider provider) {
        this.f212492a = uVar;
        this.f212493b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f212492a.get();
        com.avito.konveyor.a aVar2 = this.f212493b.get();
        g.f212491a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
