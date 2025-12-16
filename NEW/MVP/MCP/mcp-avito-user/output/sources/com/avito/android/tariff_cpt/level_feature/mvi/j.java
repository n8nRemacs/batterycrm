package com.avito.android.tariff_cpt.level_feature.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCptLevelFeatureFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f298497a;

    /* renamed from: b, reason: collision with root package name */
    public final e f298498b;

    /* renamed from: c, reason: collision with root package name */
    public final l f298499c;

    /* renamed from: d, reason: collision with root package name */
    public final n f298500d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f298501e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f298497a = gVar;
        this.f298498b = eVar;
        this.f298499c = lVar;
        this.f298500d = nVar;
        this.f298501e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f298497a.get();
        d dVar = (d) this.f298498b.get();
        this.f298499c.getClass();
        k kVar = new k();
        this.f298500d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f298501e.get();
        DC0.c.f3099g.getClass();
        return new i("TariffCptLevelFeature", DC0.c.f3100h, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
