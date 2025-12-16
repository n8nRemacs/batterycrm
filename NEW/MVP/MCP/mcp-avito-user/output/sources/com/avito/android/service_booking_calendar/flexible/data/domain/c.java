package com.avito.android.service_booking_calendar.flexible.data.domain;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FlexibleCalendarAnalyticsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f275682a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f275682a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f275682a.get());
    }
}
