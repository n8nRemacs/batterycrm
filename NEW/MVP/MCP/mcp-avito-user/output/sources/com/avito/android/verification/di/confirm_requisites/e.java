package com.avito.android.verification.di.confirm_requisites;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.VerificationConfirmRequisitesScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.verification.di.confirm_requisites.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationConfirmRequisitesTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f323526a;

    /* renamed from: b, reason: collision with root package name */
    public final l f323527b;

    public e(l lVar, Provider provider) {
        this.f323526a = provider;
        this.f323527b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.d) this.f323526a).get();
        r rVar = (r) this.f323527b.f393949a;
        d.f323525a.getClass();
        return interfaceC28481c.a(new C28478k(VerificationConfirmRequisitesScreen.f90557d, rVar, "verificationPlatform-confirmRequisites"));
    }
}
