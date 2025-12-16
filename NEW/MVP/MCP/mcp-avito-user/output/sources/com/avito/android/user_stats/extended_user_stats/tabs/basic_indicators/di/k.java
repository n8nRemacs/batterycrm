package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BasicIndicatorsTabModule_ProvideRecyclerAdapter$_avito_user_stats_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317374a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f317375b;

    public k(u uVar, Provider provider) {
        this.f317374a = uVar;
        this.f317375b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f317374a.get();
        com.avito.konveyor.a aVar2 = this.f317375b.get();
        c.f317356a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
