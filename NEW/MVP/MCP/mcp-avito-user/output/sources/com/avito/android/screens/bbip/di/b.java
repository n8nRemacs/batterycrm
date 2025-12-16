package com.avito.android.screens.bbip.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bbip_common.BbipPerfScreen;
import com.avito.android.screens.bbip.di.o;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BbipAnalyticsModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f260215a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f260216b;

    public b(dagger.internal.l lVar, Provider provider) {
        this.f260215a = provider;
        this.f260216b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((o.b.f) this.f260215a).get();
        r rVar = (r) this.f260216b.f393949a;
        a.f260214a.getClass();
        return interfaceC28481c.a(new C28478k(BbipPerfScreen.f99057d, rVar, null, 4, null));
    }
}
