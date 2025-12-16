package com.avito.android.mortgage.manager_usp.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import z00.C50335d;

/* compiled from: ManagerUspFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f200433a;

    /* renamed from: b, reason: collision with root package name */
    public final c f200434b;

    /* renamed from: c, reason: collision with root package name */
    public final j f200435c;

    /* renamed from: d, reason: collision with root package name */
    public final l f200436d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f200437e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f200433a = eVar;
        this.f200434b = cVar;
        this.f200435c = jVar;
        this.f200436d = lVar;
        this.f200437e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f200433a.get();
        b bVar = (b) this.f200434b.get();
        this.f200435c.getClass();
        i iVar = new i();
        k kVar = (k) this.f200436d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f200437e.get();
        C50335d.f443686f.getClass();
        return new g("ManagerUsp", C50335d.f443687g, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
