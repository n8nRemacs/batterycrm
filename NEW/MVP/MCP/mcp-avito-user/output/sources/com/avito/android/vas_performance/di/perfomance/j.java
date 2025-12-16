package com.avito.android.vas_performance.di.perfomance;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.vas_performance.di.perfomance.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PerformanceVasAnalyticsModuleNew_ProvidesScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f320040a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f320041b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f320042c;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f320040a = provider;
        this.f320041b = lVar;
        this.f320042c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.d) this.f320040a).get();
        Screen screen = (Screen) this.f320041b.f393949a;
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f320042c.f393949a;
        H.c cVar = f.f320036a;
        return interfaceC28481c.b(screen, rVar);
    }
}
