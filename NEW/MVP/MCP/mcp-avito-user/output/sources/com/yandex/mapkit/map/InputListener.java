package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Point;
import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface InputListener {
    @j0
    void onMapLongTap(@N Map map, @N Point point);

    @j0
    void onMapTap(@N Map map, @N Point point);
}
