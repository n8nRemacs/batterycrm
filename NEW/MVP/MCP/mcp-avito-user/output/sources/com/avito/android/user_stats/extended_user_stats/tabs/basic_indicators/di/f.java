package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BasicIndicatorsTabModule_ProvideDataAwareAdapterPresenterImpl$_avito_user_stats_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f317360a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f317361b;

    /* renamed from: c, reason: collision with root package name */
    public final u f317362c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f317360a = provider;
        this.f317361b = provider2;
        this.f317362c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f317360a);
        com.avito.konveyor.adapter.h hVar = this.f317361b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f317362c.get();
        c.f317356a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
