package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Polygon;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import j.N;

/* loaded from: classes7.dex */
public interface PolygonMapObject extends MapObject {
    int getFillColor();

    @N
    Polygon getGeometry();

    int getStrokeColor();

    float getStrokeWidth();

    boolean isGeodesic();

    void resetPattern();

    void setFillColor(int i12);

    void setGeodesic(boolean z12);

    void setGeometry(@N Polygon polygon);

    void setPattern(@N AnimatedImageProvider animatedImageProvider, float f12);

    void setPattern(@N ImageProvider imageProvider, float f12);

    void setStrokeColor(int i12);

    void setStrokeWidth(float f12);
}
