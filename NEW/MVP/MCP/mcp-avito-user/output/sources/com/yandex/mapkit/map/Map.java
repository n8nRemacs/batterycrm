package com.yandex.mapkit.map;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import com.yandex.mapkit.layers.Layer;
import com.yandex.mapkit.layers.LayerOptions;
import com.yandex.mapkit.logo.Logo;
import j.N;
import j.P;
import j.j0;

/* loaded from: classes7.dex */
public interface Map {

    public interface CameraCallback {
        @j0
        void onMoveFinished(boolean z12);
    }

    void addCameraListener(@N CameraListener cameraListener);

    void addInputListener(@N InputListener inputListener);

    void addTapListener(@N GeoObjectTapListener geoObjectTapListener);

    @N
    Layer addTileLayer(@N String str, @N LayerOptions layerOptions, @N CreateTileDataSource createTileDataSource);

    @N
    CameraPosition cameraPosition(@N Geometry geometry);

    @N
    CameraPosition cameraPosition(@N Geometry geometry, float f12, float f13, @P ScreenRect screenRect);

    @N
    CameraPosition cameraPosition(@N Geometry geometry, @N ScreenRect screenRect);

    void deselectGeoObject();

    @N
    CameraBounds getCameraBounds();

    @N
    CameraPosition getCameraPosition();

    @N
    Logo getLogo();

    @N
    MapObjectCollection getMapObjects();

    @N
    MapType getMapType();

    @N
    MapMode getMode();

    @P
    Integer getPoiLimit();

    @N
    VisibleRegion getVisibleRegion();

    boolean isAwesomeModelsEnabled();

    boolean isFastTapEnabled();

    boolean isHdModeEnabled();

    boolean isNightModeEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScrollGesturesEnabled();

    boolean isTiltGesturesEnabled();

    boolean isValid();

    boolean isZoomGesturesEnabled();

    void move(@N CameraPosition cameraPosition);

    void move(@N CameraPosition cameraPosition, @N Animation animation, @P CameraCallback cameraCallback);

    @N
    Projection projection();

    void removeCameraListener(@N CameraListener cameraListener);

    void removeInputListener(@N InputListener inputListener);

    void removeTapListener(@N GeoObjectTapListener geoObjectTapListener);

    void resetMapStyles();

    void selectGeoObject(@N GeoObjectSelectionMetadata geoObjectSelectionMetadata);

    void set2DMode(boolean z12);

    void setAwesomeModelsEnabled(boolean z12);

    void setFastTapEnabled(boolean z12);

    void setHdModeEnabled(boolean z12);

    void setMapLoadedListener(@P MapLoadedListener mapLoadedListener);

    boolean setMapStyle(int i12, @N String str);

    boolean setMapStyle(@N String str);

    void setMapType(@N MapType mapType);

    void setMode(@N MapMode mapMode);

    void setNightModeEnabled(boolean z12);

    void setPoiLimit(@P Integer num);

    void setRotateGesturesEnabled(boolean z12);

    void setScrollGesturesEnabled(boolean z12);

    void setTiltGesturesEnabled(boolean z12);

    void setZoomGesturesEnabled(boolean z12);

    @N
    VisibleRegion visibleRegion(@N CameraPosition cameraPosition);

    void wipe();
}
