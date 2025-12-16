package com.avito.android.location_picker;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;

/* compiled from: LocationPickerPerformanceTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class M0 implements dagger.internal.h<L0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f182177a;

    public M0(dagger.internal.u uVar) {
        this.f182177a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L0((ScreenPerformanceTracker) this.f182177a.get());
    }
}
