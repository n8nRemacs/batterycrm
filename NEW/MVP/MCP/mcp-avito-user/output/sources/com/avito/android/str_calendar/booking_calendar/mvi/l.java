package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: StrBookingCalendarDataBuilderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f286488a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C43624b> f286489b;

    public l(Provider<R0> provider, Provider<C43624b> provider2) {
        this.f286488a = provider;
        this.f286489b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f286488a.get(), this.f286489b.get());
    }
}
