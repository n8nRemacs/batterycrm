package com.yandex.mapkit.map;

import com.yandex.mapkit.Animation;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface MapObject {
    void addTapListener(@N MapObjectTapListener mapObjectTapListener);

    @N
    BaseMapObjectCollection getParent();

    @P
    Object getUserData();

    float getZIndex();

    boolean isDraggable();

    boolean isValid();

    boolean isVisible();

    void removeTapListener(@N MapObjectTapListener mapObjectTapListener);

    void setDragListener(@P MapObjectDragListener mapObjectDragListener);

    void setDraggable(boolean z12);

    void setUserData(@P Object obj);

    void setVisible(boolean z12);

    void setVisible(boolean z12, @N Animation animation, @P Callback callback);

    void setZIndex(float f12);
}
