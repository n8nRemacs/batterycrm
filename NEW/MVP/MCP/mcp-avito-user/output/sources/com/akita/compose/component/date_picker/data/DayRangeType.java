package com.akita.compose.component.date_picker.data;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DayRangeType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/date_picker/data/DayRangeType;", "", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DayRangeType {

    /* renamed from: b, reason: collision with root package name */
    public static final DayRangeType f61215b;

    /* renamed from: c, reason: collision with root package name */
    public static final DayRangeType f61216c;

    /* renamed from: d, reason: collision with root package name */
    public static final DayRangeType f61217d;

    /* renamed from: e, reason: collision with root package name */
    public static final DayRangeType f61218e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ DayRangeType[] f61219f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f61220g;

    static {
        DayRangeType dayRangeType = new DayRangeType("SINGLE", 0);
        f61215b = dayRangeType;
        DayRangeType dayRangeType2 = new DayRangeType("START_RANGE", 1);
        f61216c = dayRangeType2;
        DayRangeType dayRangeType3 = new DayRangeType("END_RANGE", 2);
        f61217d = dayRangeType3;
        DayRangeType dayRangeType4 = new DayRangeType("IN_RANGE", 3);
        f61218e = dayRangeType4;
        DayRangeType[] dayRangeTypeArr = {dayRangeType, dayRangeType2, dayRangeType3, dayRangeType4};
        f61219f = dayRangeTypeArr;
        f61220g = c.a(dayRangeTypeArr);
    }

    public DayRangeType() {
        throw null;
    }

    public static DayRangeType valueOf(String str) {
        return (DayRangeType) Enum.valueOf(DayRangeType.class, str);
    }

    public static DayRangeType[] values() {
        return (DayRangeType[]) f61219f.clone();
    }
}
