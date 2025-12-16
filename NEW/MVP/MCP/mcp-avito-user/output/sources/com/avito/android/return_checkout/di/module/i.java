package com.avito.android.return_checkout.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryReturnCheckoutTrackerModule_ProvidesScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f255290a;

    /* renamed from: b, reason: collision with root package name */
    public final l f255291b;

    /* renamed from: c, reason: collision with root package name */
    public final u f255292c;

    public i(l lVar, u uVar, Provider provider) {
        this.f255290a = provider;
        this.f255291b = lVar;
        this.f255292c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f255290a.get();
        r rVar = (r) this.f255291b.f393949a;
        Screen screen = (Screen) this.f255292c.get();
        g.f255288a.getClass();
        return interfaceC28481c.a(new C28478k(screen, rVar, null, 4, null));
    }
}
