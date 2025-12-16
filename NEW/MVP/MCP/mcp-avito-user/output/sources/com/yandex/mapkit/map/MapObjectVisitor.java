package com.yandex.mapkit.map;

import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface MapObjectVisitor {
    @j0
    void onCircleVisited(@N CircleMapObject circleMapObject);

    @j0
    void onClusterizedCollectionVisitEnd(@N ClusterizedPlacemarkCollection clusterizedPlacemarkCollection);

    @j0
    boolean onClusterizedCollectionVisitStart(@N ClusterizedPlacemarkCollection clusterizedPlacemarkCollection);

    @j0
    void onCollectionVisitEnd(@N MapObjectCollection mapObjectCollection);

    @j0
    boolean onCollectionVisitStart(@N MapObjectCollection mapObjectCollection);

    @j0
    void onPlacemarkVisited(@N PlacemarkMapObject placemarkMapObject);

    @j0
    void onPolygonVisited(@N PolygonMapObject polygonMapObject);

    @j0
    void onPolylineVisited(@N PolylineMapObject polylineMapObject);
}
