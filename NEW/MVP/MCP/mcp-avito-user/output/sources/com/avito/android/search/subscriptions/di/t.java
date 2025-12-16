package com.avito.android.search.subscriptions.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSubscriptionsTrackerModule_ProvideScreenInitTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<InterfaceC28501x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f263952a;

    public t(Provider<H> provider) {
        this.f263952a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f263952a.get();
        q qVar = q.f263949a;
        InterfaceC28501x interfaceC28501xC = h12.c(H.a.f90737a);
        dagger.internal.t.d(interfaceC28501xC);
        return interfaceC28501xC;
    }
}
