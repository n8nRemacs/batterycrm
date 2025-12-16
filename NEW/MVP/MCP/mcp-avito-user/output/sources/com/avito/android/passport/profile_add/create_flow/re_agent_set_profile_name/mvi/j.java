package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentSetProfileNameFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f211505a;

    /* renamed from: b, reason: collision with root package name */
    public final l f211506b;

    /* renamed from: c, reason: collision with root package name */
    public final n f211507c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f211508d;

    public j(g gVar, l lVar, n nVar, Provider provider) {
        this.f211505a = gVar;
        this.f211506b = lVar;
        this.f211507c = nVar;
        this.f211508d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f211505a.get();
        this.f211506b.getClass();
        k kVar = new k();
        this.f211507c.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f211508d.get();
        ReAgentSetProfileNameState.f211484i.getClass();
        return new i("ReAgentSetProfileName", ReAgentSetProfileNameState.f211485j, new h(eVar, screenPerformanceTracker, mVar, kVar));
    }
}
