package com.avito.android.return_checkout.di.module;

import com.avito.android.analytics.screens.Screen;
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

/* compiled from: DeliveryReturnCheckoutModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f255282a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f255283b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f255284c;

    /* renamed from: d, reason: collision with root package name */
    public final u f255285d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Screen> f255286e;

    public d(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f255282a = provider;
        this.f255283b = provider2;
        this.f255284c = provider3;
        this.f255285d = uVar;
        this.f255286e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = this.f255282a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f255283b.get();
        a.b bVar = this.f255284c.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f255285d.get();
        Screen screen = this.f255286e.get();
        c.f255281a.getClass();
        InterfaceC40691b interfaceC40691bA = d.a.a(dVar, aVar, bVar, new C47101d(screenPerformanceTracker), null, null, null, new C42699b(screen.f90471b, Collections.singletonList(Owners.f210503j3), "DeliveryReturnCheckout", false, 8, null), 56);
        ((com.avito.android.beduin.context.c) interfaceC40691bA).g(screen);
        return interfaceC40691bA;
    }
}
