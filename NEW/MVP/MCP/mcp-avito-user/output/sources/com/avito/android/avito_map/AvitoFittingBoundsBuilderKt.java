package com.avito.android.avito_map;

import Y61.k;
import com.avito.android.remote.model.search.map.Area;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Metadata;

/* compiled from: AvitoFittingBoundsBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toLatLngBounds", "Lcom/google/android/gms/maps/model/LatLngBounds;", "Lcom/avito/android/remote/model/search/map/Area;", "_avito_avito-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoFittingBoundsBuilderKt {
    @k
    public static final LatLngBounds toLatLngBounds(@k Area area) {
        return new LatLngBounds(new LatLng(area.getBottomRight().getLatitude(), area.getTopLeft().getLongitude()), new LatLng(area.getTopLeft().getLatitude(), area.getBottomRight().getLongitude()));
    }
}
