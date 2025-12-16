package com.avito.android.hotel_booking.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_booking.di.C30780a;
import javax.inject.Provider;

/* compiled from: EnterDataModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.hotel_booking.di.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30790k implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final C30786g f163448a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f163449b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f163450c;

    public C30790k(C30786g c30786g, Provider provider, dagger.internal.l lVar) {
        this.f163448a = c30786g;
        this.f163449b = provider;
        this.f163450c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C30780a.b.d) this.f163449b).get();
        C28478k c28478k = (C28478k) this.f163450c.f393949a;
        this.f163448a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
