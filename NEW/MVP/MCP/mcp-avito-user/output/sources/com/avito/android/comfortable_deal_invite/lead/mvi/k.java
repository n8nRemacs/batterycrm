package com.avito.android.comfortable_deal_invite.lead.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zq.C50611c;

/* compiled from: ComfortableDealInviteFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final o f123710a;

    /* renamed from: b, reason: collision with root package name */
    public final h f123711b;

    /* renamed from: c, reason: collision with root package name */
    public final m f123712c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f123713d;

    public k(o oVar, h hVar, m mVar, Provider provider) {
        this.f123710a = oVar;
        this.f123711b = hVar;
        this.f123712c = mVar;
        this.f123713d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f123710a.getClass();
        n nVar = new n();
        f fVar = (f) this.f123711b.get();
        this.f123712c.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f123713d.get();
        C50611c.f444278w.getClass();
        return new j("ComfortableDealInvite", C50611c.f444279x, new i(screenPerformanceTracker, nVar, fVar, lVar));
    }
}
