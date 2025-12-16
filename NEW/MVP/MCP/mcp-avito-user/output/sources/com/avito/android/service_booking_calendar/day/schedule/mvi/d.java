package com.avito.android.service_booking_calendar.day.schedule.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_calendar.analytics.FromPage;
import com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DayScheduleAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/d;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/c;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f275391a;

    @Inject
    public d(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f275391a = interfaceC28373a;
    }

    @Override // com.avito.android.service_booking_calendar.day.schedule.mvi.c
    public final void a(@Y61.k DayScheduleInternalAction dayScheduleInternalAction) {
        boolean z12 = dayScheduleInternalAction instanceof DayScheduleInternalAction.ScheduleLoaded;
        InterfaceC28373a interfaceC28373a = this.f275391a;
        if (z12) {
            FromPage[] fromPageArr = FromPage.f275243b;
            interfaceC28373a.c(new Xs0.d());
        } else if (dayScheduleInternalAction instanceof DayScheduleInternalAction.ScheduleLoadingError) {
            FromPage[] fromPageArr2 = FromPage.f275243b;
            interfaceC28373a.c(new Xs0.c());
        }
    }
}
