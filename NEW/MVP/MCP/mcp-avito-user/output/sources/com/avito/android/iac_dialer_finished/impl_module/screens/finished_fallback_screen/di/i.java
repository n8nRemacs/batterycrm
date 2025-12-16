package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacFinishedFallbackScreenPerformanceTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f166572a;

    /* renamed from: b, reason: collision with root package name */
    public final l f166573b;

    public i(l lVar, Provider provider) {
        this.f166572a = provider;
        this.f166573b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C4949c) this.f166572a).get();
        r rVar = (r) this.f166573b.f393949a;
        int i12 = g.f166571a;
        return interfaceC28481c.a(new C28478k(IacFinishedCallScreen.f166554d, rVar, null, 4, null));
    }
}
