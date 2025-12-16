package com.avito.android.order.feature.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrderPerformanceModule_ProvideScreenTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final h f209572a;

    /* renamed from: b, reason: collision with root package name */
    public final u f209573b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f209574c;

    public i(h hVar, u uVar, dagger.internal.l lVar) {
        this.f209572a = hVar;
        this.f209573b = uVar;
        this.f209574c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) this.f209573b.get();
        C28478k c28478k = (C28478k) this.f209574c.f393949a;
        this.f209572a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
