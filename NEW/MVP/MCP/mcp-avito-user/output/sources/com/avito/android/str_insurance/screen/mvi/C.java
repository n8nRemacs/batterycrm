package com.avito.android.str_insurance.screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: StrInsuranceTrackerWrapperImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f288727a;

    public C(Provider<ScreenPerformanceTracker> provider) {
        this.f288727a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B(this.f288727a.get());
    }
}
