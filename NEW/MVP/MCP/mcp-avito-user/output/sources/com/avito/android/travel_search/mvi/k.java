package com.avito.android.travel_search.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelSearchFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f303187a;

    /* renamed from: b, reason: collision with root package name */
    public final f f303188b;

    /* renamed from: c, reason: collision with root package name */
    public final m f303189c;

    /* renamed from: d, reason: collision with root package name */
    public final p f303190d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f303191e;

    public k(h hVar, f fVar, m mVar, p pVar, Provider provider) {
        this.f303187a = hVar;
        this.f303188b = fVar;
        this.f303189c = mVar;
        this.f303190d = pVar;
        this.f303191e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f303187a.get();
        e eVar = (e) this.f303188b.get();
        this.f303189c.getClass();
        l lVar = new l();
        o oVar = (o) this.f303190d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f303191e.get();
        vF0.g.f440605n.getClass();
        return new j("TravelSearch", vF0.g.f440606o, new i(gVar, eVar, screenPerformanceTracker, oVar, lVar));
    }
}
