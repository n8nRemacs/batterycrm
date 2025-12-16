package Rp;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalApplicationListPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LRp/e;", "", "", "page", "perPage", "totalCount", "totalPages", "<init>", "(JJJJ)V", "J", "getPage", "()J", "getPerPage", "a", "b", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    @com.google.gson.annotations.c("page")
    private final long page;

    @com.google.gson.annotations.c("perPage")
    private final long perPage;

    @com.google.gson.annotations.c("totalCount")
    private final long totalCount;

    @com.google.gson.annotations.c("totalPages")
    private final long totalPages;

    public e(long j12, long j13, long j14, long j15) {
        this.page = j12;
        this.perPage = j13;
        this.totalCount = j14;
        this.totalPages = j15;
    }

    /* renamed from: a, reason: from getter */
    public final long getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: b, reason: from getter */
    public final long getTotalPages() {
        return this.totalPages;
    }
}
