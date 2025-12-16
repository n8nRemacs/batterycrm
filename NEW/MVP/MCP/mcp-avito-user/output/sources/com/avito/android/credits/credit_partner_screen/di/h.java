package com.avito.android.credits.credit_partner_screen.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreditPartnerTrackerModule_ProvideScreenInitTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<InterfaceC28501x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f128797a;

    public h(Provider<H> provider) {
        this.f128797a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f128797a.get();
        int i12 = e.f128794a;
        InterfaceC28501x interfaceC28501xC = h12.c(H.a.f90737a);
        t.d(interfaceC28501xC);
        return interfaceC28501xC;
    }
}
