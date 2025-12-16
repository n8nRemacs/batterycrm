package com.avito.android.bundles.di;

import com.avito.android.analytics.screens.BundlesScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bundles.di.f;
import javax.inject.Provider;

/* compiled from: VasBundlesAnalyticsModule_ProvideScreenTrackerFactory$_avito_vas_bundles_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f108304a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f108305b;

    public h(dagger.internal.l lVar, Provider provider) {
        this.f108304a = provider;
        this.f108305b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((f.c.d) this.f108304a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f108305b.f393949a;
        int i12 = g.f108303a;
        BundlesScreen bundlesScreen = BundlesScreen.f90303d;
        bundlesScreen.getClass();
        return interfaceC28481c.a(new C28478k(bundlesScreen, rVar, BundlesScreen.f90304e));
    }
}
