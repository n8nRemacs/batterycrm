package com.avito.android.lib.design.time_line;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivateTimeLineItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/time_line/TimeLineAlignment;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TimeLineAlignment {

    /* renamed from: b, reason: collision with root package name */
    public static final TimeLineAlignment f180954b;

    /* renamed from: c, reason: collision with root package name */
    public static final TimeLineAlignment f180955c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeLineAlignment f180956d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TimeLineAlignment[] f180957e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f180958f;

    static {
        TimeLineAlignment timeLineAlignment = new TimeLineAlignment("START", 0);
        f180954b = timeLineAlignment;
        TimeLineAlignment timeLineAlignment2 = new TimeLineAlignment("CENTER", 1);
        f180955c = timeLineAlignment2;
        TimeLineAlignment timeLineAlignment3 = new TimeLineAlignment("END", 2);
        f180956d = timeLineAlignment3;
        TimeLineAlignment[] timeLineAlignmentArr = {timeLineAlignment, timeLineAlignment2, timeLineAlignment3};
        f180957e = timeLineAlignmentArr;
        f180958f = kotlin.enums.c.a(timeLineAlignmentArr);
    }

    public TimeLineAlignment() {
        throw null;
    }

    public static TimeLineAlignment valueOf(String str) {
        return (TimeLineAlignment) Enum.valueOf(TimeLineAlignment.class, str);
    }

    public static TimeLineAlignment[] values() {
        return (TimeLineAlignment[]) f180957e.clone();
    }
}
