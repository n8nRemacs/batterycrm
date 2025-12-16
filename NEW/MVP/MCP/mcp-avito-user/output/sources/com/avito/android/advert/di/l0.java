package com.avito.android.advert.di;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideStabilityTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class l0 implements dagger.internal.h<com.avito.android.analytics.screens.tracker.Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f69414a;

    public l0(Provider<InterfaceC28373a> provider) {
        this.f69414a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f69414a.get();
        C27710t.f69463a.getClass();
        return new com.avito.android.analytics.screens.tracker.T(interfaceC28373a, "advert");
    }
}
