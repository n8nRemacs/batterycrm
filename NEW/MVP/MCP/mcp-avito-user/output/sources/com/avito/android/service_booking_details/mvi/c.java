package com.avito.android.service_booking_details.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingDetailsAnalyticsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f277361a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f277362b;

    public c(dagger.internal.l lVar, Provider provider) {
        this.f277361a = provider;
        this.f277362b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f277361a.get(), (String) this.f277362b.f393949a);
    }
}
