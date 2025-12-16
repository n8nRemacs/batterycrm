package com.avito.android.autoteka.di.landing;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.di.landing.i;
import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinReloadScreenAction;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import dagger.internal.l;
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

/* compiled from: AutotekaLandingModule_Companion_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f96431a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f96432b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f96433c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Wi.b> f96434d;

    /* renamed from: e, reason: collision with root package name */
    public final l f96435e;

    /* renamed from: f, reason: collision with root package name */
    public final u f96436f;

    public d(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f96431a = provider;
        this.f96432b = provider2;
        this.f96433c = provider3;
        this.f96434d = provider4;
        this.f96435e = lVar;
        this.f96436f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((i.b.d) this.f96431a).f96465a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((i.b.e) this.f96432b).get();
        a.b bVar = (a.b) ((i.b.f) this.f96433c).get();
        Wi.b bVar2 = this.f96434d.get();
        C28478k c28478k = (C28478k) this.f96435e.f393949a;
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f96436f.get();
        b.f96428a.getClass();
        C47101d c47101d = new C47101d(screenPerformanceTracker);
        Set setSingleton = Collections.singleton(new gj.f(BeduinReloadScreenAction.class, bVar2));
        Screen screen = c28478k.f90636a;
        InterfaceC40691b interfaceC40691bA = d.a.a(dVarEl, aVar, bVar, c47101d, setSingleton, null, null, new C42699b(screen.f90471b, Collections.singletonList(Owners.f210512m), "AutotekaLanding", false, 8, null), 48);
        ((com.avito.android.beduin.context.c) interfaceC40691bA).g(screen);
        return interfaceC40691bA;
    }
}
