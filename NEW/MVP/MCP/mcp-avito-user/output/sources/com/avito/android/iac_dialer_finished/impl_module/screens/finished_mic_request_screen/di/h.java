package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacFinishedMicRequestScreenPerformanceTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f166748a;

    /* renamed from: b, reason: collision with root package name */
    public final l f166749b;

    public h(l lVar, Provider provider) {
        this.f166748a = provider;
        this.f166749b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.e) this.f166748a).get();
        r rVar = (r) this.f166749b.f393949a;
        int i12 = f.f166747a;
        return interfaceC28481c.a(new C28478k(IacFinishedMicRequestScreen.f166726d, rVar, null, 4, null));
    }
}
