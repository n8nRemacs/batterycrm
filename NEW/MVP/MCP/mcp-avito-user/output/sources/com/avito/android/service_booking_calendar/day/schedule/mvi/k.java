package com.avito.android.service_booking_calendar.day.schedule.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction;
import com.avito.android.service_booking_utils.events.ScreenFailedToOpenEvent;
import com.avito.android.service_booking_utils.events.ScreenOpenedEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import org.threeten.bp.q;

/* compiled from: DayScheduleAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/k;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/c;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f275414a;

    /* renamed from: b, reason: collision with root package name */
    public final org.threeten.bp.f f275415b;

    @Inject
    public k(@Y61.k InterfaceC28373a interfaceC28373a, @com.avito.android.service_booking_calendar.day.schedule.di.j @Y61.k String str) {
        this.f275414a = interfaceC28373a;
        this.f275415b = org.threeten.bp.f.H(Long.parseLong(str), 0, q.f422106g);
    }

    @Override // com.avito.android.service_booking_calendar.day.schedule.mvi.c
    public final void a(@Y61.k DayScheduleInternalAction dayScheduleInternalAction) {
        boolean z12 = dayScheduleInternalAction instanceof DayScheduleInternalAction.ScheduleLoaded;
        org.threeten.bp.f fVar = this.f275415b;
        InterfaceC28373a interfaceC28373a = this.f275414a;
        if (z12) {
            interfaceC28373a.c(new ScreenOpenedEvent(ScreenOpenedEvent.Screen.f278363h, fVar));
        } else if (dayScheduleInternalAction instanceof DayScheduleInternalAction.ScheduleLoadingError) {
            interfaceC28373a.c(new ScreenFailedToOpenEvent(ScreenFailedToOpenEvent.Screen.f278350g, fVar));
        }
    }
}
