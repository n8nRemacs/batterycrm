package ds;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lds/b;", "", "", "baseCashback", "", "overRecCoefficient", "recommendedBid", "<init>", "(JDJ)V", "J", "a", "()J", "D", "b", "()D", "c", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ds.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39794b {

    @com.google.gson.annotations.c("baseCashback")
    private final long baseCashback;

    @com.google.gson.annotations.c("overRecCoefficient")
    private final double overRecCoefficient;

    @com.google.gson.annotations.c("recommendedBid")
    private final long recommendedBid;

    public C39794b(long j12, double d12, long j13) {
        this.baseCashback = j12;
        this.overRecCoefficient = d12;
        this.recommendedBid = j13;
    }

    /* renamed from: a, reason: from getter */
    public final long getBaseCashback() {
        return this.baseCashback;
    }

    /* renamed from: b, reason: from getter */
    public final double getOverRecCoefficient() {
        return this.overRecCoefficient;
    }

    /* renamed from: c, reason: from getter */
    public final long getRecommendedBid() {
        return this.recommendedBid;
    }
}
