package com.avito.android.str_calendar.booking_calendar.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_calendar.booking_calendar.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingCalendarModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final h f286278a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f286279b;

    /* renamed from: c, reason: collision with root package name */
    public final u f286280c;

    public j(h hVar, Provider provider, u uVar) {
        this.f286278a = hVar;
        this.f286279b = provider;
        this.f286280c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.b) this.f286279b).get();
        C28478k c28478k = (C28478k) this.f286280c.get();
        this.f286278a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
