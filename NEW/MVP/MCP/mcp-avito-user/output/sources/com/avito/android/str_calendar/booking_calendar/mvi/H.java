package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.J0;
import javax.inject.Provider;

/* compiled from: StrBookingCalendarViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.booking_calendar.h> f286384a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<J0> f286385b;

    public H(Provider<com.avito.android.str_calendar.booking_calendar.h> provider, Provider<J0> provider2) {
        this.f286384a = provider;
        this.f286385b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G(this.f286384a.get(), this.f286385b.get());
    }
}
