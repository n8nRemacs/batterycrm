package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxPromoV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final q f127773a;

    /* renamed from: b, reason: collision with root package name */
    public final o f127774b;

    /* renamed from: c, reason: collision with root package name */
    public final v f127775c;

    /* renamed from: d, reason: collision with root package name */
    public final x f127776d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f127777e;

    public t(q qVar, o oVar, v vVar, x xVar, Provider provider) {
        this.f127773a = qVar;
        this.f127774b = oVar;
        this.f127775c = vVar;
        this.f127776d = xVar;
        this.f127777e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = (p) this.f127773a.get();
        m mVar = (m) this.f127774b.get();
        this.f127775c.getClass();
        u uVar = new u();
        w wVar = (w) this.f127776d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f127777e.get();
        CpxPromoV2State.f127622n.getClass();
        return new s("CpxPromoV2", CpxPromoV2State.f127623o, new r(pVar, mVar, screenPerformanceTracker, wVar, uVar));
    }
}
