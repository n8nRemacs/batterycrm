package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: CampaignsSaleSearchFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final n f114785a;

    /* renamed from: b, reason: collision with root package name */
    public final l f114786b;

    /* renamed from: c, reason: collision with root package name */
    public final s f114787c;

    /* renamed from: d, reason: collision with root package name */
    public final y f114788d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f114789e;

    public q(n nVar, l lVar, s sVar, y yVar, Provider provider) {
        this.f114785a = nVar;
        this.f114786b = lVar;
        this.f114787c = sVar;
        this.f114788d = yVar;
        this.f114789e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f114785a.getClass();
        m mVar = new m();
        a aVar = (a) this.f114786b.get();
        r rVar = (r) this.f114787c.get();
        this.f114788d.getClass();
        w wVar = new w();
        ScreenPerformanceTracker screenPerformanceTracker = this.f114789e.get();
        um.d.f440260h.getClass();
        return new p("CampaignsSaleSearch", um.d.f440261i, new o(mVar, aVar, screenPerformanceTracker, wVar, rVar));
    }
}
