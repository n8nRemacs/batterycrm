package com.avito.android.vas_autoprolong.screens.autoprolong.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import jL0.C42282c;
import javax.inject.Provider;

/* compiled from: AutoprolongFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f319551a;

    /* renamed from: b, reason: collision with root package name */
    public final d f319552b;

    /* renamed from: c, reason: collision with root package name */
    public final k f319553c;

    /* renamed from: d, reason: collision with root package name */
    public final n f319554d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f319555e;

    public i(f fVar, d dVar, k kVar, n nVar, Provider provider) {
        this.f319551a = fVar;
        this.f319552b = dVar;
        this.f319553c = kVar;
        this.f319554d = nVar;
        this.f319555e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f319551a.get();
        c cVar = (c) this.f319552b.get();
        this.f319553c.getClass();
        j jVar = new j();
        this.f319554d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f319555e.get();
        C42282c.f405563l.getClass();
        return new h("VasAutoprolong", C42282c.f405564m, new g(eVar, cVar, screenPerformanceTracker, mVar, jVar));
    }
}
