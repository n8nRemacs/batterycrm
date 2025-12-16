package com.avito.android.verification.di.passport;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.VerificationCyberityScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.verification.di.passport.a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationCyberityTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f323823a;

    /* renamed from: b, reason: collision with root package name */
    public final l f323824b;

    public i(l lVar, Provider provider) {
        this.f323823a = provider;
        this.f323824b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C10023c) this.f323823a).get();
        r rVar = (r) this.f323824b.f393949a;
        h.f323822a.getClass();
        return interfaceC28481c.a(new C28478k(VerificationCyberityScreen.f90558d, rVar, "verificationPlatform-cyberity"));
    }
}
