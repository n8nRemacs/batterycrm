package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ts.C48709c;

/* compiled from: CpxPromoGeoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f127903a;

    /* renamed from: b, reason: collision with root package name */
    public final g f127904b;

    /* renamed from: c, reason: collision with root package name */
    public final n f127905c;

    /* renamed from: d, reason: collision with root package name */
    public final q f127906d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f127907e;

    public l(i iVar, g gVar, n nVar, q qVar, Provider provider) {
        this.f127903a = iVar;
        this.f127904b = gVar;
        this.f127905c = nVar;
        this.f127906d = qVar;
        this.f127907e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f127903a.get();
        e eVar = (e) this.f127904b.get();
        this.f127905c.getClass();
        m mVar = new m();
        o oVar = (o) this.f127906d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f127907e.get();
        C48709c.f439491r.getClass();
        return new k("CpxPromoGeo", C48709c.f439492s, new j(hVar, eVar, screenPerformanceTracker, oVar, mVar));
    }
}
