package jw0;

import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Ljw0/o;", "", "", "max", "", "message", "min", "regexp", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o {

    @com.google.gson.annotations.c("max")
    @Y61.l
    private final Long max;

    @com.google.gson.annotations.c("message")
    @Y61.k
    private final String message;

    @com.google.gson.annotations.c("min")
    @Y61.l
    private final Long min;

    @com.google.gson.annotations.c("regexp")
    @Y61.l
    private final String regexp;

    public o(@Y61.l Long l12, @Y61.k String str, @Y61.l Long l13, @Y61.l String str2) {
        this.max = l12;
        this.message = str;
        this.min = l13;
        this.regexp = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getMax() {
        return this.max;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Long getMin() {
        return this.min;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getRegexp() {
        return this.regexp;
    }
}
