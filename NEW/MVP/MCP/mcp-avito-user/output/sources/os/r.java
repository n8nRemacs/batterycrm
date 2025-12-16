package os;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Los/r;", "", "Los/h;", "dayLimitBlock", "", SearchParamsConverterKt.LOCATION_ID, "Los/s;", "priceBlock", "<init>", "(Los/h;JLos/s;)V", "Los/h;", "a", "()Los/h;", "J", "b", "()J", "Los/s;", "c", "()Los/s;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r {

    @com.google.gson.annotations.c("dayLimitBlock")
    @Y61.k
    private final h dayLimitBlock;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    @com.google.gson.annotations.c("priceBlock")
    @Y61.k
    private final s priceBlock;

    public r(@Y61.k h hVar, long j12, @Y61.k s sVar) {
        this.dayLimitBlock = hVar;
        this.locationId = j12;
        this.priceBlock = sVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final h getDayLimitBlock() {
        return this.dayLimitBlock;
    }

    /* renamed from: b, reason: from getter */
    public final long getLocationId() {
        return this.locationId;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final s getPriceBlock() {
        return this.priceBlock;
    }
}
