package com.avito.android.analytics.statsd;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: StatsdRecord.kt */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/avito/android/analytics/statsd/StatsdRecord;", "Ljava/io/Serializable;", "", "key", "Lcom/avito/android/analytics/statsd/StatsdType;", "type", "", "value", "", "generationTime", "<init>", "(Ljava/lang/String;Lcom/avito/android/analytics/statsd/StatsdType;Ljava/lang/Number;Ljava/lang/Long;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lcom/avito/android/analytics/statsd/StatsdType;", "getType", "()Lcom/avito/android/analytics/statsd/StatsdType;", "Ljava/lang/Number;", "getValue", "()Ljava/lang/Number;", "Ljava/lang/Long;", "getGenerationTime", "()Ljava/lang/Long;", "Companion", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StatsdRecord implements Serializable {
    private static final long serialVersionUID = 1;

    @Y61.l
    @InterfaceC28512d
    private final Long generationTime;

    @com.google.gson.annotations.c("key")
    @Y61.k
    private final String key;

    @com.google.gson.annotations.c("type")
    @Y61.k
    private final StatsdType type;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final Number value;

    public StatsdRecord(@Y61.k String str, @Y61.k StatsdType statsdType, @Y61.k Number number, @Y61.l Long l12) {
        this.key = str;
        this.type = statsdType;
        this.value = number;
        this.generationTime = l12;
    }

    @Y61.l
    public final Long getGenerationTime() {
        return this.generationTime;
    }

    @Y61.k
    public final String getKey() {
        return this.key;
    }

    @Y61.k
    public final StatsdType getType() {
        return this.type;
    }

    @Y61.k
    public final Number getValue() {
        return this.value;
    }
}
