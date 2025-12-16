package com.avito.android.vas_performance.screens.visual_v2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualVasV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f321296a;

    /* renamed from: b, reason: collision with root package name */
    public final e f321297b;

    /* renamed from: c, reason: collision with root package name */
    public final l f321298c;

    /* renamed from: d, reason: collision with root package name */
    public final p f321299d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f321300e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f321301f;

    public j(g gVar, e eVar, l lVar, p pVar, Provider provider, dagger.internal.l lVar2) {
        this.f321296a = gVar;
        this.f321297b = eVar;
        this.f321298c = lVar;
        this.f321299d = pVar;
        this.f321300e = provider;
        this.f321301f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f321296a.get();
        d dVar = (d) this.f321297b.get();
        this.f321298c.getClass();
        k kVar = new k();
        m mVar = (m) this.f321299d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f321300e.get();
        boolean zBooleanValue = ((Boolean) this.f321301f.f393949a).booleanValue();
        RL0.c.f14352k.getClass();
        return new i("VisualVasV2", RL0.c.a(RL0.c.f14353l, false, null, null, null, null, zBooleanValue, 255), new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
