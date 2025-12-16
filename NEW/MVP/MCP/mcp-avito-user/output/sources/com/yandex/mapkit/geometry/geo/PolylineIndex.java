package com.yandex.mapkit.geometry.geo;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface PolylineIndex {

    public enum Priority {
        CLOSEST_TO_RAW_POINT,
        CLOSEST_TO_START
    }

    @P
    PolylinePosition closestPolylinePosition(@N Point point, @N PolylinePosition polylinePosition, @N PolylinePosition polylinePosition2, double d12);

    @P
    PolylinePosition closestPolylinePosition(@N Point point, @N Priority priority, double d12);
}
