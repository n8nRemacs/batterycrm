package jd0;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GetVacancyProgressV2Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Ljd0/b;", "", "", "count", "", "subtitle", "title", "totalCount", "<init>", "(JLjava/lang/String;Ljava/lang/String;J)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jd0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42362b {

    @c("count")
    private final long count;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    @c("totalCount")
    private final long totalCount;

    public C42362b(long j12, @k String str, @k String str2, long j13) {
        this.count = j12;
        this.subtitle = str;
        this.title = str2;
        this.totalCount = j13;
    }

    /* renamed from: a, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final long getTotalCount() {
        return this.totalCount;
    }
}
