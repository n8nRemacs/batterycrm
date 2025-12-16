package com.avito.android.iac_dialer.impl_module.screens.call_screen.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacCallScreenPerformanceTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f166263a;

    /* renamed from: b, reason: collision with root package name */
    public final l f166264b;

    public g(l lVar, Provider provider) {
        this.f166263a = provider;
        this.f166264b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C4934a) this.f166263a).get();
        r rVar = (r) this.f166264b.f393949a;
        int i12 = e.f166262a;
        return interfaceC28481c.a(new C28478k(IacCallScreen.f166255d, rVar, null, 4, null));
    }
}
