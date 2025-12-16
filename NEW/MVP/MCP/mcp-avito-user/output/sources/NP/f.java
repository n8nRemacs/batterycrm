package Np;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"LNp/f;", "", "", "count", "higherPrice", "lowerPrice", "recommendedPrice", "<init>", "(Ljava/lang/Long;JJJ)V", "Ljava/lang/Long;", "getCount", "()Ljava/lang/Long;", "J", "getHigherPrice", "()J", "getLowerPrice", "getRecommendedPrice", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {

    @com.google.gson.annotations.c("count")
    @l
    private final Long count;

    @com.google.gson.annotations.c("higherPrice")
    private final long higherPrice;

    @com.google.gson.annotations.c("lowerPrice")
    private final long lowerPrice;

    @com.google.gson.annotations.c("recommendedPrice")
    private final long recommendedPrice;

    public f(@l Long l12, long j12, long j13, long j14) {
        this.count = l12;
        this.higherPrice = j12;
        this.lowerPrice = j13;
        this.recommendedPrice = j14;
    }
}
