package com.avito.android.vas_performance.di.visual_legacy;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LegacyVisualVasAnalyticsModule_ProvidesScreenDiInjectTracker$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final u f320174a;

    /* renamed from: b, reason: collision with root package name */
    public final e f320175b;

    public f(u uVar, e eVar) {
        this.f320174a = uVar;
        this.f320175b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = (H) this.f320174a.get();
        H.c cVar = (H.c) this.f320175b.get();
        c cVar2 = c.f320171a;
        InterfaceC28499v interfaceC28499vB = h12.b(cVar);
        t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
