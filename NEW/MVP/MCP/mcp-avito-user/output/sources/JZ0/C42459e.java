package jz0;

import Y61.k;
import kotlin.Metadata;

/* compiled from: Api4StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljz0/e;", "", "", "cursor", "", "hasMore", "", "limit", "<init>", "(Ljava/lang/String;ZJ)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "b", "()Z", "J", "c", "()J", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jz0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42459e {

    @com.google.gson.annotations.c("cursor")
    @k
    private final String cursor;

    @com.google.gson.annotations.c("hasMore")
    private final boolean hasMore;

    @com.google.gson.annotations.c("limit")
    private final long limit;

    public C42459e(@k String str, boolean z12, long j12) {
        this.cursor = str;
        this.hasMore = z12;
        this.limit = j12;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: c, reason: from getter */
    public final long getLimit() {
        return this.limit;
    }
}
