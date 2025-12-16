package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Geometry;
import j.N;

/* loaded from: classes7.dex */
public class VisibleRegionUtils {
    @N
    public static native BoundingBox getBounds(@N VisibleRegion visibleRegion);

    @N
    public static native Geometry toPolygon(@N VisibleRegion visibleRegion);
}
