package com.avito.android.beduin.common.component.countdown_timer;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinCountDownTimerModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/countdown_timer/TimeType;", "", "(Ljava/lang/String;I)V", "UTC", "DEVICE_LOCAL", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TimeType {

    @com.google.gson.annotations.c("deviceLocal")
    public static final TimeType DEVICE_LOCAL;

    @com.google.gson.annotations.c("utc")
    public static final TimeType UTC;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TimeType[] f101099b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101100c;

    static {
        TimeType timeType = new TimeType("UTC", 0);
        UTC = timeType;
        TimeType timeType2 = new TimeType("DEVICE_LOCAL", 1);
        DEVICE_LOCAL = timeType2;
        TimeType[] timeTypeArr = {timeType, timeType2};
        f101099b = timeTypeArr;
        f101100c = kotlin.enums.c.a(timeTypeArr);
    }

    private TimeType(String str, int i12) {
    }

    public static TimeType valueOf(String str) {
        return (TimeType) Enum.valueOf(TimeType.class, str);
    }

    public static TimeType[] values() {
        return (TimeType[]) f101099b.clone();
    }
}
