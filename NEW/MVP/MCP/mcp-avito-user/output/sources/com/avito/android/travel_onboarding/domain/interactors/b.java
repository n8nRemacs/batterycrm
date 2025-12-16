package com.avito.android.travel_onboarding.domain.interactors;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelOnboardingAnalyticsInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f302254a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f302255b;

    public b(Provider<InterfaceC28373a> provider, Provider<com.avito.android.analytics.provider.a> provider2) {
        this.f302254a = provider;
        this.f302255b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f302254a.get(), this.f302255b.get());
    }
}
