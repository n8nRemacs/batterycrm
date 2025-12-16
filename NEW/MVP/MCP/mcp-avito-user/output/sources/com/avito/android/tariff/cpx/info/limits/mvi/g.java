package com.avito.android.tariff.cpx.info.limits.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxInfoLimitsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f296619a;

    /* renamed from: b, reason: collision with root package name */
    public final b f296620b;

    /* renamed from: c, reason: collision with root package name */
    public final i f296621c;

    /* renamed from: d, reason: collision with root package name */
    public final l f296622d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f296623e;

    public g(d dVar, b bVar, i iVar, l lVar, Provider provider) {
        this.f296619a = dVar;
        this.f296620b = bVar;
        this.f296621c = iVar;
        this.f296622d = lVar;
        this.f296623e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f296619a.get();
        a aVar = (a) this.f296620b.get();
        this.f296621c.getClass();
        h hVar = new h();
        this.f296622d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f296623e.get();
        vB0.c.f440521g.getClass();
        return new f("TariffCpxInfoLimits", vB0.c.f440522h, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
