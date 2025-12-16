package cr;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcr/l;", "", "", "currentValue", "", "date", "micromarketValue", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l {

    @com.google.gson.annotations.c("currentValue")
    @Y61.l
    private final Long currentValue;

    @com.google.gson.annotations.c("date")
    @Y61.k
    private final String date;

    @com.google.gson.annotations.c("micromarketValue")
    @Y61.l
    private final Long micromarketValue;

    public l(@Y61.l Long l12, @Y61.k String str, @Y61.l Long l13) {
        this.currentValue = l12;
        this.date = str;
        this.micromarketValue = l13;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getCurrentValue() {
        return this.currentValue;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Long getMicromarketValue() {
        return this.micromarketValue;
    }
}
