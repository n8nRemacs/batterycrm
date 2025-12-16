package com.avito.android.vas_performance.screens.stickers.buy.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.VasStickersDescriptionScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.vas_performance.screens.stickers.buy.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StickersBuyModule_ProvideScreenTrackerFactoryForDescriptionDialogFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f320657a;

    public p(Provider<InterfaceC28481c> provider) {
        this.f320657a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.b) this.f320657a).get();
        n.f320655a.getClass();
        VasStickersDescriptionScreen vasStickersDescriptionScreen = VasStickersDescriptionScreen.f90553d;
        r.f90693e.getClass();
        return interfaceC28481c.a(new C28478k(vasStickersDescriptionScreen, r.a.a(), "vasStickersDescription"));
    }
}
