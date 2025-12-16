package com.avito.android.service_booking_calendar.flexible;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarFlexibleViewModelImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.flexible.data.mvi.h f275631a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.flexible.header.mvi.j f275632b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.flexible.content.mvi.h f275633c;

    public c(com.avito.android.service_booking_calendar.flexible.data.mvi.h hVar, com.avito.android.service_booking_calendar.flexible.header.mvi.j jVar, com.avito.android.service_booking_calendar.flexible.content.mvi.h hVar2) {
        this.f275631a = hVar;
        this.f275632b = jVar;
        this.f275633c = hVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.service_booking_calendar.flexible.data.mvi.g) this.f275631a.get(), (com.avito.android.service_booking_calendar.flexible.header.mvi.i) this.f275632b.get(), (com.avito.android.service_booking_calendar.flexible.content.mvi.g) this.f275633c.get());
    }
}
