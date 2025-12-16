package com.avito.android.vas_performance.di.competitive;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.CompetitiveVasScreen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.vas_performance.di.competitive.s;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitiveVasAnalyticsModule_ProvideScreenTrackerFactory$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f319948a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f319949b;

    public e(dagger.internal.l lVar, Provider provider) {
        this.f319948a = provider;
        this.f319949b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((s.b.c) this.f319948a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f319949b.f393949a;
        int i12 = d.f319947a;
        CompetitiveVasScreen competitiveVasScreen = CompetitiveVasScreen.f90327d;
        competitiveVasScreen.getClass();
        return interfaceC28481c.a(new C28478k(competitiveVasScreen, rVar, CompetitiveVasScreen.f90328e));
    }
}
