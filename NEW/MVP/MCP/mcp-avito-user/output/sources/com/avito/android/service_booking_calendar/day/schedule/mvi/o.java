package com.avito.android.service_booking_calendar.day.schedule.mvi;

import bt0.C25711c;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DayScheduleReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lbt0/c;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements u<DayScheduleInternalAction, C25711c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f275419b;

    @Inject
    public o(@Y61.k c cVar) {
        this.f275419b = cVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C25711c a(DayScheduleInternalAction dayScheduleInternalAction, C25711c c25711c) {
        DayScheduleInternalAction dayScheduleInternalAction2 = dayScheduleInternalAction;
        C25711c c25711c2 = c25711c;
        this.f275419b.a(dayScheduleInternalAction2);
        if (dayScheduleInternalAction2 instanceof DayScheduleInternalAction.ScheduleLoading) {
            C25711c.f57523f.getClass();
            return C25711c.f57524g;
        }
        if (!(dayScheduleInternalAction2 instanceof DayScheduleInternalAction.ScheduleLoaded)) {
            return dayScheduleInternalAction2 instanceof DayScheduleInternalAction.ScheduleLoadingError ? C25711c.a(c25711c2, z.l(((DayScheduleInternalAction.ScheduleLoadingError) dayScheduleInternalAction2).f275395b), 12) : C25711c.a(c25711c2, null, 15);
        }
        DayScheduleInternalAction.ScheduleLoaded scheduleLoaded = (DayScheduleInternalAction.ScheduleLoaded) dayScheduleInternalAction2;
        return new C25711c(false, null, scheduleLoaded.f275393b, scheduleLoaded.f275394c);
    }
}
