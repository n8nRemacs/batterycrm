package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface ClusterizedPlacemarkCollection extends BaseMapObjectCollection {
    @N
    @Deprecated
    PlacemarkMapObject addEmptyPlacemark(@N Point point);

    @N
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
    List<PlacemarkMapObject> addPlacemarks(@N List<Point> list, @N ImageProvider imageProvider, @N IconStyle iconStyle);

    void clusterPlacemarks(double d12, int i12);
}
