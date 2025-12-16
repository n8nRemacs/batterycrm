package com.avito.android.vas_performance.di.perfomance;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PerformanceVasAnalyticsModuleNew_ProvidesScreenDiInjectTracker$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final u f320037a;

    public g(u uVar) {
        this.f320037a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28499v interfaceC28499vB = ((H) this.f320037a.get()).b(f.f320036a);
        t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
