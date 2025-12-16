package com.avito.android.planning;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarSelectionType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/planning/CalendarSelectionType;", "", "_avito_vas-planning_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CalendarSelectionType {

    /* renamed from: b, reason: collision with root package name */
    public static final CalendarSelectionType f220022b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CalendarSelectionType[] f220023c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f220024d;

    static {
        CalendarSelectionType calendarSelectionType = new CalendarSelectionType("Single", 0);
        f220022b = calendarSelectionType;
        CalendarSelectionType[] calendarSelectionTypeArr = {calendarSelectionType, new CalendarSelectionType("Range", 1)};
        f220023c = calendarSelectionTypeArr;
        f220024d = c.a(calendarSelectionTypeArr);
    }

    public CalendarSelectionType() {
        throw null;
    }

    public static CalendarSelectionType valueOf(String str) {
        return (CalendarSelectionType) Enum.valueOf(CalendarSelectionType.class, str);
    }

    public static CalendarSelectionType[] values() {
        return (CalendarSelectionType[]) f220023c.clone();
    }
}
