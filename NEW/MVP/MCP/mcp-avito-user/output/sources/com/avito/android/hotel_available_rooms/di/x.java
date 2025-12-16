package com.avito.android.hotel_available_rooms.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_available_rooms.di.C30776c;
import javax.inject.Provider;

/* compiled from: HotelAvailableRoomsModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class x implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final s f162764a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f162765b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f162766c;

    public x(s sVar, Provider provider, dagger.internal.l lVar) {
        this.f162764a = sVar;
        this.f162765b = provider;
        this.f162766c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C30776c.C4756c.f) this.f162765b).get();
        C28478k c28478k = (C28478k) this.f162766c.f393949a;
        this.f162764a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
