package com.avito.android.short_term_rent.promo_codes.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.short_term_rent.promo_codes.di.a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSoftBookingPromoCodesModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f282433a;

    /* renamed from: b, reason: collision with root package name */
    public final u f282434b;

    public f(u uVar, Provider provider) {
        this.f282433a = provider;
        this.f282434b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C8432c) this.f282433a).get();
        C28478k c28478k = (C28478k) this.f282434b.get();
        d.f282431a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
