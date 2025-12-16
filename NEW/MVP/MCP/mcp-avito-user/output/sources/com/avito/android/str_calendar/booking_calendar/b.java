package com.avito.android.str_calendar.booking_calendar;

import android.content.Context;
import android.content.Intent;
import com.avito.android.str_calendar.common.models.CalendarConstraintsPicker;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.util.C35755b0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingCalendarActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-calendar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {
    @Y61.k
    @InterfaceC42830m
    public static final Intent a(@Y61.k Context context, @Y61.k SelectedDateRange selectedDateRange, @Y61.l CalendarConstraintsPicker calendarConstraintsPicker, @Y61.l String str) {
        Intent intent = new Intent(context, (Class<?>) StrBookingCalendarActivity.class);
        intent.putExtra("date_range", selectedDateRange);
        intent.putExtra("calendar_constrains", calendarConstraintsPicker);
        intent.putExtra("calendar_title", str);
        intent.putExtra("calendar_request_id", (String) null);
        intent.putExtra("calendar_button_title", (String) null);
        intent.putParcelableArrayListExtra("calendar_locat_restrictions", C35755b0.a(null));
        return intent;
    }
}
