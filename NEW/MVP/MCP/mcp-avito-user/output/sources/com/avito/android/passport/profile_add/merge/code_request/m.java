package com.avito.android.passport.profile_add.merge.code_request;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.passport.perf_const.PassportMergeCodeRequestScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CodeRequestScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f212861a;

    public m(dagger.internal.l lVar) {
        this.f212861a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f212861a.f393949a;
        l.f212860a.getClass();
        return new C28478k(PassportMergeCodeRequestScreen.f211160d, rVar, "mergeCodeRequest");
    }
}
