package com.avito.android.avito_map.google;

import Y61.k;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Metadata;

/* compiled from: AvitoGoogleMap.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"APPROXIMATE_LOCATION_WIDTH", "", "APPROXIMATE_RADIUS", "toAvitoMapBounds", "Lcom/avito/android/avito_map/AvitoMapBounds;", "Lcom/google/android/gms/maps/model/LatLngBounds;", "toAvitoMapPoint", "Lcom/avito/android/avito_map/AvitoMapPoint;", "Lcom/google/android/gms/maps/model/LatLng;", "toLatLngBounds", "_avito_avito-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoGoogleMapKt {
    private static final float APPROXIMATE_LOCATION_WIDTH = 1.0f;
    private static final float APPROXIMATE_RADIUS = 3000.0f;

    @k
    public static final AvitoMapBounds toAvitoMapBounds(@k LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.f354410c;
        double d12 = latLng.f354407b;
        LatLng latLng2 = latLngBounds.f354409b;
        return new AvitoMapBounds(new AvitoMapPoint(d12, latLng2.f354408c, null, 4, null), new AvitoMapPoint(latLng2.f354407b, latLng.f354408c, null, 4, null));
    }

    @k
    public static final AvitoMapPoint toAvitoMapPoint(@k LatLng latLng) {
        return new AvitoMapPoint(latLng.f354407b, latLng.f354408c, null, 4, null);
    }

    @k
    public static final LatLngBounds toLatLngBounds(@k AvitoMapBounds avitoMapBounds) {
        return new LatLngBounds(new LatLng(avitoMapBounds.getBottomRight().getLatitude(), avitoMapBounds.getTopLeft().getLongitude()), new LatLng(avitoMapBounds.getTopLeft().getLatitude(), avitoMapBounds.getBottomRight().getLongitude()));
    }
}
