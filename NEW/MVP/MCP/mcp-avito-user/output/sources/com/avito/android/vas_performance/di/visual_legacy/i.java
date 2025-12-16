package com.avito.android.vas_performance.di.visual_legacy;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.vas_performance.di.visual_legacy.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LegacyVisualVasAnalyticsModule_ProvidesScreenTrackerFactory$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f320179a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f320180b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f320181c;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f320179a = provider;
        this.f320180b = lVar;
        this.f320181c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.g) this.f320179a).get();
        Screen screen = (Screen) this.f320180b.f393949a;
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f320181c.f393949a;
        c cVar = c.f320171a;
        return interfaceC28481c.b(screen, rVar);
    }
}
