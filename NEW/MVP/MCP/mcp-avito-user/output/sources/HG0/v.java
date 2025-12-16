package Hg0;

import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LHg0/v;", "", "", "count", "score", "", "title", "<init>", "(JJLjava/lang/String;)V", "J", "a", "()J", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class v {

    @com.google.gson.annotations.c("count")
    private final long count;

    @com.google.gson.annotations.c("score")
    private final long score;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public v(long j12, long j13, @Y61.k String str) {
        this.count = j12;
        this.score = j13;
        this.title = str;
    }

    /* renamed from: a, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    /* renamed from: b, reason: from getter */
    public final long getScore() {
        return this.score;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
