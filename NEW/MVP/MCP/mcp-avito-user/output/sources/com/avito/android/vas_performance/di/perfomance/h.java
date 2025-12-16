package com.avito.android.vas_performance.di.perfomance;

import com.avito.android.analytics.screens.tracker.H;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PerformanceVasAnalyticsModuleNew_ProvidesScreenFlowTrackerProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<com.avito.android.analytics.screens.o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f320038a;

    public h(Provider<H> provider) {
        this.f320038a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f320038a.get();
        H.c cVar = f.f320036a;
        com.avito.android.analytics.screens.o oVarA = h12.a();
        t.d(oVarA);
        return oVarA;
    }
}
