package com.avito.android.vas_performance.di.stickers;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.VasStickersDescriptionScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.vas_performance.di.stickers.d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StickersBuyVasModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f320121a;

    public i(Provider<InterfaceC28481c> provider) {
        this.f320121a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((d.c.b) this.f320121a).get();
        int i12 = h.f320120a;
        VasStickersDescriptionScreen vasStickersDescriptionScreen = VasStickersDescriptionScreen.f90553d;
        com.avito.android.analytics.screens.r.f90693e.getClass();
        return interfaceC28481c.a(new C28478k(vasStickersDescriptionScreen, r.a.a(), "vasStickersDescription"));
    }
}
