package uP;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiGetFavoritesRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LuP/e;", "", "", "direction", "", "LuP/k;", "filters", "", "limit", "offset", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;J)V", "Ljava/lang/String;", "getDirection", "()Ljava/lang/String;", "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "Ljava/lang/Long;", "getLimit", "()Ljava/lang/Long;", "J", "getOffset", "()J", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    @com.google.gson.annotations.c("direction")
    @Y61.l
    private final String direction;

    @com.google.gson.annotations.c("filters")
    @Y61.l
    private final List<k> filters;

    @com.google.gson.annotations.c("limit")
    @Y61.l
    private final Long limit;

    @com.google.gson.annotations.c("offset")
    private final long offset;

    public e(@Y61.l String str, @Y61.l List<k> list, @Y61.l Long l12, long j12) {
        this.direction = str;
        this.filters = list;
        this.limit = l12;
        this.offset = j12;
    }
}
