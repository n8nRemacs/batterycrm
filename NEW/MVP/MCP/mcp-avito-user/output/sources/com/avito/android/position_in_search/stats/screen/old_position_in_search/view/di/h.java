package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchPositionTrackerModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f220845a;

    /* renamed from: b, reason: collision with root package name */
    public final g f220846b;

    public h(Provider provider, g gVar) {
        this.f220845a = provider;
        this.f220846b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C6667a) this.f220845a).get();
        C28478k c28478k = (C28478k) this.f220846b.get();
        f.f220843a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
