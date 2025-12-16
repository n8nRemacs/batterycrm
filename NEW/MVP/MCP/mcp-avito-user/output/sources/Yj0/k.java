package YJ0;

import kotlin.Metadata;

/* compiled from: Api2SellersPrivateStatisticsGeneralDynamicsDatesPostResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LYJ0/k;", "", "", "color", "status", "symbol", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k {

    @com.google.gson.annotations.c("color")
    @Y61.l
    private final String color;

    @com.google.gson.annotations.c("status")
    @Y61.l
    private final String status;

    @com.google.gson.annotations.c("symbol")
    @Y61.l
    private final String symbol;

    @com.google.gson.annotations.c("value")
    @Y61.l
    private final Long value;

    public k(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Long l12) {
        this.color = str;
        this.status = str2;
        this.symbol = str3;
        this.value = l12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Long getValue() {
        return this.value;
    }
}
