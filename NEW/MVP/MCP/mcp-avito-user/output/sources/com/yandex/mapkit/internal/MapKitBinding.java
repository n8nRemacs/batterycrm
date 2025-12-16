package com.yandex.mapkit.internal;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.DummyLocationManager;
import com.yandex.mapkit.location.LocationManager;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.offline_cache.OfflineCacheManager;
import com.yandex.mapkit.road_events.RoadEventsManager;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import com.yandex.mapkit.road_events_layer.StyleProvider;
import com.yandex.mapkit.storage.StorageManager;
import com.yandex.mapkit.traffic.TrafficLayer;
import com.yandex.mapkit.user_location.UserLocationLayer;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.PlatformView;
import j.N;

/* loaded from: classes7.dex */
public class MapKitBinding implements MapKit {
    private final NativeObject nativeObject;

    public MapKitBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.MapKit
    @N
    public native DummyLocationManager createDummyLocationManager();

    @Override // com.yandex.mapkit.MapKit
    @N
    public native LocationManager createLocationManager();

    @Override // com.yandex.mapkit.MapKit
    @N
    public native LocationSimulator createLocationSimulator();

    @Override // com.yandex.mapkit.MapKit
    @N
    public native LocationSimulator createLocationSimulator(@N Polyline polyline);

    @Override // com.yandex.mapkit.MapKit
    @N
    public native MapWindow createMapWindow(@N PlatformView platformView);

    @Override // com.yandex.mapkit.MapKit
    @N
    public native MapWindow createMapWindow(@N PlatformView platformView, float f12);

    @Override // com.yandex.mapkit.MapKit
    @N
    public native RoadEventsManager createRoadEventsManager();

    @Override // com.yandex.mapkit.MapKit
    @N
    public native RoadEventsLayer createRouteRoadEventsLayer(@N MapWindow mapWindow, @N StyleProvider styleProvider);

    @Override // com.yandex.mapkit.MapKit
    @N
    public native TrafficLayer createTrafficLayer(@N MapWindow mapWindow);

    @Override // com.yandex.mapkit.MapKit
    @N
    public native UserLocationLayer createUserLocationLayer(@N MapWindow mapWindow);

    @Override // com.yandex.mapkit.MapKit
    @N
    public native OfflineCacheManager getOfflineCacheManager();

    @Override // com.yandex.mapkit.MapKit
    @N
    public native StorageManager getStorageManager();

    @Override // com.yandex.mapkit.MapKit
    @N
    public native String getVersion();

    @Override // com.yandex.mapkit.MapKit
    public native boolean isValid();

    @Override // com.yandex.mapkit.MapKit
    public native void onStart();

    @Override // com.yandex.mapkit.MapKit
    public native void onStop();

    @Override // com.yandex.mapkit.MapKit
    public native void resetLocationManagerToDefault();

    @Override // com.yandex.mapkit.MapKit
    public native void setApiKey(@N String str);

    @Override // com.yandex.mapkit.MapKit
    public native void setLocationManager(@N LocationManager locationManager);

    @Override // com.yandex.mapkit.MapKit
    public native void setUserId(@N String str);
}
