package Kz0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3StrSellerOrdersCalendarPostResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, d2 = {"LKz0/k;", "", "", "LKz0/i;", "disabledIntervals", "", "id", "LKz0/b;", "mainInfo", "LKz0/e;", "prices", "<init>", "(Ljava/util/List;Ljava/lang/String;LKz0/b;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LKz0/b;", "c", "()LKz0/b;", "d", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    @com.google.gson.annotations.c("disabledIntervals")
    @Y61.k
    private final List<i> disabledIntervals;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("mainInfo")
    @Y61.k
    private final b mainInfo;

    @com.google.gson.annotations.c("prices")
    @Y61.k
    private final List<e> prices;

    public k(@Y61.k List<i> list, @Y61.k String str, @Y61.k b bVar, @Y61.k List<e> list2) {
        this.disabledIntervals = list;
        this.id = str;
        this.mainInfo = bVar;
        this.prices = list2;
    }

    @Y61.k
    public final List<i> a() {
        return this.disabledIntervals;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final b getMainInfo() {
        return this.mainInfo;
    }

    @Y61.k
    public final List<e> d() {
        return this.prices;
    }
}
