package com.avito.android.order.feature.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinReloadScreenAction;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47101d;

/* compiled from: OrderModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f209564a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f209565b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f209566c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Wi.b> f209567d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f209568e;

    /* renamed from: f, reason: collision with root package name */
    public final u f209569f;

    public e(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f209564a = provider;
        this.f209565b = provider2;
        this.f209566c = provider3;
        this.f209567d = provider4;
        this.f209568e = lVar;
        this.f209569f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = this.f209564a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f209565b.get();
        a.b bVar = this.f209566c.get();
        Wi.b bVar2 = this.f209567d.get();
        C28478k c28478k = (C28478k) this.f209568e.f393949a;
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f209569f.get();
        c.f209563a.getClass();
        C47101d c47101d = new C47101d(screenPerformanceTracker);
        Set setSingleton = Collections.singleton(new gj.f(BeduinReloadScreenAction.class, bVar2));
        Screen screen = c28478k.f90636a;
        InterfaceC40691b interfaceC40691bA = d.a.a(dVar, aVar, bVar, c47101d, setSingleton, null, null, new C42699b(screen.f90471b, Collections.singletonList(Owners.f210421K0), "Order", false, 8, null), 48);
        ((com.avito.android.beduin.context.c) interfaceC40691bA).g(screen);
        return interfaceC40691bA;
    }
}
