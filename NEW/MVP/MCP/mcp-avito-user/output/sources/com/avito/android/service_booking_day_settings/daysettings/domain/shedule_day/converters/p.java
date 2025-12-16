package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SaveScheduleInfoConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f276815a;

    public p(dagger.internal.u uVar) {
        this.f276815a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.service_booking.data.preferences.a) this.f276815a.get());
    }
}
