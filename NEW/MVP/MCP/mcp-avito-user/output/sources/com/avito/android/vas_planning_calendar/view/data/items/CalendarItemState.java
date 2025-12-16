package com.avito.android.vas_planning_calendar.view.data.items;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarItemState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/view/data/items/CalendarItemState;", "", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CalendarItemState {

    /* renamed from: b, reason: collision with root package name */
    public static final CalendarItemState f322685b;

    /* renamed from: c, reason: collision with root package name */
    public static final CalendarItemState f322686c;

    /* renamed from: d, reason: collision with root package name */
    public static final CalendarItemState f322687d;

    /* renamed from: e, reason: collision with root package name */
    public static final CalendarItemState f322688e;

    /* renamed from: f, reason: collision with root package name */
    public static final CalendarItemState f322689f;

    /* renamed from: g, reason: collision with root package name */
    public static final CalendarItemState f322690g;

    /* renamed from: h, reason: collision with root package name */
    public static final CalendarItemState f322691h;

    /* renamed from: i, reason: collision with root package name */
    public static final CalendarItemState f322692i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ CalendarItemState[] f322693j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a f322694k;

    static {
        CalendarItemState calendarItemState = new CalendarItemState("NORMAL", 0);
        f322685b = calendarItemState;
        CalendarItemState calendarItemState2 = new CalendarItemState("CURRENT", 1);
        f322686c = calendarItemState2;
        CalendarItemState calendarItemState3 = new CalendarItemState("SELECTED_SINGLE", 2);
        f322687d = calendarItemState3;
        CalendarItemState calendarItemState4 = new CalendarItemState("SELECTED_LEFT", 3);
        f322688e = calendarItemState4;
        CalendarItemState calendarItemState5 = new CalendarItemState("SELECTED_RIGHT", 4);
        f322689f = calendarItemState5;
        CalendarItemState calendarItemState6 = new CalendarItemState("SELECTED", 5);
        f322690g = calendarItemState6;
        CalendarItemState calendarItemState7 = new CalendarItemState("CROSSED", 6);
        f322691h = calendarItemState7;
        CalendarItemState calendarItemState8 = new CalendarItemState("CURRENT_CROSSED", 7);
        CalendarItemState calendarItemState9 = new CalendarItemState("UNAVAILABLE", 8);
        f322692i = calendarItemState9;
        CalendarItemState[] calendarItemStateArr = {calendarItemState, calendarItemState2, calendarItemState3, calendarItemState4, calendarItemState5, calendarItemState6, calendarItemState7, calendarItemState8, calendarItemState9, new CalendarItemState("UNAVAILABLE_SELLER", 9), new CalendarItemState("BOOKED_SELLER", 10)};
        f322693j = calendarItemStateArr;
        f322694k = c.a(calendarItemStateArr);
    }

    public CalendarItemState() {
        throw null;
    }

    public static CalendarItemState valueOf(String str) {
        return (CalendarItemState) Enum.valueOf(CalendarItemState.class, str);
    }

    public static CalendarItemState[] values() {
        return (CalendarItemState[]) f322693j.clone();
    }
}
