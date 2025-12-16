package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryUniversalCheckoutTrackerModule_ProvidesScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f257044a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f257045b;

    /* renamed from: c, reason: collision with root package name */
    public final u f257046c;

    public o(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f257044a = provider;
        this.f257045b = lVar;
        this.f257046c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f257044a.get();
        r rVar = (r) this.f257045b.f393949a;
        Screen screen = (Screen) this.f257046c.get();
        m.f257042a.getClass();
        return interfaceC28481c.a(new C28478k(screen, rVar, "load-page"));
    }
}
