package com.avito.android.universal_map.map.di;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: UniversalMapTrackerModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class V implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map.tracker.c> f305041a;

    public V(Provider<com.avito.android.universal_map.map.tracker.c> provider) {
        this.f305041a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.universal_map.map.tracker.c cVar = this.f305041a.get();
        int i12 = S.f305037a;
        return cVar;
    }
}
