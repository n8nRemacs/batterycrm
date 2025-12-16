package com.yandex.mapkit.places.mrc;

import j.P;

/* loaded from: classes7.dex */
public interface MrcPhotoPlayer {
    void disableMove();

    void enableMove();

    @P
    String getPhotoId();

    boolean isValid();

    boolean moveEnabled();

    void reset();
}
