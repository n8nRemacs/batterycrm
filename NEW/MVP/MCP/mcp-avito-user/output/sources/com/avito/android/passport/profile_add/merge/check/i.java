package com.avito.android.passport.profile_add.merge.check;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.passport.perf_const.PassportCheckMergeScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckMergeScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f212627a;

    public i(l lVar) {
        this.f212627a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f212627a.f393949a;
        h.f212626a.getClass();
        return new C28478k(PassportCheckMergeScreen.f211157d, rVar, "checkMergePossibility");
    }
}
