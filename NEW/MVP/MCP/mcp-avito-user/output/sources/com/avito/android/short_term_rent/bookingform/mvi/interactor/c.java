package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f281889a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f281890b;

    public c(Provider<InterfaceC28373a> provider, Provider<com.avito.android.analytics.provider.a> provider2) {
        this.f281889a = provider;
        this.f281890b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f281889a.get(), this.f281890b.get());
    }
}
