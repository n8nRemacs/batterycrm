package com.avito.android.lib.design.time_line;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivateTimeLineItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/time_line/TimeLineItemWidthType;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TimeLineItemWidthType {

    /* renamed from: c, reason: collision with root package name */
    public static final TimeLineItemWidthType f180959c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeLineItemWidthType f180960d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TimeLineItemWidthType[] f180961e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f180962f;

    /* renamed from: b, reason: collision with root package name */
    public final int f180963b;

    static {
        TimeLineItemWidthType timeLineItemWidthType = new TimeLineItemWidthType("PART", 0, 2);
        f180959c = timeLineItemWidthType;
        TimeLineItemWidthType timeLineItemWidthType2 = new TimeLineItemWidthType("THIRD", 1, 3);
        f180960d = timeLineItemWidthType2;
        TimeLineItemWidthType[] timeLineItemWidthTypeArr = {timeLineItemWidthType, timeLineItemWidthType2};
        f180961e = timeLineItemWidthTypeArr;
        f180962f = kotlin.enums.c.a(timeLineItemWidthTypeArr);
    }

    public TimeLineItemWidthType(String str, int i12, int i13) {
        this.f180963b = i13;
    }

    public static TimeLineItemWidthType valueOf(String str) {
        return (TimeLineItemWidthType) Enum.valueOf(TimeLineItemWidthType.class, str);
    }

    public static TimeLineItemWidthType[] values() {
        return (TimeLineItemWidthType[]) f180961e.clone();
    }
}
