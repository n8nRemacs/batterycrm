package com.avito.android.onboarding.steps.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingStepsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f209359a;

    /* renamed from: b, reason: collision with root package name */
    public final f f209360b;

    /* renamed from: c, reason: collision with root package name */
    public final n f209361c;

    /* renamed from: d, reason: collision with root package name */
    public final p f209362d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f209363e;

    public l(i iVar, f fVar, n nVar, p pVar, Provider provider) {
        this.f209359a = iVar;
        this.f209360b = fVar;
        this.f209361c = nVar;
        this.f209362d = pVar;
        this.f209363e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f209359a.get();
        e eVar = (e) this.f209360b.get();
        this.f209361c.getClass();
        m mVar = new m();
        this.f209362d.getClass();
        o oVar = new o();
        ScreenPerformanceTracker screenPerformanceTracker = this.f209363e.get();
        H40.d.f6941e.getClass();
        return new k("OnboardingSteps", H40.d.f6942f, new j(hVar, eVar, screenPerformanceTracker, oVar, mVar));
    }
}
