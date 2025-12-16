package os;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Los/b;", "", "", SearchParamsConverterKt.LOCATION_ID, "Los/d;", "priceBlock", "<init>", "(JLos/d;)V", "J", "a", "()J", "Los/d;", "b", "()Los/d;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: os.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44932b {

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    @com.google.gson.annotations.c("priceBlock")
    @Y61.k
    private final d priceBlock;

    public C44932b(long j12, @Y61.k d dVar) {
        this.locationId = j12;
        this.priceBlock = dVar;
    }

    /* renamed from: a, reason: from getter */
    public final long getLocationId() {
        return this.locationId;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final d getPriceBlock() {
        return this.priceBlock;
    }
}
