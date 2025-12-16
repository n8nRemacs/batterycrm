package com.avito.android.service_booking_calendar.view.day.redesign;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalendarCellRedesignBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.view.day.e> f276210a;

    public b(Provider<com.avito.android.service_booking_calendar.view.day.e> provider) {
        this.f276210a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f276210a.get());
    }
}
