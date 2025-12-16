package com.akita.compose.component.time_line.internal;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimeLineScopeImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/time_line/internal/TimeLineItemState;", "", "time-line_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimeLineItemState {

    /* renamed from: b, reason: collision with root package name */
    public static final TimeLineItemState f63136b;

    /* renamed from: c, reason: collision with root package name */
    public static final TimeLineItemState f63137c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeLineItemState f63138d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TimeLineItemState[] f63139e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f63140f;

    static {
        TimeLineItemState timeLineItemState = new TimeLineItemState("COMPLETED", 0);
        f63136b = timeLineItemState;
        TimeLineItemState timeLineItemState2 = new TimeLineItemState("CURRENT", 1);
        f63137c = timeLineItemState2;
        TimeLineItemState timeLineItemState3 = new TimeLineItemState("UNCOMPLETED", 2);
        f63138d = timeLineItemState3;
        TimeLineItemState[] timeLineItemStateArr = {timeLineItemState, timeLineItemState2, timeLineItemState3};
        f63139e = timeLineItemStateArr;
        f63140f = c.a(timeLineItemStateArr);
    }

    public TimeLineItemState() {
        throw null;
    }

    public static TimeLineItemState valueOf(String str) {
        return (TimeLineItemState) Enum.valueOf(TimeLineItemState.class, str);
    }

    public static TimeLineItemState[] values() {
        return (TimeLineItemState[]) f63139e.clone();
    }
}
