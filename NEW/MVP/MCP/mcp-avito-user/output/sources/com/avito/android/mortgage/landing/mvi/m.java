package com.avito.android.mortgage.landing.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.landing.mvi.entity.LandingState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LandingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f200281a;

    /* renamed from: b, reason: collision with root package name */
    public final h f200282b;

    /* renamed from: c, reason: collision with root package name */
    public final o f200283c;

    /* renamed from: d, reason: collision with root package name */
    public final q f200284d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f200285e;

    public m(j jVar, h hVar, o oVar, q qVar, Provider provider) {
        this.f200281a = jVar;
        this.f200282b = hVar;
        this.f200283c = oVar;
        this.f200284d = qVar;
        this.f200285e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f200281a.get();
        g gVar = (g) this.f200282b.get();
        this.f200283c.getClass();
        n nVar = new n();
        p pVar = (p) this.f200284d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f200285e.get();
        LandingState.f200224r.getClass();
        return new l("Landing", LandingState.f200225s, new k(iVar, gVar, screenPerformanceTracker, pVar, nVar));
    }
}
