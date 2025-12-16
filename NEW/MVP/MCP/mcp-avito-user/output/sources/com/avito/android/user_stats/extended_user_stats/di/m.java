package com.avito.android.user_stats.extended_user_stats.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedUserStatsModule_ProvideRecyclerAdapter$_avito_user_stats_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317216a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f317217b;

    public m(u uVar, Provider provider) {
        this.f317216a = uVar;
        this.f317217b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f317216a.get();
        com.avito.konveyor.a aVar2 = this.f317217b.get();
        d.f317204a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
