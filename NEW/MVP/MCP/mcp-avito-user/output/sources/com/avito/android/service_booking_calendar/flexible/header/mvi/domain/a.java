package com.avito.android.service_booking_calendar.flexible.header.mvi.domain;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import it0.InterfaceC42106a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalendarHeaderInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/domain/a;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {
    @k
    InterfaceC43160i<CalendarHeaderInternalAction> a(int i12, @k CalendarHeaderState calendarHeaderState);

    @k
    InterfaceC43160i<CalendarHeaderInternalAction> b(@k FlexibleCalendarDayItem flexibleCalendarDayItem, @k CalendarHeaderState calendarHeaderState);

    @k
    InterfaceC43160i c(@k ArrayList arrayList, @k List list, @k DayItem dayItem, @l Integer num);

    @k
    InterfaceC43160i d(@k ArrayList arrayList, @k List list, @k List list2);

    @k
    InterfaceC43160i<CalendarHeaderInternalAction> e(@k InterfaceC42106a interfaceC42106a);

    @k
    InterfaceC43160i<CalendarHeaderInternalAction> f(int i12, @k CalendarHeaderState calendarHeaderState);
}
