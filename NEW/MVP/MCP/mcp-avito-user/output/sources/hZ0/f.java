package hz0;

import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lhz0/f;", "", "", "hasMore", "", "limit", "pageNumber", "total", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Ljava/lang/Long;", "getLimit", "()Ljava/lang/Long;", "b", "getTotal", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    @com.google.gson.annotations.c("hasMore")
    @Y61.l
    private final Boolean hasMore;

    @com.google.gson.annotations.c("limit")
    @Y61.l
    private final Long limit;

    @com.google.gson.annotations.c("pageNumber")
    @Y61.l
    private final Long pageNumber;

    @com.google.gson.annotations.c("total")
    @Y61.l
    private final Long total;

    public f(@Y61.l Boolean bool, @Y61.l Long l12, @Y61.l Long l13, @Y61.l Long l14) {
        this.hasMore = bool;
        this.limit = l12;
        this.pageNumber = l13;
        this.total = l14;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Long getPageNumber() {
        return this.pageNumber;
    }
}
