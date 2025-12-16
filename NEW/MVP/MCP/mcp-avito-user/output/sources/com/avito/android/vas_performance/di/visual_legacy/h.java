package com.avito.android.vas_performance.di.visual_legacy;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LegacyVisualVasAnalyticsModule_ProvidesScreenInitTracker$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<InterfaceC28501x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f320177a;

    /* renamed from: b, reason: collision with root package name */
    public final e f320178b;

    public h(Provider provider, e eVar) {
        this.f320177a = provider;
        this.f320178b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f320177a.get();
        H.c cVar = (H.c) this.f320178b.get();
        c cVar2 = c.f320171a;
        InterfaceC28501x interfaceC28501xC = h12.c(cVar);
        t.d(interfaceC28501xC);
        return interfaceC28501xC;
    }
}
