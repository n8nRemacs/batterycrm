package com.avito.android.str_calendar.booking_calendar.items.day;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StrBookingCalendarDayState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/items/day/StrBookingCalendarDayState;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrBookingCalendarDayState {

    /* renamed from: b, reason: collision with root package name */
    public static final StrBookingCalendarDayState f286292b;

    /* renamed from: c, reason: collision with root package name */
    public static final StrBookingCalendarDayState f286293c;

    /* renamed from: d, reason: collision with root package name */
    public static final StrBookingCalendarDayState f286294d;

    /* renamed from: e, reason: collision with root package name */
    public static final StrBookingCalendarDayState f286295e;

    /* renamed from: f, reason: collision with root package name */
    public static final StrBookingCalendarDayState f286296f;

    /* renamed from: g, reason: collision with root package name */
    public static final StrBookingCalendarDayState f286297g;

    /* renamed from: h, reason: collision with root package name */
    public static final StrBookingCalendarDayState f286298h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ StrBookingCalendarDayState[] f286299i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f286300j;

    static {
        StrBookingCalendarDayState strBookingCalendarDayState = new StrBookingCalendarDayState("NONE", 0);
        f286292b = strBookingCalendarDayState;
        StrBookingCalendarDayState strBookingCalendarDayState2 = new StrBookingCalendarDayState("UNAVAILABLE", 1);
        f286293c = strBookingCalendarDayState2;
        StrBookingCalendarDayState strBookingCalendarDayState3 = new StrBookingCalendarDayState("DOTED", 2);
        f286294d = strBookingCalendarDayState3;
        StrBookingCalendarDayState strBookingCalendarDayState4 = new StrBookingCalendarDayState("SELECTED_SINGLE", 3);
        f286295e = strBookingCalendarDayState4;
        StrBookingCalendarDayState strBookingCalendarDayState5 = new StrBookingCalendarDayState("SELECTED_START", 4);
        f286296f = strBookingCalendarDayState5;
        StrBookingCalendarDayState strBookingCalendarDayState6 = new StrBookingCalendarDayState("SELECTED_MIDDLE", 5);
        f286297g = strBookingCalendarDayState6;
        StrBookingCalendarDayState strBookingCalendarDayState7 = new StrBookingCalendarDayState("SELECTED_END", 6);
        f286298h = strBookingCalendarDayState7;
        StrBookingCalendarDayState[] strBookingCalendarDayStateArr = {strBookingCalendarDayState, strBookingCalendarDayState2, strBookingCalendarDayState3, strBookingCalendarDayState4, strBookingCalendarDayState5, strBookingCalendarDayState6, strBookingCalendarDayState7};
        f286299i = strBookingCalendarDayStateArr;
        f286300j = kotlin.enums.c.a(strBookingCalendarDayStateArr);
    }

    public StrBookingCalendarDayState() {
        throw null;
    }

    public static StrBookingCalendarDayState valueOf(String str) {
        return (StrBookingCalendarDayState) Enum.valueOf(StrBookingCalendarDayState.class, str);
    }

    public static StrBookingCalendarDayState[] values() {
        return (StrBookingCalendarDayState[]) f286299i.clone();
    }
}
