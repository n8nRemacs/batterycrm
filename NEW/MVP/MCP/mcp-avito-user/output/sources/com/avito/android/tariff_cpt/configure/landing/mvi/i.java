package com.avito.android.tariff_cpt.configure.landing.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import oC0.C44625c;

/* compiled from: TariffCptConfigureLandingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f297788a;

    /* renamed from: b, reason: collision with root package name */
    public final d f297789b;

    /* renamed from: c, reason: collision with root package name */
    public final k f297790c;

    /* renamed from: d, reason: collision with root package name */
    public final m f297791d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f297792e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f297788a = fVar;
        this.f297789b = dVar;
        this.f297790c = kVar;
        this.f297791d = mVar;
        this.f297792e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f297788a.get();
        c cVar = (c) this.f297789b.get();
        this.f297790c.getClass();
        j jVar = new j();
        this.f297791d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f297792e.get();
        C44625c.f419596k.getClass();
        return new h("TariffCptConfigureLanding", C44625c.f419597l, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
