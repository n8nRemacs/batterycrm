package com.avito.android.passport.profile_add.merge.business_vrf_duplication;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.passport.perf_const.PassportBusinessVrfDuplicationScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BusinessVrfDuplicationScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f212495a;

    public j(dagger.internal.l lVar) {
        this.f212495a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f212495a.f393949a;
        i.f212494a.getClass();
        return new C28478k(PassportBusinessVrfDuplicationScreen.f211156d, rVar, "passportVerificationOptions");
    }
}
