package com.avito.android.position_in_search.stats.screen.position_in_search.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PositionInSearchFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f221528a;

    /* renamed from: b, reason: collision with root package name */
    public final d f221529b;

    /* renamed from: c, reason: collision with root package name */
    public final k f221530c;

    /* renamed from: d, reason: collision with root package name */
    public final m f221531d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f221532e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f221528a = fVar;
        this.f221529b = dVar;
        this.f221530c = kVar;
        this.f221531d = mVar;
        this.f221532e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f221528a.get();
        a aVar = (a) this.f221529b.get();
        this.f221530c.getClass();
        j jVar = new j();
        l lVar = (l) this.f221531d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f221532e.get();
        c90.c.f57704o.getClass();
        return new h("PositionInSearch", c90.c.f57705p, new g(eVar, aVar, screenPerformanceTracker, lVar, jVar));
    }
}
