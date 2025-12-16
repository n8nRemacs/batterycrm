package com.avito.android.avito_map.marker;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;

/* compiled from: AvitoMarkerItem.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "Landroid/os/Parcelable;", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/google/android/gms/maps/model/LatLng;", "getCoordinates", "()Lcom/google/android/gms/maps/model/LatLng;", "isApproximated", "", "()Z", "zoomToMarker", "", "getZoomToMarker", "()Ljava/lang/Float;", "getMapId", "", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AvitoMarkerItem extends Parcelable {

    /* compiled from: AvitoMarkerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @l
        public static Float getZoomToMarker(@k AvitoMarkerItem avitoMarkerItem) {
            return null;
        }

        public static boolean isApproximated(@k AvitoMarkerItem avitoMarkerItem) {
            return false;
        }
    }

    @k
    LatLng getCoordinates();

    @k
    String getMapId();

    @l
    Float getZoomToMarker();

    boolean isApproximated();
}
