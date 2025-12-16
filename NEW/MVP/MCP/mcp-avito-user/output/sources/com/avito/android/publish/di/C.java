package com.avito.android.publish.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import javax.inject.Provider;

/* compiled from: PublishModule_ProvideScreenInitTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class C implements dagger.internal.h<InterfaceC28501x> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235122a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.tracker.H> f235123b;

    public C(C33824o c33824o, Provider<com.avito.android.analytics.screens.tracker.H> provider) {
        this.f235122a = c33824o;
        this.f235123b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.tracker.H h12 = this.f235123b.get();
        this.f235122a.getClass();
        InterfaceC28501x interfaceC28501xC = h12.c(H.a.f90737a);
        dagger.internal.t.d(interfaceC28501xC);
        return interfaceC28501xC;
    }
}
