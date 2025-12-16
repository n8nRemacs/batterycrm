package com.avito.android.universal_map.map.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalMapFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final n f305670a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.universal_map.map.mvi.actor.r f305671b;

    /* renamed from: c, reason: collision with root package name */
    public final s f305672c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.universal_map.map.mvi.reducer.r f305673d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f305674e;

    public q(n nVar, com.avito.android.universal_map.map.mvi.actor.r rVar, s sVar, com.avito.android.universal_map.map.mvi.reducer.r rVar2, Provider provider) {
        this.f305670a = nVar;
        this.f305671b = rVar;
        this.f305672c = sVar;
        this.f305673d = rVar2;
        this.f305674e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f305670a.get();
        com.avito.android.universal_map.map.mvi.actor.m mVar = (com.avito.android.universal_map.map.mvi.actor.m) this.f305671b.get();
        this.f305672c.getClass();
        r rVar = new r();
        com.avito.android.universal_map.map.mvi.reducer.q qVar = (com.avito.android.universal_map.map.mvi.reducer.q) this.f305673d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f305674e.get();
        com.avito.android.universal_map.map.mvi.entity.e.f305593h.getClass();
        return new p("UniversalMap", com.avito.android.universal_map.map.mvi.entity.e.f305594i, new o(aVar, mVar, screenPerformanceTracker, qVar, rVar));
    }
}
