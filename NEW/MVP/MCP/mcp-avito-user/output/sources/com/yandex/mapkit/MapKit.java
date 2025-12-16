package com.yandex.mapkit;

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
import com.yandex.runtime.view.PlatformView;
import j.N;

/* loaded from: classes7.dex */
public interface MapKit {
    @N
    DummyLocationManager createDummyLocationManager();

    @N
    LocationManager createLocationManager();

    @N
    LocationSimulator createLocationSimulator();

    @N
    LocationSimulator createLocationSimulator(@N Polyline polyline);

    @N
    MapWindow createMapWindow(@N PlatformView platformView);

    @N
    MapWindow createMapWindow(@N PlatformView platformView, float f12);

    @N
    RoadEventsManager createRoadEventsManager();

    @N
    RoadEventsLayer createRouteRoadEventsLayer(@N MapWindow mapWindow, @N StyleProvider styleProvider);

    @N
    TrafficLayer createTrafficLayer(@N MapWindow mapWindow);

    @N
    UserLocationLayer createUserLocationLayer(@N MapWindow mapWindow);

    @N
    OfflineCacheManager getOfflineCacheManager();

    @N
    StorageManager getStorageManager();

    @N
    String getVersion();

    boolean isValid();

    void onStart();

    void onStop();

    void resetLocationManagerToDefault();

    void setApiKey(@N String str);

    void setLocationManager(@N LocationManager locationManager);

    void setUserId(@N String str);
}
