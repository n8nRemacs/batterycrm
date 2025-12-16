package com.avito.android.user_stats.extended_user_stats.tabs.expenses.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExpensesTabModule_ProvideDataAwareAdapterPresenterImpl$_avito_user_stats_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f317615a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f317616b;

    /* renamed from: c, reason: collision with root package name */
    public final u f317617c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f317615a = provider;
        this.f317616b = provider2;
        this.f317617c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f317615a);
        com.avito.konveyor.adapter.h hVar = this.f317616b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f317617c.get();
        d.f317613a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
