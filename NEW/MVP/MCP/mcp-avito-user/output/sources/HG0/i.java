package Hg0;

import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LHg0/i;", "", "", "max", "", "message", "min", "rule", "<init>", "(JLjava/lang/String;JLjava/lang/String;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i {

    @com.google.gson.annotations.c("max")
    private final long max;

    @com.google.gson.annotations.c("message")
    @Y61.k
    private final String message;

    @com.google.gson.annotations.c("min")
    private final long min;

    @com.google.gson.annotations.c("rule")
    @Y61.k
    private final String rule;

    public i(long j12, @Y61.k String str, long j13, @Y61.k String str2) {
        this.max = j12;
        this.message = str;
        this.min = j13;
        this.rule = str2;
    }

    /* renamed from: a, reason: from getter */
    public final long getMax() {
        return this.max;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final long getMin() {
        return this.min;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getRule() {
        return this.rule;
    }
}
