package com.yandex.mapkit.geometry.geo;

import com.yandex.mapkit.geometry.Point;
import j.N;

/* loaded from: classes7.dex */
public interface Projection {
    boolean isValid();

    @N
    XYPoint worldToXY(@N Point point, int i12);

    @N
    Point xyToWorld(@N XYPoint xYPoint, int i12);
}
