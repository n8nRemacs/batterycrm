package com.avito.android.services_onboarding.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesOnboardingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f279959a;

    /* renamed from: b, reason: collision with root package name */
    public final b f279960b;

    /* renamed from: c, reason: collision with root package name */
    public final l f279961c;

    /* renamed from: d, reason: collision with root package name */
    public final n f279962d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f279963e;

    public j(g gVar, b bVar, l lVar, n nVar, Provider provider) {
        this.f279959a = gVar;
        this.f279960b = bVar;
        this.f279961c = lVar;
        this.f279962d = nVar;
        this.f279963e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f279959a.get();
        a aVar = (a) this.f279960b.get();
        this.f279961c.getClass();
        k kVar = new k();
        m mVar = (m) this.f279962d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f279963e.get();
        Zu0.c.f20555h.getClass();
        return new i("ServicesOnboarding", Zu0.c.f20556i, new h(fVar, aVar, screenPerformanceTracker, mVar, kVar));
    }
}
