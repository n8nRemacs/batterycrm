package com.avito.android.publish.screen.objects.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.screen.objects.di.C33986a;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class w implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final C34019j f239945a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f239946b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f239947c;

    public w(C34019j c34019j, Provider provider, dagger.internal.l lVar) {
        this.f239945a = c34019j;
        this.f239946b = provider;
        this.f239947c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C33986a.c.V) this.f239946b).get();
        C28478k c28478k = (C28478k) this.f239947c.f393949a;
        this.f239945a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
