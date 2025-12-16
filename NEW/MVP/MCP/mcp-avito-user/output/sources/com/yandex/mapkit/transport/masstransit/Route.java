package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.uri.UriObjectMetadata;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface Route {
    double distanceBetweenPolylinePositions(@N PolylinePosition polylinePosition, @N PolylinePosition polylinePosition2);

    @N
    Polyline getGeometry();

    @N
    RouteMetadata getMetadata();

    @N
    List<Section> getSections();

    @N
    UriObjectMetadata getUriMetadata();

    @N
    List<WayPoint> getWayPoints();
}
