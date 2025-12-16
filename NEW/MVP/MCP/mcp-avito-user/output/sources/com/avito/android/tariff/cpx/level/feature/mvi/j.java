package com.avito.android.tariff.cpx.level.feature.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxLevelFeatureFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f296999a;

    /* renamed from: b, reason: collision with root package name */
    public final e f297000b;

    /* renamed from: c, reason: collision with root package name */
    public final l f297001c;

    /* renamed from: d, reason: collision with root package name */
    public final n f297002d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f297003e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f296999a = gVar;
        this.f297000b = eVar;
        this.f297001c = lVar;
        this.f297002d = nVar;
        this.f297003e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f296999a.get();
        d dVar = (d) this.f297000b.get();
        this.f297001c.getClass();
        k kVar = new k();
        this.f297002d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f297003e.get();
        EB0.c.f3868g.getClass();
        return new i("TariffCpxLevelFeature", EB0.c.f3869h, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
