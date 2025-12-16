package com.yandex.mapkit.navigation;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface RoutePosition {
    @N
    RoutePosition advance(double d12);

    @P
    Double distanceTo(@N RoutePosition routePosition);

    double distanceToFinish();

    boolean equals(@N RoutePosition routePosition);

    @N
    Point getPoint();

    double heading();

    boolean onRoute(@N String str);

    @P
    PolylinePosition positionOnRoute(@N String str);

    boolean precedes(@N RoutePosition routePosition);

    boolean precedesOrEquals(@N RoutePosition routePosition);

    double timeToFinish();
}
