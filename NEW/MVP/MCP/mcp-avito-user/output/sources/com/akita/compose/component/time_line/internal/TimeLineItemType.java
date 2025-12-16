package com.akita.compose.component.time_line.internal;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimeLineItemType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/time_line/internal/TimeLineItemType;", "", "time-line_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimeLineItemType {

    /* renamed from: b, reason: collision with root package name */
    public static final TimeLineItemType f63141b;

    /* renamed from: c, reason: collision with root package name */
    public static final TimeLineItemType f63142c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeLineItemType f63143d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TimeLineItemType[] f63144e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f63145f;

    static {
        TimeLineItemType timeLineItemType = new TimeLineItemType("SPACER", 0);
        f63141b = timeLineItemType;
        TimeLineItemType timeLineItemType2 = new TimeLineItemType("ITEM", 1);
        f63142c = timeLineItemType2;
        TimeLineItemType timeLineItemType3 = new TimeLineItemType("SCROLLABLE_ITEM_SPACER", 2);
        f63143d = timeLineItemType3;
        TimeLineItemType[] timeLineItemTypeArr = {timeLineItemType, timeLineItemType2, timeLineItemType3};
        f63144e = timeLineItemTypeArr;
        f63145f = c.a(timeLineItemTypeArr);
    }

    public TimeLineItemType() {
        throw null;
    }

    public static TimeLineItemType valueOf(String str) {
        return (TimeLineItemType) Enum.valueOf(TimeLineItemType.class, str);
    }

    public static TimeLineItemType[] values() {
        return (TimeLineItemType[]) f63144e.clone();
    }
}
