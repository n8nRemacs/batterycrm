package com.yandex.mapkit.geometry.geo;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class PolylineUtils {
    @N
    public static native PolylinePosition advancePolylinePosition(@N Polyline polyline, @N PolylinePosition polylinePosition, double d12);

    @N
    public static native PolylineIndex createPolylineIndex(@N Polyline polyline);

    public static native double distanceBetweenPolylinePositions(@N Polyline polyline, @N PolylinePosition polylinePosition, @N PolylinePosition polylinePosition2);

    @N
    public static native Point pointByPolylinePosition(@N Polyline polyline, @N PolylinePosition polylinePosition);

    @N
    public static native List<PolylinePosition> positionsOfFork(@N Polyline polyline, @N PolylinePosition polylinePosition, @N Polyline polyline2, @N PolylinePosition polylinePosition2);
}
