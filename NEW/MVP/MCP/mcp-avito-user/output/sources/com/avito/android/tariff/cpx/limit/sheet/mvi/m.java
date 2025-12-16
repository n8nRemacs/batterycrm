package com.avito.android.tariff.cpx.limit.sheet.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxLimitFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f297337a;

    /* renamed from: b, reason: collision with root package name */
    public final g f297338b;

    /* renamed from: c, reason: collision with root package name */
    public final o f297339c;

    /* renamed from: d, reason: collision with root package name */
    public final r f297340d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f297341e;

    public m(i iVar, g gVar, o oVar, r rVar, Provider provider) {
        this.f297337a = iVar;
        this.f297338b = gVar;
        this.f297339c = oVar;
        this.f297340d = rVar;
        this.f297341e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f297337a.get();
        f fVar = (f) this.f297338b.get();
        this.f297339c.getClass();
        n nVar = new n();
        p pVar = (p) this.f297340d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f297341e.get();
        NB0.c.f11306o.getClass();
        return new k("TariffCpxLimits", NB0.c.f11307p, new j(hVar, fVar, screenPerformanceTracker, pVar, nVar));
    }
}
