package com.avito.android.service_booking_calendar.flexible.content;

import Y61.k;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import gt0.InterfaceC40733a;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: HeaderStateToContentActionAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/content/i;", "Lcom/avito/android/service_booking_calendar/flexible/content/h;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h {
    @Inject
    public i() {
    }

    @Override // com.avito.android.service_booking_calendar.flexible.content.h
    @k
    public final List<InterfaceC40733a.d> a(@k CalendarHeaderState calendarHeaderState) {
        DayItem dayItem = calendarHeaderState.f276014k;
        return dayItem != null ? Collections.singletonList(new InterfaceC40733a.d(dayItem)) : C42784z0.f406748b;
    }
}
