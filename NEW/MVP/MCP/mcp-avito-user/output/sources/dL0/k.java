package Dl0;

import kotlin.Metadata;

/* compiled from: MainShortVideosOnAppV3Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"LDl0/k;", "", "", "reviewCountText", "", "score", "", "scoreFloat", "text", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "d", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k {

    @com.google.gson.annotations.c("reviewCountText")
    @Y61.l
    private final String reviewCountText;

    @com.google.gson.annotations.c("score")
    @Y61.l
    private final Long score;

    @com.google.gson.annotations.c("scoreFloat")
    @Y61.l
    private final Double scoreFloat;

    @com.google.gson.annotations.c("text")
    @Y61.l
    private final String text;

    public k(@Y61.l String str, @Y61.l Long l12, @Y61.l Double d12, @Y61.l String str2) {
        this.reviewCountText = str;
        this.score = l12;
        this.scoreFloat = d12;
        this.text = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getReviewCountText() {
        return this.reviewCountText;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Long getScore() {
        return this.score;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Double getScoreFloat() {
        return this.scoreFloat;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
