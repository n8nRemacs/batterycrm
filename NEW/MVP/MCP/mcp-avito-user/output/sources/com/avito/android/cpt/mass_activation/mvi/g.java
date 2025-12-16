package com.avito.android.cpt.mass_activation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptMassActivationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f126596a;

    /* renamed from: b, reason: collision with root package name */
    public final b f126597b;

    /* renamed from: c, reason: collision with root package name */
    public final i f126598c;

    /* renamed from: d, reason: collision with root package name */
    public final k f126599d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f126600e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f126596a = dVar;
        this.f126597b = bVar;
        this.f126598c = iVar;
        this.f126599d = kVar;
        this.f126600e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f126596a.get();
        a aVar = (a) this.f126597b.get();
        this.f126598c.getClass();
        h hVar = new h();
        j jVar = (j) this.f126599d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f126600e.get();
        Vr.c.f17432h.getClass();
        return new f("CptMassActivation", Vr.c.f17433i, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
