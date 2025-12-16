package com.yandex.mapkit.directions;

import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import j.N;

/* loaded from: classes7.dex */
public interface Directions {
    @N
    DrivingRouter createDrivingRouter(@N DrivingRouterType drivingRouterType);

    boolean isValid();
}
