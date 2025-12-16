package com.avito.android.cpt.pre_activation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreActivationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f126746a;

    /* renamed from: b, reason: collision with root package name */
    public final c f126747b;

    /* renamed from: c, reason: collision with root package name */
    public final l f126748c;

    /* renamed from: d, reason: collision with root package name */
    public final n f126749d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f126750e;

    public j(g gVar, c cVar, l lVar, n nVar, Provider provider) {
        this.f126746a = gVar;
        this.f126747b = cVar;
        this.f126748c = lVar;
        this.f126749d = nVar;
        this.f126750e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f126746a.get();
        this.f126747b.getClass();
        b bVar = new b();
        this.f126748c.getClass();
        k kVar = new k();
        m mVar = (m) this.f126749d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f126750e.get();
        Xr.c.f19090f.getClass();
        return new i("PreActivation", Xr.c.f19091g, new h(fVar, bVar, screenPerformanceTracker, mVar, kVar));
    }
}
