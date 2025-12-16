package com.avito.android.service_booking_calendar.flexible.data.mvi;

import com.avito.android.R;
import com.avito.android.analytics.screens.J;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.CalendarDataInternalAction;
import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import fu0.C40481b;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarDataReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements u<CalendarDataInternalAction, com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_calendar.flexible.data.domain.a f275742b;

    @Inject
    public k(@Y61.k com.avito.android.service_booking_calendar.flexible.data.domain.a aVar) {
        this.f275742b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a a(CalendarDataInternalAction calendarDataInternalAction, com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a aVar) {
        com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a aVarA;
        CalendarDataInternalAction calendarDataInternalAction2 = calendarDataInternalAction;
        com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a aVar2 = aVar;
        if (calendarDataInternalAction2 instanceof CalendarDataInternalAction.c) {
            aVarA = com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a.a(aVar2, ((CalendarDataInternalAction.c) calendarDataInternalAction2).f275716b, false, null, null, 8);
        } else if (calendarDataInternalAction2 instanceof CalendarDataInternalAction.Loading) {
            aVarA = com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a.a(aVar2, null, true, null, null, 9);
        } else if (calendarDataInternalAction2 instanceof CalendarDataInternalAction.b) {
            ApiError apiError = ((CalendarDataInternalAction.b) calendarDataInternalAction2).f275715b;
            aVarA = com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a.a(aVar2, null, false, new a.c(new J.a(apiError), com.avito.android.printable_text.b.f(z.k(apiError))), null, 9);
        } else if (calendarDataInternalAction2 instanceof CalendarDataInternalAction.a) {
            aVarA = com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a.a(aVar2, null, false, new a.c(new J.a(((CalendarDataInternalAction.a) calendarDataInternalAction2).f275714b), com.avito.android.printable_text.b.c(R.string.sb_calendar_default_error, new Serializable[0])), null, 9);
        } else {
            boolean z12 = calendarDataInternalAction2 instanceof CalendarDataInternalAction.e;
            BookingSettingsStatus bookingSettingsStatus = aVar2.f275726d;
            if (z12) {
                BookingSettingsStatus bookingSettingsStatus2 = ((CalendarDataInternalAction.e) calendarDataInternalAction2).f275718b;
                aVarA = com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a.a(aVar2, null, false, null, bookingSettingsStatus2 != null ? C40481b.a(bookingSettingsStatus2, bookingSettingsStatus) : bookingSettingsStatus, 7);
            } else {
                aVarA = calendarDataInternalAction2 instanceof CalendarDataInternalAction.f ? com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a.a(aVar2, null, false, null, C40481b.a(bookingSettingsStatus, BookingSettingsStatus.f278277c), 7) : com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a.a(aVar2, null, false, null, null, 15);
            }
        }
        this.f275742b.a(calendarDataInternalAction2);
        return aVarA;
    }
}
