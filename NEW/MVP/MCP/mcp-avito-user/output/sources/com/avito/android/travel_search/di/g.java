package com.avito.android.travel_search.di;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelSearchFiltersModule_ProvideInlineFiltersTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<CN.o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f303067a;

    public g(Provider<ScreenPerformanceTracker> provider) {
        this.f303067a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ScreenPerformanceTracker screenPerformanceTracker = this.f303067a.get();
        d.f303059a.getClass();
        return new CN.p(screenPerformanceTracker);
    }
}
