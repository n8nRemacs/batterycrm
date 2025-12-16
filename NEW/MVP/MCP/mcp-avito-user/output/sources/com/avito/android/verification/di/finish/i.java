package com.avito.android.verification.di.finish;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.VerificationFinishScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.verification.di.finish.a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationFinishTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f323642a;

    /* renamed from: b, reason: collision with root package name */
    public final l f323643b;

    public i(l lVar, Provider provider) {
        this.f323642a = provider;
        this.f323643b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.e) this.f323642a).get();
        r rVar = (r) this.f323643b.f393949a;
        h.f323641a.getClass();
        return interfaceC28481c.a(new C28478k(VerificationFinishScreen.f90561d, rVar, "verificationPlatform-finish"));
    }
}
