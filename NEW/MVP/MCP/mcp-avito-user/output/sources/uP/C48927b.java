package uP;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiGetFavoritesResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"LuP/b;", "", "", "LuP/a;", "items", "", "offset", "total", "<init>", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "getTotal", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uP.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48927b {

    @com.google.gson.annotations.c("items")
    @Y61.l
    private final List<C48926a> items;

    @com.google.gson.annotations.c("offset")
    @Y61.l
    private final Long offset;

    @com.google.gson.annotations.c("total")
    @Y61.l
    private final Long total;

    public C48927b(@Y61.l List<C48926a> list, @Y61.l Long l12, @Y61.l Long l13) {
        this.items = list;
        this.offset = l12;
        this.total = l13;
    }

    @Y61.l
    public final List<C48926a> a() {
        return this.items;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Long getOffset() {
        return this.offset;
    }
}
