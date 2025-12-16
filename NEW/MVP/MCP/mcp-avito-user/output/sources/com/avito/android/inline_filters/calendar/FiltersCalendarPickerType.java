package com.avito.android.inline_filters.calendar;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FiltersCalendarPickerType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerType;", "", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FiltersCalendarPickerType {

    /* renamed from: b, reason: collision with root package name */
    public static final FiltersCalendarPickerType f171050b;

    /* renamed from: c, reason: collision with root package name */
    public static final FiltersCalendarPickerType f171051c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ FiltersCalendarPickerType[] f171052d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f171053e;

    static {
        FiltersCalendarPickerType filtersCalendarPickerType = new FiltersCalendarPickerType("SINGLE_DATE", 0);
        f171050b = filtersCalendarPickerType;
        FiltersCalendarPickerType filtersCalendarPickerType2 = new FiltersCalendarPickerType("DATE_RANGE", 1);
        f171051c = filtersCalendarPickerType2;
        FiltersCalendarPickerType[] filtersCalendarPickerTypeArr = {filtersCalendarPickerType, filtersCalendarPickerType2};
        f171052d = filtersCalendarPickerTypeArr;
        f171053e = c.a(filtersCalendarPickerTypeArr);
    }

    public FiltersCalendarPickerType() {
        throw null;
    }

    public static FiltersCalendarPickerType valueOf(String str) {
        return (FiltersCalendarPickerType) Enum.valueOf(FiltersCalendarPickerType.class, str);
    }

    public static FiltersCalendarPickerType[] values() {
        return (FiltersCalendarPickerType[]) f171052d.clone();
    }
}
