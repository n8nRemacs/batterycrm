package com.avito.android.cpx_promo.delayedstart.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo.delayedstart.mvi.entity.CpxPromoDelayedStartState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxPromoDelayedStartFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f126874a;

    /* renamed from: b, reason: collision with root package name */
    public final c f126875b;

    /* renamed from: c, reason: collision with root package name */
    public final j f126876c;

    /* renamed from: d, reason: collision with root package name */
    public final l f126877d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f126878e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f126874a = eVar;
        this.f126875b = cVar;
        this.f126876c = jVar;
        this.f126877d = lVar;
        this.f126878e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f126874a.get();
        b bVar = (b) this.f126875b.get();
        this.f126876c.getClass();
        i iVar = new i();
        this.f126877d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f126878e.get();
        CpxPromoDelayedStartState.f126864e.getClass();
        return new g("CpxPromoDelayedStart", CpxPromoDelayedStartState.f126865f, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
