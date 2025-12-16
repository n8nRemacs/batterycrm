package com.avito.android.vas_performance.screens.visual.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualVasFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.arch.mvi.b<VisualVasInternalAction>> f321151a;

    /* renamed from: b, reason: collision with root package name */
    public final d f321152b;

    /* renamed from: c, reason: collision with root package name */
    public final k f321153c;

    /* renamed from: d, reason: collision with root package name */
    public final n f321154d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f321155e;

    public i(Provider provider, d dVar, k kVar, n nVar, Provider provider2) {
        this.f321151a = provider;
        this.f321152b = dVar;
        this.f321153c = kVar;
        this.f321154d = nVar;
        this.f321155e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.arch.mvi.b<VisualVasInternalAction> bVar = this.f321151a.get();
        c cVar = (c) this.f321152b.get();
        this.f321153c.getClass();
        j jVar = new j();
        this.f321154d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f321155e.get();
        PL0.c.f13028j.getClass();
        return new h("VisualVas", PL0.c.f13029k, new g(bVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
