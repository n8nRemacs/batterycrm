package com.avito.android.cpt.mass_activation.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptMassActivationV2Module_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126517a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f126518b;

    public m(u uVar, Provider provider) {
        this.f126517a = uVar;
        this.f126518b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f126517a.get();
        com.avito.konveyor.a aVar2 = this.f126518b.get();
        j.f126514a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
