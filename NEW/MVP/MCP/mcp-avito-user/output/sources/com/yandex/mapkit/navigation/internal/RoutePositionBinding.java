package com.yandex.mapkit.navigation.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.navigation.RoutePosition;
import com.yandex.runtime.NativeObject;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class RoutePositionBinding implements RoutePosition {
    private final NativeObject nativeObject;

    public RoutePositionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.RoutePosition
    @N
    public native RoutePosition advance(double d12);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    @P
    public native Double distanceTo(@N RoutePosition routePosition);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native double distanceToFinish();

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native boolean equals(@N RoutePosition routePosition);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    @N
    public native Point getPoint();

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native double heading();

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native boolean onRoute(@N String str);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    @P
    public native PolylinePosition positionOnRoute(@N String str);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native boolean precedes(@N RoutePosition routePosition);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native boolean precedesOrEquals(@N RoutePosition routePosition);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native double timeToFinish();
}
