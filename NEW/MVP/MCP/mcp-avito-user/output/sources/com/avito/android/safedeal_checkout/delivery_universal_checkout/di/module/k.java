package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module;

import com.avito.android.analytics.screens.DeliveryUniversalCheckoutScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47101d;

/* compiled from: DeliveryUniversalCheckoutModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f257037a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f257038b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f257039c;

    /* renamed from: d, reason: collision with root package name */
    public final u f257040d;

    public k(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f257037a = provider;
        this.f257038b = provider2;
        this.f257039c = provider3;
        this.f257040d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = this.f257037a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f257038b.get();
        a.b bVar = this.f257039c.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f257040d.get();
        j.f257036a.getClass();
        return d.a.a(dVar, aVar, bVar, new C47101d(screenPerformanceTracker), null, null, null, new C42699b(DeliveryUniversalCheckoutScreen.f90339d.f90471b, Collections.singletonList(Owners.f210401E0), "DeliveryUniversalCheckout", false, 8, null), 56);
    }
}
