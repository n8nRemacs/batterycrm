package com.avito.android.loyalty.ui.badge_details_v3.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import fX.C40354b;

/* compiled from: BadgeDetailsV3FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f183345a;

    /* renamed from: b, reason: collision with root package name */
    public final c f183346b;

    /* renamed from: c, reason: collision with root package name */
    public final j f183347c;

    /* renamed from: d, reason: collision with root package name */
    public final l f183348d;

    /* renamed from: e, reason: collision with root package name */
    public final u f183349e;

    public h(e eVar, c cVar, j jVar, l lVar, u uVar) {
        this.f183345a = eVar;
        this.f183346b = cVar;
        this.f183347c = jVar;
        this.f183348d = lVar;
        this.f183349e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f183345a.get();
        b bVar = (b) this.f183346b.get();
        i iVar = (i) this.f183347c.get();
        k kVar = (k) this.f183348d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f183349e.get();
        C40354b.f395899d.getClass();
        return new g("BadgeDetailsV3", C40354b.f395900e, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
