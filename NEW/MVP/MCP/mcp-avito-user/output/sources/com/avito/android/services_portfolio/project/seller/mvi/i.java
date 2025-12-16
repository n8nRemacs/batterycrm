package com.avito.android.services_portfolio.project.seller.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PortfolioProjectSellerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f280272a;

    /* renamed from: b, reason: collision with root package name */
    public final d f280273b;

    /* renamed from: c, reason: collision with root package name */
    public final k f280274c;

    /* renamed from: d, reason: collision with root package name */
    public final m f280275d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f280276e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f280272a = fVar;
        this.f280273b = dVar;
        this.f280274c = kVar;
        this.f280275d = mVar;
        this.f280276e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f280272a.get();
        a aVar = (a) this.f280273b.get();
        this.f280274c.getClass();
        j jVar = new j();
        this.f280275d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f280276e.get();
        kv0.d.f413276b.getClass();
        return new h("PortfolioProjectSeller", kv0.d.f413277c, new g(eVar, aVar, screenPerformanceTracker, lVar, jVar));
    }
}
