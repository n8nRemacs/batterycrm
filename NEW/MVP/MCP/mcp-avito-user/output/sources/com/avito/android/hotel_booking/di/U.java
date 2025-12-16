package com.avito.android.hotel_booking.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_booking.di.C30783d;
import javax.inject.Provider;

/* compiled from: SelectSingleValueModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class U implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final P f163352a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f163353b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f163354c;

    public U(P p12, Provider provider, dagger.internal.l lVar) {
        this.f163352a = p12;
        this.f163353b = provider;
        this.f163354c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C30783d.c.b) this.f163353b).get();
        C28478k c28478k = (C28478k) this.f163354c.f393949a;
        this.f163352a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
