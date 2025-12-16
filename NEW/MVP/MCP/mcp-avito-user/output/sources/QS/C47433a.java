package qs;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo_geo.generated.api.api_cpx_promo_get_locations.GeoTreeItemApi;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiCpxPromoGetLocationsResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqs/a;", "", "", "Lcom/avito/android/cpx_promo_geo/generated/api/api_cpx_promo_get_locations/GeoTreeItemApi;", "locations", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47433a {

    @c("locations")
    @k
    private final List<GeoTreeItemApi> locations;

    public C47433a(@k List<GeoTreeItemApi> list) {
        this.locations = list;
    }

    @k
    public final List<GeoTreeItemApi> a() {
        return this.locations;
    }
}
