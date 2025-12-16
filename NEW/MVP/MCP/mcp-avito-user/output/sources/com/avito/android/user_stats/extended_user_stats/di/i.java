package com.avito.android.user_stats.extended_user_stats.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedUserStatsModule_ProvideExtendedUserStatsStorageFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<com.avito.android.user_stats.extended_user_stats.m> {

    /* renamed from: a, reason: collision with root package name */
    public final h f317213a;

    public i(h hVar) {
        this.f317213a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.l lVar = (AK0.l) this.f317213a.get();
        d.f317204a.getClass();
        return new com.avito.android.user_stats.extended_user_stats.m(lVar);
    }
}
