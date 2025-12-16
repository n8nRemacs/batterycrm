package com.avito.android.safedeal.delivery.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.OrderCancellationReasonsScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RdsOrderCancellationReasonsTrackerModule_ProvidesScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f256070a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f256071b;

    public k(dagger.internal.l lVar, Provider provider) {
        this.f256070a = provider;
        this.f256071b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f256070a.get();
        r rVar = (r) this.f256071b.f393949a;
        j.f256069a.getClass();
        return interfaceC28481c.a(new C28478k(OrderCancellationReasonsScreen.f90439d, rVar, "cancellation-reasons-list"));
    }
}
