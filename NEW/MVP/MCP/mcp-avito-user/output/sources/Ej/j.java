package eJ;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3HotelByItemIdSearchOffersGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"LeJ/j;", "", "", "adultGuests", "", "childGuestAges", "maxAdultsCount", "maxChildrenCount", "maxCount", "minCount", "<init>", "(JLjava/util/List;JJJJ)V", "J", "a", "()J", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "d", "e", "f", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j {

    @com.google.gson.annotations.c("adultGuests")
    private final long adultGuests;

    @com.google.gson.annotations.c("childGuestAges")
    @Y61.l
    private final List<Long> childGuestAges;

    @com.google.gson.annotations.c("maxAdultsCount")
    private final long maxAdultsCount;

    @com.google.gson.annotations.c("maxChildrenCount")
    private final long maxChildrenCount;

    @com.google.gson.annotations.c("maxCount")
    private final long maxCount;

    @com.google.gson.annotations.c("minCount")
    private final long minCount;

    public j(long j12, @Y61.l List<Long> list, long j13, long j14, long j15, long j16) {
        this.adultGuests = j12;
        this.childGuestAges = list;
        this.maxAdultsCount = j13;
        this.maxChildrenCount = j14;
        this.maxCount = j15;
        this.minCount = j16;
    }

    /* renamed from: a, reason: from getter */
    public final long getAdultGuests() {
        return this.adultGuests;
    }

    @Y61.l
    public final List<Long> b() {
        return this.childGuestAges;
    }

    /* renamed from: c, reason: from getter */
    public final long getMaxAdultsCount() {
        return this.maxAdultsCount;
    }

    /* renamed from: d, reason: from getter */
    public final long getMaxChildrenCount() {
        return this.maxChildrenCount;
    }

    /* renamed from: e, reason: from getter */
    public final long getMaxCount() {
        return this.maxCount;
    }

    /* renamed from: f, reason: from getter */
    public final long getMinCount() {
        return this.minCount;
    }
}
