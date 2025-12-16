package com.avito.android.campaigns_sale.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import javax.inject.Provider;

/* compiled from: CampaignsSaleFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class M implements dagger.internal.h<L> {

    /* renamed from: a, reason: collision with root package name */
    public final J f114105a;

    /* renamed from: b, reason: collision with root package name */
    public final y f114106b;

    /* renamed from: c, reason: collision with root package name */
    public final O f114107c;

    /* renamed from: d, reason: collision with root package name */
    public final S f114108d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f114109e;

    public M(J j12, y yVar, O o12, S s5, Provider provider) {
        this.f114105a = j12;
        this.f114106b = yVar;
        this.f114107c = o12;
        this.f114108d = s5;
        this.f114109e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I i12 = (I) this.f114105a.get();
        w wVar = (w) this.f114106b.get();
        N n12 = (N) this.f114107c.get();
        P p12 = (P) this.f114108d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f114109e.get();
        CampaignsSaleState.f114186s.getClass();
        return new L("CampaignsSale", CampaignsSaleState.f114187t, new K(i12, wVar, screenPerformanceTracker, p12, n12));
    }
}
