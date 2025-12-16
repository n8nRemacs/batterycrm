package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Point;
import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface MapObjectDragListener {
    @j0
    void onMapObjectDrag(@N MapObject mapObject, @N Point point);

    @j0
    void onMapObjectDragEnd(@N MapObject mapObject);

    @j0
    void onMapObjectDragStart(@N MapObject mapObject);
}
