package com.avito.android.short_term_rent.bookingform.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.short_term_rent.bookingform.di.p;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f281258a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f281259b;

    public o(dagger.internal.u uVar, Provider provider) {
        this.f281258a = provider;
        this.f281259b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((p.b.j) this.f281258a).get();
        C28478k c28478k = (C28478k) this.f281259b.get();
        c.f281238a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
