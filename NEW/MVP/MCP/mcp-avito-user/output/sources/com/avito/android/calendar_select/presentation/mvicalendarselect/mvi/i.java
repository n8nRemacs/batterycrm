package com.avito.android.calendar_select.presentation.mvicalendarselect.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalendarSelectFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f113444a;

    /* renamed from: b, reason: collision with root package name */
    public final d f113445b;

    /* renamed from: c, reason: collision with root package name */
    public final k f113446c;

    /* renamed from: d, reason: collision with root package name */
    public final m f113447d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f113448e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f113444a = fVar;
        this.f113445b = dVar;
        this.f113446c = kVar;
        this.f113447d = mVar;
        this.f113448e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f113444a.get();
        c cVar = (c) this.f113445b.get();
        this.f113446c.getClass();
        j jVar = new j();
        this.f113447d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f113448e.get();
        Rl.c.f14592b.getClass();
        return new h("CalendarSelectFeature", Rl.c.f14593c, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
