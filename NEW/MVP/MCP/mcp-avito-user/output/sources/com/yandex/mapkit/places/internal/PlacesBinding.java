package com.yandex.mapkit.places.internal;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.places.Places;
import com.yandex.mapkit.places.mrc.MrcPhotoPlayer;
import com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer;
import com.yandex.mapkit.places.panorama.PanoramaLayer;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.mapkit.places.panorama.Player;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.PlatformView;
import j.N;

/* loaded from: classes7.dex */
public class PlacesBinding implements Places {
    private final NativeObject nativeObject;

    public PlacesBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.Places
    @N
    public native MrcPhotoPlayer createMrcPhotoPlayer(@N PlatformView platformView);

    @Override // com.yandex.mapkit.places.Places
    @N
    public native MrcPhotoTrackPlayer createMrcPhotoTrackPlayer(@N PlatformView platformView);

    @Override // com.yandex.mapkit.places.Places
    @N
    public native PanoramaLayer createPanoramaLayer(@N MapWindow mapWindow);

    @Override // com.yandex.mapkit.places.Places
    @N
    public native Player createPanoramaPlayer(@N PlatformView platformView);

    @Override // com.yandex.mapkit.places.Places
    @N
    public native Player createPanoramaPlayer(@N PlatformView platformView, float f12);

    @Override // com.yandex.mapkit.places.Places
    @N
    public native PanoramaService createPanoramaService();

    @Override // com.yandex.mapkit.places.Places
    public native boolean isValid();
}
