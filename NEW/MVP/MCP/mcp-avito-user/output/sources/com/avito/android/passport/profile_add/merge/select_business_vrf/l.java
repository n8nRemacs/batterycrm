package com.avito.android.passport.profile_add.merge.select_business_vrf;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.passport.perf_const.PassportSelectBusinessVrfScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectBusinessVrfScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f213413a;

    public l(dagger.internal.l lVar) {
        this.f213413a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f213413a.f393949a;
        k.f213412a.getClass();
        return new C28478k(PassportSelectBusinessVrfScreen.f211165d, rVar, "businessVrfSelection");
    }
}
