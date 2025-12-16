package os;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostRequest.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Los/u;", "", "", "dayCount", "", "locationsIds", "", "price", "<init>", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/Long;", "getDayCount", "()Ljava/lang/Long;", "Ljava/util/List;", "getLocationsIds", "()Ljava/util/List;", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u {

    @com.google.gson.annotations.c("dayCount")
    @Y61.l
    private final Long dayCount;

    @com.google.gson.annotations.c("locationsIds")
    @Y61.k
    private final List<Long> locationsIds;

    @com.google.gson.annotations.c("price")
    @Y61.k
    private final String price;

    public u(@Y61.l Long l12, @Y61.k List<Long> list, @Y61.k String str) {
        this.dayCount = l12;
        this.locationsIds = list;
        this.price = str;
    }
}
