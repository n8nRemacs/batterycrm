package com.avito.android.onboarding.dialog.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingDialogFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final l f208953a;

    /* renamed from: b, reason: collision with root package name */
    public final j f208954b;

    /* renamed from: c, reason: collision with root package name */
    public final q f208955c;

    /* renamed from: d, reason: collision with root package name */
    public final s f208956d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f208957e;

    public o(l lVar, j jVar, q qVar, s sVar, Provider provider) {
        this.f208953a = lVar;
        this.f208954b = jVar;
        this.f208955c = qVar;
        this.f208956d = sVar;
        this.f208957e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f208953a.get();
        h hVar = (h) this.f208954b.get();
        this.f208955c.getClass();
        p pVar = new p();
        r rVar = (r) this.f208956d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f208957e.get();
        OnboardingDialogState.f208909e.getClass();
        return new n("OnboardingDialog", OnboardingDialogState.f208910f, new m(kVar, hVar, screenPerformanceTracker, rVar, pVar));
    }
}
