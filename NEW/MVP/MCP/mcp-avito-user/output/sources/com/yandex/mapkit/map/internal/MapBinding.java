package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import com.yandex.mapkit.layers.Layer;
import com.yandex.mapkit.layers.LayerOptions;
import com.yandex.mapkit.logo.Logo;
import com.yandex.mapkit.map.CameraBounds;
import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CreateTileDataSource;
import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import com.yandex.mapkit.map.InputListener;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapLoadedListener;
import com.yandex.mapkit.map.MapMode;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapType;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class MapBinding implements Map {
    private final NativeObject nativeObject;
    protected Subscription<GeoObjectTapListener> geoObjectTapListenerSubscription = new Subscription<GeoObjectTapListener>() { // from class: com.yandex.mapkit.map.internal.MapBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(GeoObjectTapListener geoObjectTapListener) {
            return MapBinding.createGeoObjectTapListener(geoObjectTapListener);
        }
    };
    protected Subscription<CameraListener> cameraListenerSubscription = new Subscription<CameraListener>() { // from class: com.yandex.mapkit.map.internal.MapBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(CameraListener cameraListener) {
            return MapBinding.createCameraListener(cameraListener);
        }
    };
    protected Subscription<InputListener> inputListenerSubscription = new Subscription<InputListener>() { // from class: com.yandex.mapkit.map.internal.MapBinding.3
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(InputListener inputListener) {
            return MapBinding.createInputListener(inputListener);
        }
    };
    protected Subscription<MapLoadedListener> mapLoadedListenerSubscription = new Subscription<MapLoadedListener>() { // from class: com.yandex.mapkit.map.internal.MapBinding.4
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(MapLoadedListener mapLoadedListener) {
            return MapBinding.createMapLoadedListener(mapLoadedListener);
        }
    };

    public MapBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createCameraListener(CameraListener cameraListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createGeoObjectTapListener(GeoObjectTapListener geoObjectTapListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createInputListener(InputListener inputListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createMapLoadedListener(MapLoadedListener mapLoadedListener);

    @Override // com.yandex.mapkit.map.Map
    public native void addCameraListener(@N CameraListener cameraListener);

    @Override // com.yandex.mapkit.map.Map
    public native void addInputListener(@N InputListener inputListener);

    @Override // com.yandex.mapkit.map.Map
    public native void addTapListener(@N GeoObjectTapListener geoObjectTapListener);

    @Override // com.yandex.mapkit.map.Map
    @N
    public native Layer addTileLayer(@N String str, @N LayerOptions layerOptions, @N CreateTileDataSource createTileDataSource);

    @Override // com.yandex.mapkit.map.Map
    @N
    public native CameraPosition cameraPosition(@N Geometry geometry);

    @Override // com.yandex.mapkit.map.Map
    @N
    public native CameraPosition cameraPosition(@N Geometry geometry, float f12, float f13, @P ScreenRect screenRect);

    @Override // com.yandex.mapkit.map.Map
    @N
    public native CameraPosition cameraPosition(@N Geometry geometry, @N ScreenRect screenRect);

    @Override // com.yandex.mapkit.map.Map
    public native void deselectGeoObject();

    @Override // com.yandex.mapkit.map.Map
    @N
    public native CameraBounds getCameraBounds();

    @Override // com.yandex.mapkit.map.Map
    @N
    public native CameraPosition getCameraPosition();

    @Override // com.yandex.mapkit.map.Map
    @N
    public native Logo getLogo();

    @Override // com.yandex.mapkit.map.Map
    @N
    public native MapObjectCollection getMapObjects();

    @Override // com.yandex.mapkit.map.Map
    @N
    public native MapType getMapType();

    @Override // com.yandex.mapkit.map.Map
    @N
    public native MapMode getMode();

    @Override // com.yandex.mapkit.map.Map
    @P
    public native Integer getPoiLimit();

    @Override // com.yandex.mapkit.map.Map
    @N
    public native VisibleRegion getVisibleRegion();

    @Override // com.yandex.mapkit.map.Map
    public native boolean isAwesomeModelsEnabled();

    @Override // com.yandex.mapkit.map.Map
    public native boolean isFastTapEnabled();

    @Override // com.yandex.mapkit.map.Map
    public native boolean isHdModeEnabled();

    @Override // com.yandex.mapkit.map.Map
    public native boolean isNightModeEnabled();

    @Override // com.yandex.mapkit.map.Map
    public native boolean isRotateGesturesEnabled();

    @Override // com.yandex.mapkit.map.Map
    public native boolean isScrollGesturesEnabled();

    @Override // com.yandex.mapkit.map.Map
    public native boolean isTiltGesturesEnabled();

    @Override // com.yandex.mapkit.map.Map
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.Map
    public native boolean isZoomGesturesEnabled();

    @Override // com.yandex.mapkit.map.Map
    public native void move(@N CameraPosition cameraPosition);

    @Override // com.yandex.mapkit.map.Map
    public native void move(@N CameraPosition cameraPosition, @N Animation animation, @P Map.CameraCallback cameraCallback);

    @Override // com.yandex.mapkit.map.Map
    @N
    public native Projection projection();

    @Override // com.yandex.mapkit.map.Map
    public native void removeCameraListener(@N CameraListener cameraListener);

    @Override // com.yandex.mapkit.map.Map
    public native void removeInputListener(@N InputListener inputListener);

    @Override // com.yandex.mapkit.map.Map
    public native void removeTapListener(@N GeoObjectTapListener geoObjectTapListener);

    @Override // com.yandex.mapkit.map.Map
    public native void resetMapStyles();

    @Override // com.yandex.mapkit.map.Map
    public native void selectGeoObject(@N GeoObjectSelectionMetadata geoObjectSelectionMetadata);

    @Override // com.yandex.mapkit.map.Map
    public native void set2DMode(boolean z12);

    @Override // com.yandex.mapkit.map.Map
    public native void setAwesomeModelsEnabled(boolean z12);

    @Override // com.yandex.mapkit.map.Map
    public native void setFastTapEnabled(boolean z12);

    @Override // com.yandex.mapkit.map.Map
    public native void setHdModeEnabled(boolean z12);

    @Override // com.yandex.mapkit.map.Map
    public native void setMapLoadedListener(@P MapLoadedListener mapLoadedListener);

    @Override // com.yandex.mapkit.map.Map
    public native boolean setMapStyle(int i12, @N String str);

    @Override // com.yandex.mapkit.map.Map
    public native boolean setMapStyle(@N String str);

    @Override // com.yandex.mapkit.map.Map
    public native void setMapType(@N MapType mapType);

    @Override // com.yandex.mapkit.map.Map
    public native void setMode(@N MapMode mapMode);

    @Override // com.yandex.mapkit.map.Map
    public native void setNightModeEnabled(boolean z12);

    @Override // com.yandex.mapkit.map.Map
    public native void setPoiLimit(@P Integer num);

    @Override // com.yandex.mapkit.map.Map
    public native void setRotateGesturesEnabled(boolean z12);

    @Override // com.yandex.mapkit.map.Map
    public native void setScrollGesturesEnabled(boolean z12);

    @Override // com.yandex.mapkit.map.Map
    public native void setTiltGesturesEnabled(boolean z12);

    @Override // com.yandex.mapkit.map.Map
    public native void setZoomGesturesEnabled(boolean z12);

    @Override // com.yandex.mapkit.map.Map
    @N
    public native VisibleRegion visibleRegion(@N CameraPosition cameraPosition);

    @Override // com.yandex.mapkit.map.Map
    public native void wipe();
}
