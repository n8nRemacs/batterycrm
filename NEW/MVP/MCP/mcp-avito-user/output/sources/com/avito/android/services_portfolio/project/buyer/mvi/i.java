package com.avito.android.services_portfolio.project.buyer.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import iv0.AbstractC42117c;
import javax.inject.Provider;

/* compiled from: PortfolioProjectBuyerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f280056a;

    /* renamed from: b, reason: collision with root package name */
    public final d f280057b;

    /* renamed from: c, reason: collision with root package name */
    public final k f280058c;

    /* renamed from: d, reason: collision with root package name */
    public final m f280059d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f280060e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f280056a = fVar;
        this.f280057b = dVar;
        this.f280058c = kVar;
        this.f280059d = mVar;
        this.f280060e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f280056a.get();
        c cVar = (c) this.f280057b.get();
        this.f280058c.getClass();
        j jVar = new j();
        this.f280059d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f280060e.get();
        AbstractC42117c.f405373b.getClass();
        return new h("PortfolioProjectBuyer", AbstractC42117c.f405374c, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
