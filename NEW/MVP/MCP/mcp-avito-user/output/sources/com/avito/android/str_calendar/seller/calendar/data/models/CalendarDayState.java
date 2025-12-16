package com.avito.android.str_calendar.seller.calendar.data.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarDayState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/data/models/CalendarDayState;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarDayState {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CalendarDayState[] f287543b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f287544c;

    static {
        CalendarDayState[] calendarDayStateArr = {new CalendarDayState("NORMAL", 0), new CalendarDayState("SELECTED", 1), new CalendarDayState("UNAVAILABLE", 2), new CalendarDayState("BOOKED", 3)};
        f287543b = calendarDayStateArr;
        f287544c = c.a(calendarDayStateArr);
    }

    public CalendarDayState() {
        throw null;
    }

    public static CalendarDayState valueOf(String str) {
        return (CalendarDayState) Enum.valueOf(CalendarDayState.class, str);
    }

    public static CalendarDayState[] values() {
        return (CalendarDayState[]) f287543b.clone();
    }
}
