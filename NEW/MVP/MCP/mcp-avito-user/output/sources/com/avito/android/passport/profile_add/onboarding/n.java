package com.avito.android.passport.profile_add.onboarding;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.passport.perf_const.PassportOnboardingScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PassportOnboardingScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f213600a;

    public n(dagger.internal.l lVar) {
        this.f213600a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f213600a.f393949a;
        m.f213574a.getClass();
        return new C28478k(PassportOnboardingScreen.f211161d, rVar, null, 4, null);
    }
}
