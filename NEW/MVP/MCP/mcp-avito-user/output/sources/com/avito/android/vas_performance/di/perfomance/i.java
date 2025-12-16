package com.avito.android.vas_performance.di.perfomance;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PerformanceVasAnalyticsModuleNew_ProvidesScreenInitTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<InterfaceC28501x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f320039a;

    public i(Provider<H> provider) {
        this.f320039a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28501x interfaceC28501xC = this.f320039a.get().c(f.f320036a);
        t.d(interfaceC28501xC);
        return interfaceC28501xC;
    }
}
