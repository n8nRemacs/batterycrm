package com.avito.android.change_specific.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileChangeSpecificModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f117975a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f117976b;

    public j(u uVar, Provider provider) {
        this.f117975a = uVar;
        this.f117976b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f117975a.get();
        com.avito.konveyor.a aVar2 = this.f117976b.get();
        d.f117965a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
