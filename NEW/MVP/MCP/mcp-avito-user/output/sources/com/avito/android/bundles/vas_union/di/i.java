package com.avito.android.bundles.vas_union.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.VasUnionScreen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bundles.vas_union.di.d;
import javax.inject.Provider;

/* compiled from: VasUnionAnalyticsModule_ProvideScreenTrackerFactory$_avito_vas_bundles_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f108537a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f108538b;

    public i(dagger.internal.l lVar, Provider provider) {
        this.f108537a = provider;
        this.f108538b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((d.c.C3248d) this.f108537a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f108538b.f393949a;
        int i12 = h.f108536a;
        VasUnionScreen vasUnionScreen = VasUnionScreen.f90554d;
        vasUnionScreen.getClass();
        return interfaceC28481c.a(new C28478k(vasUnionScreen, rVar, VasUnionScreen.f90555e));
    }
}
