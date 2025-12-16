package com.avito.android.passport.profile_add.merge.select_business_vrf;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectBusinessVrfModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f213410a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f213411b;

    public j(u uVar, Provider provider) {
        this.f213410a = uVar;
        this.f213411b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f213410a.get();
        com.avito.konveyor.a aVar2 = this.f213411b.get();
        e.f213400a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
