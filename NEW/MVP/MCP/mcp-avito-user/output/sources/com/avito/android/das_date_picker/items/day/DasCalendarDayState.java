package com.avito.android.das_date_picker.items.day;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DasCalendarDayState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/items/day/DasCalendarDayState;", "", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DasCalendarDayState {

    /* renamed from: b, reason: collision with root package name */
    public static final DasCalendarDayState f132310b;

    /* renamed from: c, reason: collision with root package name */
    public static final DasCalendarDayState f132311c;

    /* renamed from: d, reason: collision with root package name */
    public static final DasCalendarDayState f132312d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DasCalendarDayState[] f132313e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f132314f;

    static {
        DasCalendarDayState dasCalendarDayState = new DasCalendarDayState("NONE", 0);
        f132310b = dasCalendarDayState;
        DasCalendarDayState dasCalendarDayState2 = new DasCalendarDayState("UNAVAILABLE", 1);
        f132311c = dasCalendarDayState2;
        DasCalendarDayState dasCalendarDayState3 = new DasCalendarDayState("SELECTED", 2);
        f132312d = dasCalendarDayState3;
        DasCalendarDayState[] dasCalendarDayStateArr = {dasCalendarDayState, dasCalendarDayState2, dasCalendarDayState3};
        f132313e = dasCalendarDayStateArr;
        f132314f = kotlin.enums.c.a(dasCalendarDayStateArr);
    }

    public DasCalendarDayState() {
        throw null;
    }

    public static DasCalendarDayState valueOf(String str) {
        return (DasCalendarDayState) Enum.valueOf(DasCalendarDayState.class, str);
    }

    public static DasCalendarDayState[] values() {
        return (DasCalendarDayState[]) f132313e.clone();
    }
}
