package com.avito.android.tariff_lf_constructor.configure.landing.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import jD0.C42238c;
import javax.inject.Provider;

/* compiled from: ConstructorLandingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f299730a;

    /* renamed from: b, reason: collision with root package name */
    public final e f299731b;

    /* renamed from: c, reason: collision with root package name */
    public final l f299732c;

    /* renamed from: d, reason: collision with root package name */
    public final o f299733d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f299734e;

    public j(g gVar, e eVar, l lVar, o oVar, Provider provider) {
        this.f299730a = gVar;
        this.f299731b = eVar;
        this.f299732c = lVar;
        this.f299733d = oVar;
        this.f299734e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f299730a.get();
        d dVar = (d) this.f299731b.get();
        this.f299732c.getClass();
        k kVar = new k();
        this.f299733d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f299734e.get();
        C42238c.f405518e.getClass();
        return new i("ConstructorLanding", C42238c.f405519f, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
