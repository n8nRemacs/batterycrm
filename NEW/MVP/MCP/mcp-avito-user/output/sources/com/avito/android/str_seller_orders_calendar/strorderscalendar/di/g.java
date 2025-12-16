package com.avito.android.str_seller_orders_calendar.strorderscalendar.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarCoreModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final d f290645a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f290646b;

    /* renamed from: c, reason: collision with root package name */
    public final u f290647c;

    public g(d dVar, Provider provider, u uVar) {
        this.f290645a = dVar;
        this.f290646b = provider;
        this.f290647c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.d) this.f290646b).get();
        C28478k c28478k = (C28478k) this.f290647c.get();
        this.f290645a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
