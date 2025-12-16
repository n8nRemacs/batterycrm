package os;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostRequest.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Los/o;", "", "", "dailyLimit", "dayCount", SearchParamsConverterKt.LOCATION_ID, "", "price", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/String;)V", "Ljava/lang/Long;", "getDailyLimit", "()Ljava/lang/Long;", "getDayCount", "J", "getLocationId", "()J", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o {

    @com.google.gson.annotations.c("dailyLimit")
    @Y61.l
    private final Long dailyLimit;

    @com.google.gson.annotations.c("dayCount")
    @Y61.l
    private final Long dayCount;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    @com.google.gson.annotations.c("price")
    @Y61.k
    private final String price;

    public o(@Y61.l Long l12, @Y61.l Long l13, long j12, @Y61.k String str) {
        this.dailyLimit = l12;
        this.dayCount = l13;
        this.locationId = j12;
        this.price = str;
    }
}
