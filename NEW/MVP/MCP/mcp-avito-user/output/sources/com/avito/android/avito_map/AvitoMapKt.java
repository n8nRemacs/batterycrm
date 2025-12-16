package com.avito.android.avito_map;

import Y61.k;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: AvitoMap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"", "left", "right", "Lkotlin/Q;", "denormalizeCoordinates", "(DD)Lkotlin/Q;", "Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "cameraPosition", "", "mapPointAlmostEquals", "(Lcom/avito/android/avito_map/AvitoMapCameraPosition;Lcom/avito/android/avito_map/AvitoMapCameraPosition;)Z", "zoomLevelEquals", "_avito_avito-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoMapKt {
    @k
    public static final Q<Double, Double> denormalizeCoordinates(double d12, double d13) {
        return d13 > d12 ? new Q<>(Double.valueOf(d12), Double.valueOf(d13)) : Math.abs(d13) > Math.abs(d12) ? new Q<>(Double.valueOf(d12), Double.valueOf(d13 + 360)) : new Q<>(Double.valueOf(d12 - 360), Double.valueOf(d13));
    }

    public static final boolean mapPointAlmostEquals(@k AvitoMapCameraPosition avitoMapCameraPosition, @k AvitoMapCameraPosition avitoMapCameraPosition2) {
        return AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMapCameraPosition2.getMapPoint());
    }

    public static final boolean zoomLevelEquals(@k AvitoMapCameraPosition avitoMapCameraPosition, @k AvitoMapCameraPosition avitoMapCameraPosition2) {
        return avitoMapCameraPosition.getZoomLevel() == avitoMapCameraPosition2.getZoomLevel();
    }
}
