package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DealCabinetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f137120a;

    /* renamed from: b, reason: collision with root package name */
    public final e f137121b;

    /* renamed from: c, reason: collision with root package name */
    public final p f137122c;

    /* renamed from: d, reason: collision with root package name */
    public final s f137123d;

    /* renamed from: e, reason: collision with root package name */
    public final u f137124e;

    public j(g gVar, e eVar, p pVar, s sVar, u uVar) {
        this.f137120a = gVar;
        this.f137121b = eVar;
        this.f137122c = pVar;
        this.f137123d = sVar;
        this.f137124e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f137120a.get();
        a aVar = (a) this.f137121b.get();
        o oVar = (o) this.f137122c.get();
        q qVar = (q) this.f137123d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f137124e.get();
        zw.d.f444379i.getClass();
        return new i("RealtyAgencyProfile", zw.d.f444380j, new h(fVar, aVar, screenPerformanceTracker, qVar, oVar));
    }
}
