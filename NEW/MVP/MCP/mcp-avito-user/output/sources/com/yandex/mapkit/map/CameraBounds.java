package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.BoundingBox;
import j.P;

/* loaded from: classes7.dex */
public interface CameraBounds {
    @P
    BoundingBox getLatLngBounds();

    float getMaxZoom();

    float getMinZoom();

    boolean isValid();

    void resetMinMaxZoomPreference();

    void setLatLngBounds(@P BoundingBox boundingBox);

    void setMaxZoomPreference(float f12);

    void setMinZoomPreference(float f12);
}
