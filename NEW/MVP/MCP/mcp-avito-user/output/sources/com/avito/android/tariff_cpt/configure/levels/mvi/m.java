package com.avito.android.tariff_cpt.configure.levels.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import qC0.C47281c;

/* compiled from: TariffCptConfigureLevelsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f297919a;

    /* renamed from: b, reason: collision with root package name */
    public final h f297920b;

    /* renamed from: c, reason: collision with root package name */
    public final o f297921c;

    /* renamed from: d, reason: collision with root package name */
    public final r f297922d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f297923e;

    public m(j jVar, h hVar, o oVar, r rVar, Provider provider) {
        this.f297919a = jVar;
        this.f297920b = hVar;
        this.f297921c = oVar;
        this.f297922d = rVar;
        this.f297923e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f297919a.get();
        g gVar = (g) this.f297920b.get();
        this.f297921c.getClass();
        n nVar = new n();
        this.f297922d.getClass();
        p pVar = new p();
        ScreenPerformanceTracker screenPerformanceTracker = this.f297923e.get();
        C47281c.f429117i.getClass();
        return new l("TariffCptConfigureLevels", C47281c.f429118j, new k(iVar, gVar, screenPerformanceTracker, pVar, nVar));
    }
}
