package com.yandex.mapkit.geometry.geo.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class ProjectionBinding implements Projection {
    private final NativeObject nativeObject;

    public ProjectionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.geometry.geo.Projection
    public native boolean isValid();

    @Override // com.yandex.mapkit.geometry.geo.Projection
    @N
    public native XYPoint worldToXY(@N Point point, int i12);

    @Override // com.yandex.mapkit.geometry.geo.Projection
    @N
    public native Point xyToWorld(@N XYPoint xYPoint, int i12);
}
