package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DateSelectItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/date_select/SegmentType;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SegmentType {

    /* renamed from: c, reason: collision with root package name */
    public static final SegmentType f317718c;

    /* renamed from: d, reason: collision with root package name */
    public static final SegmentType f317719d;

    /* renamed from: e, reason: collision with root package name */
    public static final SegmentType f317720e;

    /* renamed from: f, reason: collision with root package name */
    public static final SegmentType f317721f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ SegmentType[] f317722g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f317723h;

    /* renamed from: b, reason: collision with root package name */
    public final int f317724b;

    static {
        SegmentType segmentType = new SegmentType("TODAY", 0, 0);
        f317718c = segmentType;
        SegmentType segmentType2 = new SegmentType("WEEK", 1, 1);
        f317719d = segmentType2;
        SegmentType segmentType3 = new SegmentType("MONTH", 2, 2);
        f317720e = segmentType3;
        SegmentType segmentType4 = new SegmentType("YEAR", 3, 3);
        f317721f = segmentType4;
        SegmentType[] segmentTypeArr = {segmentType, segmentType2, segmentType3, segmentType4};
        f317722g = segmentTypeArr;
        f317723h = kotlin.enums.c.a(segmentTypeArr);
    }

    public SegmentType(String str, int i12, int i13) {
        this.f317724b = i13;
    }

    public static SegmentType valueOf(String str) {
        return (SegmentType) Enum.valueOf(SegmentType.class, str);
    }

    public static SegmentType[] values() {
        return (SegmentType[]) f317722g.clone();
    }
}
