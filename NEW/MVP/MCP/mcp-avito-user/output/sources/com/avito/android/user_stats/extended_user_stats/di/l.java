package com.avito.android.user_stats.extended_user_stats.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedUserStatsModule_ProvideListUpdateCallback$_avito_user_stats_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f317215a;

    public l(dagger.internal.f fVar) {
        this.f317215a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f317215a.get();
        d.f317204a.getClass();
        return jVar;
    }
}
