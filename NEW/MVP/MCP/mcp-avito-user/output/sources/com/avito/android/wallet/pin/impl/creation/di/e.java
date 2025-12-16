package com.avito.android.wallet.pin.impl.creation.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.wallet.pin.impl.creation.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47101d;

/* compiled from: WalletPinCreationModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f328505a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f328506b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f328507c;

    /* renamed from: d, reason: collision with root package name */
    public final u f328508d;

    /* renamed from: e, reason: collision with root package name */
    public final l f328509e;

    public e(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f328505a = provider;
        this.f328506b = provider2;
        this.f328507c = provider3;
        this.f328508d = uVar;
        this.f328509e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((a.c.C10193c) this.f328505a).f328499a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.d) this.f328506b).get();
        a.b bVar = (a.b) ((a.c.e) this.f328507c).get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f328508d.get();
        C28478k c28478k = (C28478k) this.f328509e.f393949a;
        d.f328504a.getClass();
        return d.a.a(dVarEl, aVar, bVar, new C47101d(screenPerformanceTracker), null, null, null, new C42699b(c28478k.f90636a.f90471b, Collections.singletonList(Owners.f210462Y0), "WalletPinCreation", false, 8, null), 56);
    }
}
