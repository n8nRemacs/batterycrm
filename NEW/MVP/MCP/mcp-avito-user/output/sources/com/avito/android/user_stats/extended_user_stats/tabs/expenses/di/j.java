package com.avito.android.user_stats.extended_user_stats.tabs.expenses.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExpensesTabModule_ProvideListUpdateCallback$_avito_user_stats_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f317658a;

    public j(dagger.internal.f fVar) {
        this.f317658a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f317658a.get();
        d.f317613a.getClass();
        return jVar;
    }
}
