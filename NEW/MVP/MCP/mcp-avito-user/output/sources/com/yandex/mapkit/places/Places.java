package com.yandex.mapkit.places;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.places.mrc.MrcPhotoPlayer;
import com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer;
import com.yandex.mapkit.places.panorama.PanoramaLayer;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.mapkit.places.panorama.Player;
import com.yandex.runtime.view.PlatformView;
import j.N;

/* loaded from: classes7.dex */
public interface Places {
    @N
    MrcPhotoPlayer createMrcPhotoPlayer(@N PlatformView platformView);

    @N
    MrcPhotoTrackPlayer createMrcPhotoTrackPlayer(@N PlatformView platformView);

    @N
    PanoramaLayer createPanoramaLayer(@N MapWindow mapWindow);

    @N
    Player createPanoramaPlayer(@N PlatformView platformView);

    @N
    Player createPanoramaPlayer(@N PlatformView platformView, float f12);

    @N
    PanoramaService createPanoramaService();

    boolean isValid();
}
