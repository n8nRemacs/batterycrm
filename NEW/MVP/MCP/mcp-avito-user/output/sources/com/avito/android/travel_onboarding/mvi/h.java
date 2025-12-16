package com.avito.android.travel_onboarding.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelOnboardingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f302319a;

    /* renamed from: b, reason: collision with root package name */
    public final c f302320b;

    /* renamed from: c, reason: collision with root package name */
    public final j f302321c;

    /* renamed from: d, reason: collision with root package name */
    public final l f302322d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f302323e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f302319a = eVar;
        this.f302320b = cVar;
        this.f302321c = jVar;
        this.f302322d = lVar;
        this.f302323e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f302319a.get();
        b bVar = (b) this.f302320b.get();
        this.f302321c.getClass();
        i iVar = new i();
        k kVar = (k) this.f302322d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f302323e.get();
        ZE0.c.f20008g.getClass();
        return new g("TravelOnboarding", ZE0.c.f20009h, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
