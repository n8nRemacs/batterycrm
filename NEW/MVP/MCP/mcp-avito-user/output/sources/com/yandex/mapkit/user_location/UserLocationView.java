package com.yandex.mapkit.user_location;

import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.PlacemarkMapObject;
import j.N;

/* loaded from: classes7.dex */
public interface UserLocationView {
    @N
    CircleMapObject getAccuracyCircle();

    @N
    PlacemarkMapObject getArrow();

    @N
    PlacemarkMapObject getPin();

    boolean isValid();
}
