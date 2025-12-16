package com.avito.android.service_booking_calendar.link;

import com.avito.android.remote.model.category_parameters.SelectionType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServiceBookingCalendarMonthLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/link/CalendarMonthType;", "", "(Ljava/lang/String;I)V", "FLEXIBLE", "MONTH", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CalendarMonthType {

    @com.google.gson.annotations.c("flexible")
    public static final CalendarMonthType FLEXIBLE;

    @com.google.gson.annotations.c(SelectionType.TYPE_MONTH)
    public static final CalendarMonthType MONTH;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CalendarMonthType[] f276123b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f276124c;

    static {
        CalendarMonthType calendarMonthType = new CalendarMonthType("FLEXIBLE", 0);
        FLEXIBLE = calendarMonthType;
        CalendarMonthType calendarMonthType2 = new CalendarMonthType("MONTH", 1);
        MONTH = calendarMonthType2;
        CalendarMonthType[] calendarMonthTypeArr = {calendarMonthType, calendarMonthType2};
        f276123b = calendarMonthTypeArr;
        f276124c = kotlin.enums.c.a(calendarMonthTypeArr);
    }

    private CalendarMonthType(String str, int i12) {
    }

    public static CalendarMonthType valueOf(String str) {
        return (CalendarMonthType) Enum.valueOf(CalendarMonthType.class, str);
    }

    public static CalendarMonthType[] values() {
        return (CalendarMonthType[]) f276123b.clone();
    }
}
