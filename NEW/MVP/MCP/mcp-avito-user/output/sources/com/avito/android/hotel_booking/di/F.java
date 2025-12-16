package com.avito.android.hotel_booking.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_booking.di.C30781b;
import javax.inject.Provider;

/* compiled from: HotelBookingModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class F implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final E f163342a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f163343b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f163344c;

    public F(E e12, Provider provider, dagger.internal.l lVar) {
        this.f163342a = e12;
        this.f163343b = provider;
        this.f163344c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C30781b.c.g) this.f163343b).get();
        C28478k c28478k = (C28478k) this.f163344c.f393949a;
        this.f163342a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
