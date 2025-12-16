package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxPromoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final o f127238a;

    /* renamed from: b, reason: collision with root package name */
    public final m f127239b;

    /* renamed from: c, reason: collision with root package name */
    public final t f127240c;

    /* renamed from: d, reason: collision with root package name */
    public final v f127241d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f127242e;

    public r(o oVar, m mVar, t tVar, v vVar, Provider provider) {
        this.f127238a = oVar;
        this.f127239b = mVar;
        this.f127240c = tVar;
        this.f127241d = vVar;
        this.f127242e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = (n) this.f127238a.get();
        k kVar = (k) this.f127239b.get();
        this.f127240c.getClass();
        s sVar = new s();
        u uVar = (u) this.f127241d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f127242e.get();
        CpxPromoState.f127107m.getClass();
        return new q("CpxPromo", CpxPromoState.f127108n, new p(nVar, kVar, screenPerformanceTracker, uVar, sVar));
    }
}
