package com.avito.android.vas_performance.di.visual_legacy;

import com.avito.android.analytics.screens.tracker.H;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LegacyVisualVasAnalyticsModule_ProvidesScreenFlowTrackerProvider$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<com.avito.android.analytics.screens.o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f320176a;

    public g(Provider<H> provider) {
        this.f320176a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f320176a.get();
        c cVar = c.f320171a;
        com.avito.android.analytics.screens.o oVarA = h12.a();
        t.d(oVarA);
        return oVarA;
    }
}
