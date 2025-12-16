package com.avito.android.bbl.screens.configure.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yh.C50251c;

/* compiled from: BblConfigureFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f99231a;

    /* renamed from: b, reason: collision with root package name */
    public final d f99232b;

    /* renamed from: c, reason: collision with root package name */
    public final k f99233c;

    /* renamed from: d, reason: collision with root package name */
    public final n f99234d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f99235e;

    public i(f fVar, d dVar, k kVar, n nVar, Provider provider) {
        this.f99231a = fVar;
        this.f99232b = dVar;
        this.f99233c = kVar;
        this.f99234d = nVar;
        this.f99235e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f99231a.get();
        c cVar = (c) this.f99232b.get();
        this.f99233c.getClass();
        j jVar = new j();
        l lVar = (l) this.f99234d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f99235e.get();
        C50251c.f443456m.getClass();
        return new h("BblConfigure", C50251c.f443457n, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
