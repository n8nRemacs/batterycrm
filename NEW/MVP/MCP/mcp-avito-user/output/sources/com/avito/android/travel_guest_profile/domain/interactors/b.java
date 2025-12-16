package com.avito.android.travel_guest_profile.domain.interactors;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelGuestProfileAnalyticsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f301969a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f301970b;

    public b(Provider<InterfaceC28373a> provider, Provider<com.avito.android.analytics.provider.a> provider2) {
        this.f301969a = provider;
        this.f301970b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f301969a.get(), this.f301970b.get());
    }
}
