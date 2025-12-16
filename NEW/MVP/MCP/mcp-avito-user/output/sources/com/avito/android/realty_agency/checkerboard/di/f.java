package com.avito.android.realty_agency.checkerboard.di;

import CN.o;
import CN.p;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckerboardModule_ProvideInlineFiltersTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f251118a;

    public f(u uVar) {
        this.f251118a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f251118a.get();
        c.f251110a.getClass();
        return new p(screenPerformanceTracker);
    }
}
