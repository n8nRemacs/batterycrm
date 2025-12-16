package com.avito.android.tariff.cpx.levels.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxLevelsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f297146a;

    /* renamed from: b, reason: collision with root package name */
    public final h f297147b;

    /* renamed from: c, reason: collision with root package name */
    public final o f297148c;

    /* renamed from: d, reason: collision with root package name */
    public final q f297149d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f297150e;

    public m(j jVar, h hVar, o oVar, q qVar, Provider provider) {
        this.f297146a = jVar;
        this.f297147b = hVar;
        this.f297148c = oVar;
        this.f297149d = qVar;
        this.f297150e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f297146a.get();
        g gVar = (g) this.f297147b.get();
        this.f297148c.getClass();
        n nVar = new n();
        p pVar = (p) this.f297149d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f297150e.get();
        HB0.c.f6992k.getClass();
        return new l("CpxLevels", HB0.c.f6993l, new k(iVar, gVar, screenPerformanceTracker, pVar, nVar));
    }
}
