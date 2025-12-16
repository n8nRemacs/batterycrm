package DG;

import kotlin.Metadata;

/* compiled from: GetGigerSlotsV1Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LDG/e;", "", "", "cursor", "LDG/l;", "past", "", "totalCount", "LDG/m;", "upcoming", "<init>", "(Ljava/lang/String;LDG/l;JLDG/m;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LDG/l;", "b", "()LDG/l;", "J", "getTotalCount", "()J", "LDG/m;", "c", "()LDG/m;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    @com.google.gson.annotations.c("cursor")
    @Y61.l
    private final String cursor;

    @com.google.gson.annotations.c("past")
    @Y61.l
    private final l past;

    @com.google.gson.annotations.c("totalCount")
    private final long totalCount;

    @com.google.gson.annotations.c("upcoming")
    @Y61.l
    private final m upcoming;

    public e(@Y61.l String str, @Y61.l l lVar, long j12, @Y61.l m mVar) {
        this.cursor = str;
        this.past = lVar;
        this.totalCount = j12;
        this.upcoming = mVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final l getPast() {
        return this.past;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final m getUpcoming() {
        return this.upcoming;
    }
}
