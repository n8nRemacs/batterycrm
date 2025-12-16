package com.avito.android.avito_map.marker;

import Y61.k;
import Y61.l;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import kotlin.Metadata;

/* compiled from: MarkerItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avito_map/marker/MarkerWithIdAndContext;", "Lcom/avito/android/avito_map/marker/MarkerWithId;", "Lcom/avito/android/avito_map/marker/MarkerWithContext;", "Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface MarkerWithIdAndContext extends MarkerWithId, MarkerWithContext, AvitoMarkerItem {

    /* compiled from: MarkerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @l
        public static Float getZoomToMarker(@k MarkerWithIdAndContext markerWithIdAndContext) {
            return AvitoMarkerItem.DefaultImpls.getZoomToMarker(markerWithIdAndContext);
        }

        public static boolean isApproximated(@k MarkerWithIdAndContext markerWithIdAndContext) {
            return AvitoMarkerItem.DefaultImpls.isApproximated(markerWithIdAndContext);
        }
    }
}
