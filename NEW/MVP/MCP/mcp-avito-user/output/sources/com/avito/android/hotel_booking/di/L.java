package com.avito.android.hotel_booking.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_booking.di.C30782c;
import javax.inject.Provider;

/* compiled from: HotelBookingSelectRadioModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class L implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final H f163347a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f163348b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f163349c;

    public L(H h12, Provider provider, dagger.internal.l lVar) {
        this.f163347a = h12;
        this.f163348b = provider;
        this.f163349c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C30782c.C4787c.b) this.f163348b).get();
        C28478k c28478k = (C28478k) this.f163349c.f393949a;
        this.f163347a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
