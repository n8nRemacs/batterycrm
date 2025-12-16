package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.ClusterizedPlacemarkCollection;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkCreatedCallback;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class ClusterizedPlacemarkCollectionBinding extends BaseMapObjectCollectionBinding implements ClusterizedPlacemarkCollection {
    public ClusterizedPlacemarkCollectionBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addEmptyPlacemark(@N Point point);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    public native List<PlacemarkMapObject> addEmptyPlacemarks(@N List<Point> list);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    public native PlacemarkMapObject addPlacemark();

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point, @N AnimatedImageProvider animatedImageProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point, @N ImageProvider imageProvider);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point, @N ImageProvider imageProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point, @N ViewProvider viewProvider);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point, @N ViewProvider viewProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    public native PlacemarkMapObject addPlacemark(@N PlacemarkCreatedCallback placemarkCreatedCallback);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @N
    public native List<PlacemarkMapObject> addPlacemarks(@N List<Point> list, @N ImageProvider imageProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    public native void clusterPlacemarks(double d12, int i12);
}
