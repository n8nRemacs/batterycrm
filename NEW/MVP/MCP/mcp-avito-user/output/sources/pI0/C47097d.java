package pi0;

import Y61.l;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: Api2NdTrxDevelopmentsSuggestPostRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpi0/d;", "", "", "lat", AddressParameter.Value.LNG, "radiusMeters", "<init>", "(DDLjava/lang/Double;)V", "D", "getLat", "()D", "getLng", "Ljava/lang/Double;", "getRadiusMeters", "()Ljava/lang/Double;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pi0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47097d {

    @com.google.gson.annotations.c("lat")
    private final double lat;

    @com.google.gson.annotations.c(AddressParameter.Value.LNG)
    private final double lng;

    @com.google.gson.annotations.c("radiusMeters")
    @l
    private final Double radiusMeters;

    public C47097d(double d12, double d13, @l Double d14) {
        this.lat = d12;
        this.lng = d13;
        this.radiusMeters = d14;
    }
}
