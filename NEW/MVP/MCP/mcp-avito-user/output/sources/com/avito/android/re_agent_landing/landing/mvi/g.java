package com.avito.android.re_agent_landing.landing.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentProfileCreateLandingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f250834a;

    /* renamed from: b, reason: collision with root package name */
    public final b f250835b;

    /* renamed from: c, reason: collision with root package name */
    public final i f250836c;

    /* renamed from: d, reason: collision with root package name */
    public final k f250837d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f250838e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f250834a = dVar;
        this.f250835b = bVar;
        this.f250836c = iVar;
        this.f250837d = kVar;
        this.f250838e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f250834a.get();
        a aVar = (a) this.f250835b.get();
        this.f250836c.getClass();
        h hVar = new h();
        j jVar = (j) this.f250837d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f250838e.get();
        Sh0.c.f15123f.getClass();
        return new f("ReAgentProfileCreateLanding", Sh0.c.f15124g, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
