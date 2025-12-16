package com.avito.android.orders.feature.beduin_orders_list.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinReloadScreenAction;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.orders.feature.beduin_orders_list.di.i;
import com.avito.android.ownership.Owners;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47101d;

/* compiled from: BeduinOrdersModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f210017a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f210018b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f210019c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Wi.b> f210020d;

    /* renamed from: e, reason: collision with root package name */
    public final l f210021e;

    /* renamed from: f, reason: collision with root package name */
    public final h f210022f;

    public e(Provider provider, Provider provider2, Provider provider3, Provider provider4, l lVar, h hVar) {
        this.f210017a = provider;
        this.f210018b = provider2;
        this.f210019c = provider3;
        this.f210020d = provider4;
        this.f210021e = lVar;
        this.f210022f = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((i.b.a) this.f210017a).f210046a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((i.b.c) this.f210018b).get();
        a.b bVar = (a.b) ((i.b.d) this.f210019c).get();
        Wi.b bVar2 = this.f210020d.get();
        C28478k c28478k = (C28478k) this.f210021e.f393949a;
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f210022f.get();
        d.f210016a.getClass();
        C47101d c47101d = new C47101d(screenPerformanceTracker);
        Set setSingleton = Collections.singleton(new gj.f(BeduinReloadScreenAction.class, bVar2));
        Screen screen = c28478k.f90636a;
        InterfaceC40691b interfaceC40691bA = d.a.a(dVarEl, aVar, bVar, c47101d, setSingleton, null, null, new C42699b(screen.f90471b, Collections.singletonList(Owners.f210421K0), "Orders", false, 8, null), 48);
        ((com.avito.android.beduin.context.c) interfaceC40691bA).g(screen);
        return interfaceC40691bA;
    }
}
