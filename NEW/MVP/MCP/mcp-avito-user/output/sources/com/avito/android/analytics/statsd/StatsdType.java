package com.avito.android.analytics.statsd;

import androidx.annotation.Keep;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatsdType.kt */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/analytics/statsd/StatsdType;", "", "(Ljava/lang/String;I)V", "TIME", "COUNT", "GAUGE", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StatsdType {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ StatsdType[] $VALUES;

    @com.google.gson.annotations.c(CrashHianalyticsData.TIME)
    public static final StatsdType TIME = new StatsdType("TIME", 0);

    @com.google.gson.annotations.c("count")
    public static final StatsdType COUNT = new StatsdType("COUNT", 1);

    @com.google.gson.annotations.c("gauge")
    public static final StatsdType GAUGE = new StatsdType("GAUGE", 2);

    private static final /* synthetic */ StatsdType[] $values() {
        return new StatsdType[]{TIME, COUNT, GAUGE};
    }

    static {
        StatsdType[] statsdTypeArr$values = $values();
        $VALUES = statsdTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(statsdTypeArr$values);
    }

    private StatsdType(String str, int i12) {
    }

    @Y61.k
    public static kotlin.enums.a<StatsdType> getEntries() {
        return $ENTRIES;
    }

    public static StatsdType valueOf(String str) {
        return (StatsdType) Enum.valueOf(StatsdType.class, str);
    }

    public static StatsdType[] values() {
        return (StatsdType[]) $VALUES.clone();
    }
}
