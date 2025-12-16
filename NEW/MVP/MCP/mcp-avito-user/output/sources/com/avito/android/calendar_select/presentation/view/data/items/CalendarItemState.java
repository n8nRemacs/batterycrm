package com.avito.android.calendar_select.presentation.view.data.items;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarItemState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/items/CalendarItemState;", "", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CalendarItemState {

    /* renamed from: b, reason: collision with root package name */
    public static final CalendarItemState f113461b;

    /* renamed from: c, reason: collision with root package name */
    public static final CalendarItemState f113462c;

    /* renamed from: d, reason: collision with root package name */
    public static final CalendarItemState f113463d;

    /* renamed from: e, reason: collision with root package name */
    public static final CalendarItemState f113464e;

    /* renamed from: f, reason: collision with root package name */
    public static final CalendarItemState f113465f;

    /* renamed from: g, reason: collision with root package name */
    public static final CalendarItemState f113466g;

    /* renamed from: h, reason: collision with root package name */
    public static final CalendarItemState f113467h;

    /* renamed from: i, reason: collision with root package name */
    public static final CalendarItemState f113468i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ CalendarItemState[] f113469j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a f113470k;

    static {
        CalendarItemState calendarItemState = new CalendarItemState("NORMAL", 0);
        f113461b = calendarItemState;
        CalendarItemState calendarItemState2 = new CalendarItemState("CURRENT", 1);
        f113462c = calendarItemState2;
        CalendarItemState calendarItemState3 = new CalendarItemState("CURRENT_UNAVAILABLE", 2);
        f113463d = calendarItemState3;
        CalendarItemState calendarItemState4 = new CalendarItemState("SELECTED_SINGLE", 3);
        f113464e = calendarItemState4;
        CalendarItemState calendarItemState5 = new CalendarItemState("SELECTED_START", 4);
        f113465f = calendarItemState5;
        CalendarItemState calendarItemState6 = new CalendarItemState("SELECTED_END", 5);
        f113466g = calendarItemState6;
        CalendarItemState calendarItemState7 = new CalendarItemState("SELECTED", 6);
        f113467h = calendarItemState7;
        CalendarItemState calendarItemState8 = new CalendarItemState("UNAVAILABLE", 7);
        f113468i = calendarItemState8;
        CalendarItemState[] calendarItemStateArr = {calendarItemState, calendarItemState2, calendarItemState3, calendarItemState4, calendarItemState5, calendarItemState6, calendarItemState7, calendarItemState8};
        f113469j = calendarItemStateArr;
        f113470k = c.a(calendarItemStateArr);
    }

    public CalendarItemState() {
        throw null;
    }

    public static CalendarItemState valueOf(String str) {
        return (CalendarItemState) Enum.valueOf(CalendarItemState.class, str);
    }

    public static CalendarItemState[] values() {
        return (CalendarItemState[]) f113469j.clone();
    }
}
