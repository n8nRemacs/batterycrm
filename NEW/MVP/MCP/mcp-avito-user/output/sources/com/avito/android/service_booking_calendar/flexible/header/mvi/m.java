package com.avito.android.service_booking_calendar.flexible.header.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import it0.C42107b;
import it0.InterfaceC42106a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Settings;

/* compiled from: CalendarHeaderReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements u<CalendarHeaderInternalAction, CalendarHeaderState> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final CalendarHeaderState a(CalendarHeaderInternalAction calendarHeaderInternalAction, CalendarHeaderState calendarHeaderState) {
        C42107b c42107b;
        CalendarHeaderInternalAction calendarHeaderInternalAction2 = calendarHeaderInternalAction;
        CalendarHeaderState calendarHeaderState2 = calendarHeaderState;
        if (calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.ShowHeader) {
            CalendarHeaderInternalAction.ShowHeader showHeader = (CalendarHeaderInternalAction.ShowHeader) calendarHeaderInternalAction2;
            return CalendarHeaderState.a(calendarHeaderState2, showHeader.f275989b, null, true, false, null, showHeader.f275990c, Integer.valueOf(showHeader.f275991d), Integer.valueOf(showHeader.f275992e), showHeader.f275994g, showHeader.f275993f, showHeader.f275995h, showHeader.f275996i, showHeader.f275997j, false, 32837);
        }
        if (calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.HideHeader) {
            return CalendarHeaderState.a(calendarHeaderState2, null, null, false, false, null, null, null, null, null, 0, null, 0, null, false, 131063);
        }
        if (calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.ShowLoading) {
            return CalendarHeaderState.a(calendarHeaderState2, null, null, false, true, null, null, null, null, null, 0, null, 0, null, false, 131023);
        }
        if (calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.ShowErrorWithMessage) {
            ((CalendarHeaderInternalAction.ShowErrorWithMessage) calendarHeaderInternalAction2).getClass();
            return CalendarHeaderState.a(calendarHeaderState2, null, null, false, false, null, null, null, null, null, 0, null, 0, null, false, 131023);
        }
        if (calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.SwitchMode) {
            CalendarHeaderState.MODE mode = calendarHeaderState2.f276006c;
            mode.getClass();
            CalendarHeaderState.MODE mode2 = CalendarHeaderState.MODE.f276021b;
            return CalendarHeaderState.a(calendarHeaderState2, null, mode == mode2 ? CalendarHeaderState.MODE.f276022c : mode2, false, false, null, null, null, null, null, 0, null, 0, null, false, 131067);
        }
        if (calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.SetMode) {
            ((CalendarHeaderInternalAction.SetMode) calendarHeaderInternalAction2).getClass();
            return CalendarHeaderState.a(calendarHeaderState2, null, CalendarHeaderState.MODE.f276021b, false, false, null, null, null, null, null, 0, null, 0, null, false, 131067);
        }
        int i12 = 0;
        if (!(calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.SelectDay)) {
            boolean z12 = calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.UpdatedScheduleInfo;
            List<InterfaceC42106a> list = calendarHeaderState2.f276018o;
            if (z12) {
                ArrayList arrayList = new ArrayList(list);
                if (!calendarHeaderState2.f276019p && (c42107b = ((CalendarHeaderInternalAction.UpdatedScheduleInfo) calendarHeaderInternalAction2).f276002b.f275547f) != null) {
                    arrayList.add(0, c42107b);
                }
                com.avito.android.service_booking_calendar.domain.b bVar = ((CalendarHeaderInternalAction.UpdatedScheduleInfo) calendarHeaderInternalAction2).f276002b;
                return CalendarHeaderState.a(calendarHeaderState2, null, null, false, false, new CalendarHeaderState.b.a(bVar.f275542a, bVar.f275543b, bVar.f275544c, bVar.f275546e, bVar.f275545d, bVar.f275548g), null, null, null, null, 0, null, 0, arrayList, false, 81855);
            }
            if (calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.CloseTooltip) {
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.remove(((CalendarHeaderInternalAction.CloseTooltip) calendarHeaderInternalAction2).f275981b);
                return CalendarHeaderState.a(calendarHeaderState2, null, null, false, false, null, null, null, null, null, 0, null, 0, arrayList2, false, 114687);
            }
            if (calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.InvalidateHeader) {
                return CalendarHeaderState.a(calendarHeaderState2, null, null, false, false, null, null, null, null, null, 0, null, 0, null, true, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
            if (!(calendarHeaderInternalAction2 instanceof CalendarHeaderInternalAction.UpdateHeader)) {
                return calendarHeaderState2;
            }
            CalendarHeaderInternalAction.UpdateHeader updateHeader = (CalendarHeaderInternalAction.UpdateHeader) calendarHeaderInternalAction2;
            return CalendarHeaderState.a(calendarHeaderState2, updateHeader.f276000b, null, true, false, null, updateHeader.f276001c, null, null, null, 0, null, 0, null, false, 65397);
        }
        CalendarHeaderInternalAction.SelectDay selectDay = (CalendarHeaderInternalAction.SelectDay) calendarHeaderInternalAction2;
        FlexibleCalendarDayItem flexibleCalendarDayItem = selectDay.f275986b;
        if (!(flexibleCalendarDayItem instanceof DayItem)) {
            return calendarHeaderState2;
        }
        DayItem dayItem = (DayItem) flexibleCalendarDayItem;
        int iD2 = dayItem.f275353c.f421948b.E().d() - 1;
        List<WeekItem> list2 = calendarHeaderState2.f276011h;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i13 = selectDay.f275987c;
            if (!zHasNext) {
                return CalendarHeaderState.a(calendarHeaderState2, null, null, false, false, L.f(flexibleCalendarDayItem, calendarHeaderState2.f276014k) ? calendarHeaderState2.f276010g : CalendarHeaderState.b.C8188b.f276031a, arrayList3, Integer.valueOf(i13), Integer.valueOf(com.avito.android.service_booking_calendar.flexible.header.j.a(i13, iD2, arrayList3)), (DayItem) flexibleCalendarDayItem, selectDay.f275988d, null, 0, null, false, 127039);
            }
            Object next = it.next();
            int i14 = i12 + 1;
            Integer num = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            WeekItem weekItem = (WeekItem) next;
            Integer numValueOf = Integer.valueOf(iD2);
            if (i12 == i13) {
                num = numValueOf;
            }
            arrayList3.add(WeekItem.a(weekItem, num, dayItem.f275353c.f421948b.f421942c));
            i12 = i14;
        }
    }
}
