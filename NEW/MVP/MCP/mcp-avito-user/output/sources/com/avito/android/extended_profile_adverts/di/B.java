package com.avito.android.extended_profile_adverts.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import javax.inject.Provider;

/* compiled from: PublicProfileAdvertsTrackerModule_ProvidesScreenInitTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class B implements dagger.internal.h<InterfaceC28501x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f150596a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f150597b;

    public B(dagger.internal.l lVar, Provider provider) {
        this.f150596a = provider;
        this.f150597b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f150596a.get();
        boolean zBooleanValue = ((Boolean) this.f150597b.f393949a).booleanValue();
        y.f150835a.getClass();
        InterfaceC28501x interfaceC28501xC = zBooleanValue ? h12.c(y.f150836b) : h12.c(H.a.f90737a);
        dagger.internal.t.d(interfaceC28501xC);
        return interfaceC28501xC;
    }
}
