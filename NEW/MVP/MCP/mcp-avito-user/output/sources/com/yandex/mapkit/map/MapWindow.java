package com.yandex.mapkit.map;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface MapWindow {
    void addSizeChangedListener(@N SizeChangedListener sizeChangedListener);

    @P
    ScreenPoint getFocusPoint();

    @P
    ScreenRect getFocusRect();

    @N
    VisibleRegion getFocusRegion();

    @P
    ScreenPoint getGestureFocusPoint();

    @N
    GestureFocusPointMode getGestureFocusPointMode();

    @N
    Map getMap();

    @N
    PointOfView getPointOfView();

    float getScaleFactor();

    int height();

    boolean isValid();

    void removeSizeChangedListener(@N SizeChangedListener sizeChangedListener);

    @P
    Point screenToWorld(@N ScreenPoint screenPoint);

    void setFocusPoint(@P ScreenPoint screenPoint);

    void setFocusRect(@P ScreenRect screenRect);

    void setGestureFocusPoint(@P ScreenPoint screenPoint);

    void setGestureFocusPointMode(@N GestureFocusPointMode gestureFocusPointMode);

    void setPointOfView(@N PointOfView pointOfView);

    void setScaleFactor(float f12);

    int width();

    @P
    ScreenPoint worldToScreen(@N Point point);
}
