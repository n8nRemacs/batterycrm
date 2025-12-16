package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SleepingPlacesSelectorModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final f f244989a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f244990b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f244991c;

    public k(f fVar, Provider provider, dagger.internal.l lVar) {
        this.f244989a = fVar;
        this.f244990b = provider;
        this.f244991c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481cB = ((b.c.a) this.f244990b).f244980a.b();
        C28478k c28478k = (C28478k) this.f244991c.f393949a;
        this.f244989a.getClass();
        return interfaceC28481cB.a(c28478k);
    }
}
