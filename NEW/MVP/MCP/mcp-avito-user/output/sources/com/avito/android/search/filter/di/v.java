package com.avito.android.search.filter.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;

/* compiled from: FiltersTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f263287a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f263288b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f263289c;

    public v(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar) {
        this.f263287a = uVar;
        this.f263288b = lVar;
        this.f263289c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) this.f263287a.get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f263288b.f393949a;
        Screen screen = (Screen) this.f263289c.f393949a;
        int i12 = u.f263286a;
        return interfaceC28481c.a(new C28478k(screen, rVar, null, 4, null));
    }
}
