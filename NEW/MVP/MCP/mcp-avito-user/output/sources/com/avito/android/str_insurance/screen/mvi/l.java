package com.avito.android.str_insurance.screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: StrInsuranceFlatFormTrackerWrapperImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f288756a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.o> f288757b;

    public l(dagger.internal.u uVar, Provider provider) {
        this.f288756a = uVar;
        this.f288757b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((ScreenPerformanceTracker) this.f288756a.get(), this.f288757b.get());
    }
}
