package com.avito.android.reputation.ui.mvi;

import Rm0.c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReputationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f255072a;

    /* renamed from: b, reason: collision with root package name */
    public final c f255073b;

    /* renamed from: c, reason: collision with root package name */
    public final j f255074c;

    /* renamed from: d, reason: collision with root package name */
    public final l f255075d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f255076e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f255072a = eVar;
        this.f255073b = cVar;
        this.f255074c = jVar;
        this.f255075d = lVar;
        this.f255076e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f255072a.get();
        b bVar = (b) this.f255073b.get();
        this.f255074c.getClass();
        i iVar = new i();
        this.f255075d.getClass();
        k kVar = new k();
        return new g("Reputation", c.C0977c.f14614b, new f(dVar, bVar, this.f255076e.get(), kVar, iVar));
    }
}
