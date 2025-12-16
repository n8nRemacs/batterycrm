package com.avito.android.passport.profile_add.merge.profiles_list;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.passport.perf_const.PassportAccountsMergeProfileListScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfilesListScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f213314a;

    public r(dagger.internal.l lVar) {
        this.f213314a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f213314a.f393949a;
        q.f213313a.getClass();
        return new C28478k(PassportAccountsMergeProfileListScreen.f211152d, rVar, "accountsMergeProfileList");
    }
}
