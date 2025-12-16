package com.avito.android.tariff_cpt.levels.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCptLevelsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f298661a;

    /* renamed from: b, reason: collision with root package name */
    public final h f298662b;

    /* renamed from: c, reason: collision with root package name */
    public final o f298663c;

    /* renamed from: d, reason: collision with root package name */
    public final r f298664d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f298665e;

    public m(j jVar, h hVar, o oVar, r rVar, Provider provider) {
        this.f298661a = jVar;
        this.f298662b = hVar;
        this.f298663c = oVar;
        this.f298664d = rVar;
        this.f298665e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f298661a.get();
        g gVar = (g) this.f298662b.get();
        this.f298663c.getClass();
        n nVar = new n();
        this.f298664d.getClass();
        p pVar = new p();
        ScreenPerformanceTracker screenPerformanceTracker = this.f298665e.get();
        FC0.c.f4626k.getClass();
        return new l("TariffCptLevels", FC0.c.f4627l, new k(iVar, gVar, screenPerformanceTracker, pVar, nVar));
    }
}
