package com.avito.android.passport.profile_add.merge.select_business_vrf;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectBusinessVrfModule_ProvideDataAwareAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f213401a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f213402b;

    /* renamed from: c, reason: collision with root package name */
    public final u f213403c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f213401a = provider;
        this.f213402b = provider2;
        this.f213403c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f213401a);
        com.avito.konveyor.a aVar = this.f213402b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f213403c.get();
        e.f213400a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), eVar);
    }
}
