package com.avito.android.user_stats.extended_user_stats.tabs.expenses.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExpensesTabModule_ProvideRecyclerAdapter$_avito_user_stats_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317659a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f317660b;

    public k(u uVar, Provider provider) {
        this.f317659a = uVar;
        this.f317660b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f317659a.get();
        com.avito.konveyor.a aVar2 = this.f317660b.get();
        d.f317613a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
