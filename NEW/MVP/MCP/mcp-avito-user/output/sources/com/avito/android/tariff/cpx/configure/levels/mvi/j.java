package com.avito.android.tariff.cpx.configure.levels.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxConfigureLevelsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f296225a;

    /* renamed from: b, reason: collision with root package name */
    public final e f296226b;

    /* renamed from: c, reason: collision with root package name */
    public final l f296227c;

    /* renamed from: d, reason: collision with root package name */
    public final o f296228d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f296229e;

    public j(g gVar, e eVar, l lVar, o oVar, Provider provider) {
        this.f296225a = gVar;
        this.f296226b = eVar;
        this.f296227c = lVar;
        this.f296228d = oVar;
        this.f296229e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f296225a.get();
        d dVar = (d) this.f296226b.get();
        this.f296227c.getClass();
        k kVar = new k();
        this.f296228d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f296229e.get();
        sB0.e.f437522i.getClass();
        return new i("TariffCpxConfigureLevels", sB0.e.f437523j, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
