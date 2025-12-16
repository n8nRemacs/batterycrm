package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Circle;
import j.N;

/* loaded from: classes7.dex */
public interface CircleMapObject extends MapObject {
    int getFillColor();

    @N
    Circle getGeometry();

    int getStrokeColor();

    float getStrokeWidth();

    boolean isGeodesic();

    void setFillColor(int i12);

    void setGeodesic(boolean z12);

    void setGeometry(@N Circle circle);

    void setStrokeColor(int i12);

    void setStrokeWidth(float f12);
}
