package com.avito.android.user_stats.extended_user_stats.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedUserStatsModule_ProvideAdapterPresenter$_avito_user_stats_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317205a;

    public e(u uVar) {
        this.f317205a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f317205a.get();
        d.f317204a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
