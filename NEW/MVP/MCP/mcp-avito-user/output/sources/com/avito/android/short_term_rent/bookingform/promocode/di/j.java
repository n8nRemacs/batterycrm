package com.avito.android.short_term_rent.bookingform.promocode.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrBookingFormPromoCodeDialogScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.short_term_rent.bookingform.promocode.di.k;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormPromoCodeTrackerModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f282112a;

    /* renamed from: b, reason: collision with root package name */
    public final l f282113b;

    public j(l lVar, Provider provider) {
        this.f282112a = provider;
        this.f282113b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((k.b.C8418b) this.f282112a).get();
        r rVar = (r) this.f282113b.f393949a;
        i.f282111a.getClass();
        return interfaceC28481c.a(new C28478k(StrBookingFormPromoCodeDialogScreen.f90506d, rVar, null, 4, null));
    }
}
