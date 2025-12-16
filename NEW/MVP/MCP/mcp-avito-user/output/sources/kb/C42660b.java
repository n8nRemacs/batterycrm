package kb;

import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Day.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkb/b;", "", "", "date", "", "description", "Lkb/d;", "stats", "", "services", "<init>", "(JLjava/lang/String;Lkb/d;Ljava/util/List;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lkb/d;", "d", "()Lkb/d;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kb.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C42660b {

    @com.google.gson.annotations.c("date")
    private final long date;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("services")
    @l
    private final List<String> services;

    @com.google.gson.annotations.c("stats")
    @l
    private final C42662d stats;

    public C42660b(long j12, @l String str, @l C42662d c42662d, @l List<String> list) {
        this.date = j12;
        this.description = str;
        this.stats = c42662d;
        this.services = list;
    }

    /* renamed from: a, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    public final List<String> c() {
        return this.services;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C42662d getStats() {
        return this.stats;
    }
}
