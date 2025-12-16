package com.avito.android.vas_performance.screens.competitive.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitiveVasV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f320458a;

    /* renamed from: b, reason: collision with root package name */
    public final c f320459b;

    /* renamed from: c, reason: collision with root package name */
    public final j f320460c;

    /* renamed from: d, reason: collision with root package name */
    public final l f320461d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f320462e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f320463f;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider, dagger.internal.l lVar2) {
        this.f320458a = eVar;
        this.f320459b = cVar;
        this.f320460c = jVar;
        this.f320461d = lVar;
        this.f320462e = provider;
        this.f320463f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        int i12;
        d dVar = (d) this.f320458a.get();
        b bVar = (b) this.f320459b.get();
        this.f320460c.getClass();
        i iVar = new i();
        k kVar = (k) this.f320461d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f320462e.get();
        boolean zBooleanValue = ((Boolean) this.f320463f.f393949a).booleanValue();
        JL0.c.f8893n.getClass();
        JL0.c cVar = JL0.c.f8894o;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        if (zBooleanValue) {
            com.akita.compose.theme.re23.b.f63985c.getClass();
            i12 = com.akita.compose.theme.re23.e.f64237O3;
        } else {
            com.akita.compose.theme.re23.b.f63985c.getClass();
            i12 = com.akita.compose.theme.re23.e.f64233O;
        }
        return new g("CompetitiveVasV2", JL0.c.a(cVar, zBooleanValue, false, null, i12, null, null, null, null, null, null, null, null, 4086), new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
