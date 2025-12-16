package eQ0;

import kotlin.Metadata;

/* compiled from: V2JobSeekerCvsResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LeQ0/e;", "", "LeQ0/a;", "color", "", "progress", "", "title", "<init>", "(LeQ0/a;Ljava/lang/Double;Ljava/lang/String;)V", "LeQ0/a;", "a", "()LeQ0/a;", "Ljava/lang/Double;", "getProgress", "()Ljava/lang/Double;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    @com.google.gson.annotations.c("color")
    @Y61.k
    private final C40039a color;

    @com.google.gson.annotations.c("progress")
    @Y61.l
    private final Double progress;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public e(@Y61.k C40039a c40039a, @Y61.l Double d12, @Y61.k String str) {
        this.color = c40039a;
        this.progress = d12;
        this.title = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C40039a getColor() {
        return this.color;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
