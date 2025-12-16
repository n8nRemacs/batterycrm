package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.mapkit.navigation.JamStyle;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class DrivingJamsPainter {
    public static native void applyJamsStyle(@N PolylineMapObject polylineMapObject, @N List<JamSegment> list, @N JamStyle jamStyle);
}
