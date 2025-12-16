package com.avito.android.str_calendar.seller.last_minute_offer.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_calendar.seller.last_minute_offer.di.a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LastMinuteOfferModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f287879a;

    /* renamed from: b, reason: collision with root package name */
    public final u f287880b;

    public f(u uVar, Provider provider) {
        this.f287879a = provider;
        this.f287880b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C8649a) this.f287879a).get();
        C28478k c28478k = (C28478k) this.f287880b.get();
        d.f287877a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
