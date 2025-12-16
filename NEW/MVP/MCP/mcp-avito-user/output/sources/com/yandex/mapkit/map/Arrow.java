package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.PolylinePosition;
import j.N;

/* loaded from: classes7.dex */
public interface Arrow {
    int getFillColor();

    float getLength();

    int getOutlineColor();

    float getOutlineWidth();

    @N
    PolylinePosition getPosition();

    float getTriangleHeight();

    boolean isValid();

    boolean isVisible();

    void setFillColor(int i12);

    void setLength(float f12);

    void setOutlineColor(int i12);

    void setOutlineWidth(float f12);

    void setTriangleHeight(float f12);

    void setVisible(boolean z12);
}
