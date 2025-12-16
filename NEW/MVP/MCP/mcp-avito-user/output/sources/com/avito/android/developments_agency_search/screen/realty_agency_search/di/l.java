package com.avito.android.developments_agency_search.screen.realty_agency_search.di;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InlineFiltersModule_ProvideInlineFiltersTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<CN.o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f138632a;

    public l(Provider<ScreenPerformanceTracker> provider) {
        this.f138632a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ScreenPerformanceTracker screenPerformanceTracker = this.f138632a.get();
        i.f138624a.getClass();
        return new CN.p(screenPerformanceTracker);
    }
}
