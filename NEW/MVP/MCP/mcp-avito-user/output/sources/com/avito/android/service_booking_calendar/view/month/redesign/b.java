package com.avito.android.service_booking_calendar.view.month.redesign;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MonthRedesignBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.view.month.e> f276226a;

    public b(Provider<com.avito.android.service_booking_calendar.view.month.e> provider) {
        this.f276226a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f276226a.get());
    }
}
