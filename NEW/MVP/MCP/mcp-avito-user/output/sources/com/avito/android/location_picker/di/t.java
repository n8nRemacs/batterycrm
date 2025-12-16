package com.avito.android.location_picker.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.LocationPickerScreen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.location_picker.di.c;
import javax.inject.Provider;

/* compiled from: LocationPickerTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class t implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f182337a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f182338b;

    public t(dagger.internal.l lVar, Provider provider) {
        this.f182337a = provider;
        this.f182338b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((c.C5349c.l) this.f182337a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f182338b.f393949a;
        r.f182336a.getClass();
        return interfaceC28481c.a(new C28478k(LocationPickerScreen.f90395d, rVar, null, 4, null));
    }
}
