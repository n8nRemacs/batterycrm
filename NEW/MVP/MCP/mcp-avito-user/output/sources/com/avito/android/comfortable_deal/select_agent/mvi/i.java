package com.avito.android.comfortable_deal.select_agent.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectAgentFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f122772a;

    /* renamed from: b, reason: collision with root package name */
    public final d f122773b;

    /* renamed from: c, reason: collision with root package name */
    public final k f122774c;

    /* renamed from: d, reason: collision with root package name */
    public final m f122775d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f122776e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f122772a = fVar;
        this.f122773b = dVar;
        this.f122774c = kVar;
        this.f122775d = mVar;
        this.f122776e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f122772a.get();
        c cVar = (c) this.f122773b.get();
        this.f122774c.getClass();
        j jVar = new j();
        l lVar = (l) this.f122775d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f122776e.get();
        dq.c.f394080i.getClass();
        return new h("SelectAgent", dq.c.f394081j, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
