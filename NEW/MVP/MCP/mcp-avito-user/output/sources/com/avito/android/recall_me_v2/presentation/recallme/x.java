package com.avito.android.recall_me_v2.presentation.recallme;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.recall_me_v2.presentation.recallme.a;
import javax.inject.Provider;

/* compiled from: RecallMeScreenPerformanceTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f252228a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f252229b;

    public x(dagger.internal.l lVar, Provider provider) {
        this.f252228a = provider;
        this.f252229b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.e) this.f252228a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f252229b.f393949a;
        int i12 = w.f252227a;
        return interfaceC28481c.a(new C28478k(RecallMePerfScreen.f252089d, rVar, null, 4, null));
    }
}
