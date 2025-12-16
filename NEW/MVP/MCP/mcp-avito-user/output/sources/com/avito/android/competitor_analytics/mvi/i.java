package com.avito.android.competitor_analytics.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.reflect.n;

/* compiled from: CompetitorAnalyticsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f124555a;

    /* renamed from: b, reason: collision with root package name */
    public final d f124556b;

    /* renamed from: c, reason: collision with root package name */
    public final k f124557c;

    /* renamed from: d, reason: collision with root package name */
    public final m f124558d;

    /* renamed from: e, reason: collision with root package name */
    public final u f124559e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<KO.a> f124560f;

    public i(f fVar, d dVar, k kVar, m mVar, u uVar, Provider provider) {
        this.f124555a = fVar;
        this.f124556b = dVar;
        this.f124557c = kVar;
        this.f124558d = mVar;
        this.f124559e = uVar;
        this.f124560f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f124555a.get();
        c cVar = (c) this.f124556b.get();
        j jVar = (j) this.f124557c.get();
        l lVar = (l) this.f124558d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f124559e.get();
        KO.a aVar = this.f124560f.get();
        com.avito.android.competitor_analytics.mvi.entity.b.f124469q.getClass();
        com.avito.android.competitor_analytics.mvi.entity.b bVar = com.avito.android.competitor_analytics.mvi.entity.b.f124470r;
        aVar.getClass();
        n<Object> nVar = KO.a.f9442h[5];
        return new h("CompetitorAnalytics", com.avito.android.competitor_analytics.mvi.entity.b.a(bVar, null, null, null, null, null, null, null, null, null, null, null, false, false, ((Boolean) aVar.f9448g.a().invoke()).booleanValue(), false, 24575), new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
