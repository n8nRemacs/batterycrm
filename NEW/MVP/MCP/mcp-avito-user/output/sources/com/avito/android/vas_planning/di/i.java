package com.avito.android.vas_planning.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanningModule_ProvideDataAwareAdapterPresenterImpl$_avito_vas_planning_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f322296a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f322297b;

    /* renamed from: c, reason: collision with root package name */
    public final u f322298c;

    public i(u uVar, Provider provider, Provider provider2) {
        this.f322296a = provider;
        this.f322297b = provider2;
        this.f322298c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f322296a);
        com.avito.konveyor.adapter.h hVar = this.f322297b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f322298c.get();
        h.f322295a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
