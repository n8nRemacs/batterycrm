package com.yandex.mapkit.places.mrc;

import com.yandex.mapkit.geometry.PolylinePosition;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface MrcPhotoTrackPlayer {

    public enum PlaybackSpeed {
        X1,
        X2,
        X4,
        X8
    }

    void disableMove();

    void enableMove();

    @P
    String getPhotoId();

    @P
    PolylinePosition getPosition();

    boolean isIsPlaying();

    boolean isValid();

    void openPhotoAt(@N PolylinePosition polylinePosition);

    void play();

    void reset();

    void stop();
}
