package com.avito.android.tariff_cpt.info.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptInfoV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f298260a;

    /* renamed from: b, reason: collision with root package name */
    public final g f298261b;

    /* renamed from: c, reason: collision with root package name */
    public final n f298262c;

    /* renamed from: d, reason: collision with root package name */
    public final q f298263d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f298264e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f298265f;

    public l(i iVar, g gVar, n nVar, q qVar, Provider provider, dagger.internal.l lVar) {
        this.f298260a = iVar;
        this.f298261b = gVar;
        this.f298262c = nVar;
        this.f298263d = qVar;
        this.f298264e = provider;
        this.f298265f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f298260a.get();
        f fVar = (f) this.f298261b.get();
        this.f298262c.getClass();
        m mVar = new m();
        this.f298263d.getClass();
        o oVar = new o();
        ScreenPerformanceTracker screenPerformanceTracker = this.f298264e.get();
        String str = (String) this.f298265f.f393949a;
        yC0.c.f442978h.getClass();
        return new k("CptInfoV2", yC0.c.a(yC0.c.f442979i, null, null, str, null, false, 55), new j(hVar, fVar, screenPerformanceTracker, oVar, mVar));
    }
}
