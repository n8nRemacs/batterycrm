package kb;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Week.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkb/e;", "", "", "Lkb/b;", "days", "Lkb/d;", "stats", "<init>", "(Ljava/util/List;Lkb/d;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lkb/d;", "b", "()Lkb/d;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    @com.google.gson.annotations.c("days")
    @k
    private final List<C42660b> days;

    @com.google.gson.annotations.c("stats")
    @l
    private final C42662d stats;

    public e(@k List<C42660b> list, @l C42662d c42662d) {
        this.days = list;
        this.stats = c42662d;
    }

    @k
    public final List<C42660b> a() {
        return this.days;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C42662d getStats() {
        return this.stats;
    }
}
