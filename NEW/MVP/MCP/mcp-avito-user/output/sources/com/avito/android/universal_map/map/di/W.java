package com.avito.android.universal_map.map.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.universal_map.UniversalMapParams;

/* compiled from: UniversalMapTrackerModule_ProvideUniversalMapScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class W implements dagger.internal.h<com.avito.android.universal_map.map.tracker.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f305042a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f305043b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f305044c;

    public W(dagger.internal.l lVar, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f305042a = uVar;
        this.f305043b = uVar2;
        this.f305044c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) this.f305042a.get();
        C28478k c28478k = (C28478k) this.f305043b.get();
        UniversalMapParams.TrackerSettings trackerSettings = (UniversalMapParams.TrackerSettings) this.f305044c.f393949a;
        int i12 = S.f305037a;
        return new com.avito.android.universal_map.map.tracker.c(interfaceC28481c.a(c28478k), trackerSettings);
    }
}
