package com.avito.android.short_term_rent.promo_codes.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSoftBookingPromoCodesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f282477a;

    /* renamed from: b, reason: collision with root package name */
    public final c f282478b;

    /* renamed from: c, reason: collision with root package name */
    public final j f282479c;

    /* renamed from: d, reason: collision with root package name */
    public final l f282480d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f282481e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f282477a = eVar;
        this.f282478b = cVar;
        this.f282479c = jVar;
        this.f282480d = lVar;
        this.f282481e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f282477a.get();
        b bVar = (b) this.f282478b.get();
        this.f282479c.getClass();
        i iVar = new i();
        this.f282480d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f282481e.get();
        nw0.c.f419237m.getClass();
        return new g("StrSoftBookingPromoCodes", nw0.c.f419238n, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
