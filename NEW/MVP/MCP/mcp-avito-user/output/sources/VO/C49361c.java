package vo;

import kotlin.Metadata;

/* compiled from: ApiCheckoutV8Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvo/c;", "", "", "count", "", "icon", "", "progress", "Lvo/j;", "progressColor", "<init>", "(JLjava/lang/String;DLvo/j;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "D", "c", "()D", "Lvo/j;", "d", "()Lvo/j;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vo.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49361c {

    @com.google.gson.annotations.c("count")
    private final long count;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final String icon;

    @com.google.gson.annotations.c("progress")
    private final double progress;

    @com.google.gson.annotations.c("progressColor")
    @Y61.k
    private final j progressColor;

    public C49361c(long j12, @Y61.l String str, double d12, @Y61.k j jVar) {
        this.count = j12;
        this.icon = str;
        this.progress = d12;
        this.progressColor = jVar;
    }

    /* renamed from: a, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: c, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final j getProgressColor() {
        return this.progressColor;
    }
}
