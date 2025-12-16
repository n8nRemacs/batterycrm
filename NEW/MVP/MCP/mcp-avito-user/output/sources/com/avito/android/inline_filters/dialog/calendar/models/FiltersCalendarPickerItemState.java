package com.avito.android.inline_filters.dialog.calendar.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FiltersCalendarPickerItemState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/models/FiltersCalendarPickerItemState;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FiltersCalendarPickerItemState {

    /* renamed from: b, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171257b;

    /* renamed from: c, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171258c;

    /* renamed from: d, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171259d;

    /* renamed from: e, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171260e;

    /* renamed from: f, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171261f;

    /* renamed from: g, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171262g;

    /* renamed from: h, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171263h;

    /* renamed from: i, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171264i;

    /* renamed from: j, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171265j;

    /* renamed from: k, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171266k;

    /* renamed from: l, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171267l;

    /* renamed from: m, reason: collision with root package name */
    public static final FiltersCalendarPickerItemState f171268m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ FiltersCalendarPickerItemState[] f171269n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a f171270o;

    static {
        FiltersCalendarPickerItemState filtersCalendarPickerItemState = new FiltersCalendarPickerItemState("NORMAL", 0);
        f171257b = filtersCalendarPickerItemState;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState2 = new FiltersCalendarPickerItemState("CURRENT", 1);
        f171258c = filtersCalendarPickerItemState2;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState3 = new FiltersCalendarPickerItemState("SELECTED_SINGLE", 2);
        f171259d = filtersCalendarPickerItemState3;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState4 = new FiltersCalendarPickerItemState("SELECTED_LEFT", 3);
        f171260e = filtersCalendarPickerItemState4;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState5 = new FiltersCalendarPickerItemState("SELECTED_RIGHT", 4);
        f171261f = filtersCalendarPickerItemState5;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState6 = new FiltersCalendarPickerItemState("SELECTED", 5);
        f171262g = filtersCalendarPickerItemState6;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState7 = new FiltersCalendarPickerItemState("CROSSED", 6);
        f171263h = filtersCalendarPickerItemState7;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState8 = new FiltersCalendarPickerItemState("CURRENT_CROSSED", 7);
        FiltersCalendarPickerItemState filtersCalendarPickerItemState9 = new FiltersCalendarPickerItemState("UNAVAILABLE_SINGLE", 8);
        f171264i = filtersCalendarPickerItemState9;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState10 = new FiltersCalendarPickerItemState("UNAVAILABLE_START", 9);
        f171265j = filtersCalendarPickerItemState10;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState11 = new FiltersCalendarPickerItemState("UNAVAILABLE_END", 10);
        f171266k = filtersCalendarPickerItemState11;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState12 = new FiltersCalendarPickerItemState("UNAVAILABLE_MIDDLE", 11);
        f171267l = filtersCalendarPickerItemState12;
        FiltersCalendarPickerItemState filtersCalendarPickerItemState13 = new FiltersCalendarPickerItemState("UNAVAILABLE", 12);
        f171268m = filtersCalendarPickerItemState13;
        FiltersCalendarPickerItemState[] filtersCalendarPickerItemStateArr = {filtersCalendarPickerItemState, filtersCalendarPickerItemState2, filtersCalendarPickerItemState3, filtersCalendarPickerItemState4, filtersCalendarPickerItemState5, filtersCalendarPickerItemState6, filtersCalendarPickerItemState7, filtersCalendarPickerItemState8, filtersCalendarPickerItemState9, filtersCalendarPickerItemState10, filtersCalendarPickerItemState11, filtersCalendarPickerItemState12, filtersCalendarPickerItemState13};
        f171269n = filtersCalendarPickerItemStateArr;
        f171270o = c.a(filtersCalendarPickerItemStateArr);
    }

    public FiltersCalendarPickerItemState() {
        throw null;
    }

    public static FiltersCalendarPickerItemState valueOf(String str) {
        return (FiltersCalendarPickerItemState) Enum.valueOf(FiltersCalendarPickerItemState.class, str);
    }

    public static FiltersCalendarPickerItemState[] values() {
        return (FiltersCalendarPickerItemState[]) f171269n.clone();
    }
}
