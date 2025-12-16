package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface MapObjectCollection extends BaseMapObjectCollection {
    @N
    CircleMapObject addCircle(@N Circle circle);

    @N
    ClusterizedPlacemarkCollection addClusterizedPlacemarkCollection(@N ClusterListener clusterListener);

    @N
    MapObjectCollection addCollection();

    @N
    @Deprecated
    PlacemarkMapObject addEmptyPlacemark(@N Point point);

    @N
    @Deprecated
    List<PlacemarkMapObject> addEmptyPlacemarks(@N List<Point> list);

    @N
    PlacemarkMapObject addPlacemark();

    @N
    @Deprecated
    PlacemarkMapObject addPlacemark(@N Point point);

    @N
    @Deprecated
    PlacemarkMapObject addPlacemark(@N Point point, @N AnimatedImageProvider animatedImageProvider, @N IconStyle iconStyle);

    @N
    @Deprecated
    PlacemarkMapObject addPlacemark(@N Point point, @N ImageProvider imageProvider);

    @N
    @Deprecated
    PlacemarkMapObject addPlacemark(@N Point point, @N ImageProvider imageProvider, @N IconStyle iconStyle);

    @N
    @Deprecated
    PlacemarkMapObject addPlacemark(@N Point point, @N ViewProvider viewProvider);

    @N
    @Deprecated
    PlacemarkMapObject addPlacemark(@N Point point, @N ViewProvider viewProvider, @N IconStyle iconStyle);

    @N
    PlacemarkMapObject addPlacemark(@N PlacemarkCreatedCallback placemarkCreatedCallback);

    @N
    @Deprecated
    List<PlacemarkMapObject> addPlacemarks(@N List<Point> list, @N ImageProvider imageProvider, @N IconStyle iconStyle);

    @N
    PolygonMapObject addPolygon(@N Polygon polygon);

    @N
    PolylineMapObject addPolyline();

    @N
    PolylineMapObject addPolyline(@N Polyline polyline);

    @N
    PlacemarksStyler placemarksStyler();
}
