package com.akita.compose.component.time_line.internal;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimeLineScopeImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/time_line/internal/TimeLineItemPosition;", "", "time-line_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimeLineItemPosition {

    /* renamed from: b, reason: collision with root package name */
    public static final TimeLineItemPosition f63131b;

    /* renamed from: c, reason: collision with root package name */
    public static final TimeLineItemPosition f63132c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeLineItemPosition f63133d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TimeLineItemPosition[] f63134e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f63135f;

    static {
        TimeLineItemPosition timeLineItemPosition = new TimeLineItemPosition("LEADING", 0);
        f63131b = timeLineItemPosition;
        TimeLineItemPosition timeLineItemPosition2 = new TimeLineItemPosition("BETWEEN", 1);
        f63132c = timeLineItemPosition2;
        TimeLineItemPosition timeLineItemPosition3 = new TimeLineItemPosition("TRAILING", 2);
        f63133d = timeLineItemPosition3;
        TimeLineItemPosition[] timeLineItemPositionArr = {timeLineItemPosition, timeLineItemPosition2, timeLineItemPosition3};
        f63134e = timeLineItemPositionArr;
        f63135f = c.a(timeLineItemPositionArr);
    }

    public TimeLineItemPosition() {
        throw null;
    }

    public static TimeLineItemPosition valueOf(String str) {
        return (TimeLineItemPosition) Enum.valueOf(TimeLineItemPosition.class, str);
    }

    public static TimeLineItemPosition[] values() {
        return (TimeLineItemPosition[]) f63134e.clone();
    }
}
