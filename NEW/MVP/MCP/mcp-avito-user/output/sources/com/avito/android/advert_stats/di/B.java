package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.di.y;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.MnzStatsScreen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: StatsAnalyticsModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class B implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f86572a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f86573b;

    public B(dagger.internal.l lVar, Provider provider) {
        this.f86572a = provider;
        this.f86573b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((y.b.i) this.f86572a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f86573b.f393949a;
        int i12 = A.f86571a;
        return interfaceC28481c.a(new C28478k(MnzStatsScreen.f90406d, rVar, null, 4, null));
    }
}
