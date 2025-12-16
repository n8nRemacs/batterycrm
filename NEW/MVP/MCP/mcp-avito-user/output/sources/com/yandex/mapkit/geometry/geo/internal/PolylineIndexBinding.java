package com.yandex.mapkit.geometry.geo.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.geo.PolylineIndex;
import com.yandex.runtime.NativeObject;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class PolylineIndexBinding implements PolylineIndex {
    private final NativeObject nativeObject;

    public PolylineIndexBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.geometry.geo.PolylineIndex
    @P
    public native PolylinePosition closestPolylinePosition(@N Point point, @N PolylinePosition polylinePosition, @N PolylinePosition polylinePosition2, double d12);

    @Override // com.yandex.mapkit.geometry.geo.PolylineIndex
    @P
    public native PolylinePosition closestPolylinePosition(@N Point point, @N PolylineIndex.Priority priority, double d12);
}
