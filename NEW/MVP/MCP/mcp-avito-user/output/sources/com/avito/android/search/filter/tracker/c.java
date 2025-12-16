package com.avito.android.search.filter.tracker;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FiltersTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f263803a;

    public c(u uVar) {
        this.f263803a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((ScreenPerformanceTracker) this.f263803a.get());
    }
}
