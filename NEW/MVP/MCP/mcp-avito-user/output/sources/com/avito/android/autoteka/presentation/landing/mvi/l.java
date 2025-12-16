package com.avito.android.autoteka.presentation.landing.mvi;

import Lf.c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaLandingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final b f97375a;

    /* renamed from: b, reason: collision with root package name */
    public final n f97376b;

    /* renamed from: c, reason: collision with root package name */
    public final p f97377c;

    /* renamed from: d, reason: collision with root package name */
    public final i f97378d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f97379e;

    public l(b bVar, n nVar, p pVar, i iVar, Provider provider) {
        this.f97375a = bVar;
        this.f97376b = nVar;
        this.f97377c = pVar;
        this.f97378d = iVar;
        this.f97379e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f97375a.get();
        m mVar = (m) this.f97376b.get();
        this.f97377c.getClass();
        o oVar = new o();
        return new k("AutotekaLanding", new c.C0624c(null, 1, null), new j((h) this.f97378d.get(), aVar, this.f97379e.get(), oVar, mVar));
    }
}
