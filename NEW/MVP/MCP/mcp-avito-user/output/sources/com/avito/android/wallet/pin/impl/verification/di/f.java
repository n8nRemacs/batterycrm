package com.avito.android.wallet.pin.impl.verification.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.wallet.pin.impl.verification.di.b;
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

/* compiled from: WalletPinVerificationModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f329099a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f329100b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f329101c;

    /* renamed from: d, reason: collision with root package name */
    public final u f329102d;

    /* renamed from: e, reason: collision with root package name */
    public final l f329103e;

    public f(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f329099a = provider;
        this.f329100b = provider2;
        this.f329101c = provider3;
        this.f329102d = uVar;
        this.f329103e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((b.c.C10220c) this.f329099a).f329092a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((b.c.e) this.f329100b).get();
        a.b bVar = (a.b) ((b.c.f) this.f329101c).get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f329102d.get();
        C28478k c28478k = (C28478k) this.f329103e.f393949a;
        e.f329098a.getClass();
        return d.a.a(dVarEl, aVar, bVar, new C47101d(screenPerformanceTracker), null, null, null, new C42699b(c28478k.f90636a.f90471b, Collections.singletonList(Owners.f210462Y0), "WalletPinVerification", false, 8, null), 56);
    }
}
