package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrBookingCalendarInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/p;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface p {
    @Y61.k
    InterfaceC43160i<StrBookingCalendarInternalAction> a(@Y61.l SelectedDateRange selectedDateRange, @Y61.l Date date, @Y61.l Date date2, boolean z12);

    @Y61.k
    InterfaceC43160i<StrBookingCalendarInternalAction> b(@Y61.k String str, @Y61.l SelectedDateRange selectedDateRange, @Y61.l Date date, @Y61.l Date date2);
}
