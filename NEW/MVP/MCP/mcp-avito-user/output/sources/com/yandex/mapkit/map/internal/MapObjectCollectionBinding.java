package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.ClusterListener;
import com.yandex.mapkit.map.ClusterizedPlacemarkCollection;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkCreatedCallback;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.PlacemarksStyler;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.subscription.Subscription;
import com.yandex.runtime.ui_view.ViewProvider;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class MapObjectCollectionBinding extends BaseMapObjectCollectionBinding implements MapObjectCollection {
    protected Subscription<ClusterListener> clusterListenerSubscription;

    public MapObjectCollectionBinding(NativeObject nativeObject) {
        super(nativeObject);
        this.clusterListenerSubscription = new Subscription<ClusterListener>() { // from class: com.yandex.mapkit.map.internal.MapObjectCollectionBinding.1
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(ClusterListener clusterListener) {
                return MapObjectCollectionBinding.createClusterListener(clusterListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createClusterListener(ClusterListener clusterListener);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    public native CircleMapObject addCircle(@N Circle circle);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    public native ClusterizedPlacemarkCollection addClusterizedPlacemarkCollection(@N ClusterListener clusterListener);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    public native MapObjectCollection addCollection();

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addEmptyPlacemark(@N Point point);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    @Deprecated
    public native List<PlacemarkMapObject> addEmptyPlacemarks(@N List<Point> list);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    public native PlacemarkMapObject addPlacemark();

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point, @N AnimatedImageProvider animatedImageProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point, @N ImageProvider imageProvider);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point, @N ImageProvider imageProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point, @N ViewProvider viewProvider);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@N Point point, @N ViewProvider viewProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    public native PlacemarkMapObject addPlacemark(@N PlacemarkCreatedCallback placemarkCreatedCallback);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    @Deprecated
    public native List<PlacemarkMapObject> addPlacemarks(@N List<Point> list, @N ImageProvider imageProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    public native PolygonMapObject addPolygon(@N Polygon polygon);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    public native PolylineMapObject addPolyline();

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    public native PolylineMapObject addPolyline(@N Polyline polyline);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @N
    public native PlacemarksStyler placemarksStyler();
}
