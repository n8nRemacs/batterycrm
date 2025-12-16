package com.avito.android.search.filter.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.Q;
import com.avito.android.analytics.screens.tracker.T;
import javax.inject.Provider;

/* compiled from: FiltersModule_ProvideStabilityTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f263283a;

    public r(Provider<InterfaceC28373a> provider) {
        this.f263283a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f263283a.get();
        o.f263272a.getClass();
        return new T(interfaceC28373a, "filters");
    }
}
