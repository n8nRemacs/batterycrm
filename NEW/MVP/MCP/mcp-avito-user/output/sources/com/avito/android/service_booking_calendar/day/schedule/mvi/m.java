package com.avito.android.service_booking_calendar.day.schedule.mvi;

import bt0.InterfaceC25710b;
import com.avito.android.arch.mvi.t;
import com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DayScheduleOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lbt0/b;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements t<DayScheduleInternalAction, InterfaceC25710b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC25710b b(DayScheduleInternalAction dayScheduleInternalAction) {
        DayScheduleInternalAction dayScheduleInternalAction2 = dayScheduleInternalAction;
        if (dayScheduleInternalAction2 instanceof DayScheduleInternalAction.ScrollByOffset) {
            return new InterfaceC25710b.a(((DayScheduleInternalAction.ScrollByOffset) dayScheduleInternalAction2).f275397b);
        }
        if (!(dayScheduleInternalAction2 instanceof DayScheduleInternalAction.ScrollToTime)) {
            return null;
        }
        DayScheduleInternalAction.ScrollToTime scrollToTime = (DayScheduleInternalAction.ScrollToTime) dayScheduleInternalAction2;
        return new InterfaceC25710b.C2022b(scrollToTime.f275398b, scrollToTime.f275399c);
    }
}
