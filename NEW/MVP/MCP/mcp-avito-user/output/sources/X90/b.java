package x90;

import kotlin.Metadata;

/* compiled from: Api2SellersDashboardDataPostResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lx90/b;", "", "", "count", "ordersValue", "", "ordersValuesRelative", "<init>", "(JJLjava/lang/Double;)V", "J", "a", "()J", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    @com.google.gson.annotations.c("count")
    private final long count;

    @com.google.gson.annotations.c("ordersValue")
    private final long ordersValue;

    @com.google.gson.annotations.c("ordersValuesRelative")
    @Y61.l
    private final Double ordersValuesRelative;

    public b(long j12, long j13, @Y61.l Double d12) {
        this.count = j12;
        this.ordersValue = j13;
        this.ordersValuesRelative = d12;
    }

    /* renamed from: a, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    /* renamed from: b, reason: from getter */
    public final long getOrdersValue() {
        return this.ordersValue;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Double getOrdersValuesRelative() {
        return this.ordersValuesRelative;
    }
}
