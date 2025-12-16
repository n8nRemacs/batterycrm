package cJ;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2HotelByItemIdSearchOffersGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"LcJ/g;", "", "", "adultGuests", "", "childGuestAges", "maxAdultsCount", "maxChildrenCount", "maxCount", "minCount", "<init>", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/lang/Long;", "getAdultGuests", "()Ljava/lang/Long;", "Ljava/util/List;", "getChildGuestAges", "()Ljava/util/List;", "getMaxAdultsCount", "getMaxChildrenCount", "getMaxCount", "getMinCount", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g {

    @com.google.gson.annotations.c("adultGuests")
    @Y61.l
    private final Long adultGuests;

    @com.google.gson.annotations.c("childGuestAges")
    @Y61.l
    private final List<Long> childGuestAges;

    @com.google.gson.annotations.c("maxAdultsCount")
    @Y61.l
    private final Long maxAdultsCount;

    @com.google.gson.annotations.c("maxChildrenCount")
    @Y61.l
    private final Long maxChildrenCount;

    @com.google.gson.annotations.c("maxCount")
    @Y61.l
    private final Long maxCount;

    @com.google.gson.annotations.c("minCount")
    @Y61.l
    private final Long minCount;

    public g(@Y61.l Long l12, @Y61.l List<Long> list, @Y61.l Long l13, @Y61.l Long l14, @Y61.l Long l15, @Y61.l Long l16) {
        this.adultGuests = l12;
        this.childGuestAges = list;
        this.maxAdultsCount = l13;
        this.maxChildrenCount = l14;
        this.maxCount = l15;
        this.minCount = l16;
    }
}
