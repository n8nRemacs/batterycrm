package com.avito.android.tariff.cpx.info.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wB0.C49483c;

/* compiled from: TariffCpxInfoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f296733a;

    /* renamed from: b, reason: collision with root package name */
    public final h f296734b;

    /* renamed from: c, reason: collision with root package name */
    public final o f296735c;

    /* renamed from: d, reason: collision with root package name */
    public final s f296736d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f296737e;

    public m(j jVar, h hVar, o oVar, s sVar, Provider provider) {
        this.f296733a = jVar;
        this.f296734b = hVar;
        this.f296735c = oVar;
        this.f296736d = sVar;
        this.f296737e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f296733a.get();
        g gVar = (g) this.f296734b.get();
        this.f296735c.getClass();
        n nVar = new n();
        q qVar = (q) this.f296736d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f296737e.get();
        C49483c.f441321f.getClass();
        return new l("TariffCpxInfo", C49483c.f441322g, new k(iVar, gVar, screenPerformanceTracker, qVar, nVar));
    }
}
