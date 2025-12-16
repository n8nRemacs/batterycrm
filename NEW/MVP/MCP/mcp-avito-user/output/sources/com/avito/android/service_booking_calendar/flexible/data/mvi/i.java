package com.avito.android.service_booking_calendar.flexible.data.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.CalendarDataInternalAction;
import ht0.InterfaceC40985b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CalendarDataOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "Lht0/b;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements t<CalendarDataInternalAction, InterfaceC40985b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40985b b(CalendarDataInternalAction calendarDataInternalAction) {
        CalendarDataInternalAction calendarDataInternalAction2 = calendarDataInternalAction;
        if (calendarDataInternalAction2 instanceof CalendarDataInternalAction.d) {
            return new InterfaceC40985b.a(((CalendarDataInternalAction.d) calendarDataInternalAction2).f275717b);
        }
        return null;
    }
}
