package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.navigation.JamStyle;
import j.N;

/* loaded from: classes7.dex */
public class RouteHelper {
    public static native void addJams(@N PolylineMapObject polylineMapObject, @N DrivingRoute drivingRoute);

    public static native void addManeuvers(@N PolylineMapObject polylineMapObject, @N DrivingRoute drivingRoute);

    public static native void applyJamStyle(@N PolylineMapObject polylineMapObject, @N JamStyle jamStyle);

    public static native void applyManeuverStyle(@N PolylineMapObject polylineMapObject, @N ManeuverStyle maneuverStyle);

    @N
    public static native JamStyle createDefaultJamStyle();

    @N
    public static native ManeuverStyle createDefaultManeuverStyle();

    @N
    public static native JamStyle createDisabledJamStyle();

    public static native void updatePolyline(@N PolylineMapObject polylineMapObject, @N DrivingRoute drivingRoute, @N JamStyle jamStyle, boolean z12);
}
