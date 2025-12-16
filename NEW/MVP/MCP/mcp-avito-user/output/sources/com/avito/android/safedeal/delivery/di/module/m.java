package com.avito.android.safedeal.delivery.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ReasonDetailsScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReasonDetailsTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f256073a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f256074b;

    public m(dagger.internal.l lVar, Provider provider) {
        this.f256073a = provider;
        this.f256074b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f256073a.get();
        r rVar = (r) this.f256074b.f393949a;
        l.f256072a.getClass();
        return interfaceC28481c.a(new C28478k(ReasonDetailsScreen.f90457d, rVar, "concrete-cancellation-reason"));
    }
}
