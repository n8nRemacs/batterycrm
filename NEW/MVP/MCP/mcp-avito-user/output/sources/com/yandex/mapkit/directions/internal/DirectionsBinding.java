package com.yandex.mapkit.directions.internal;

import com.yandex.mapkit.directions.Directions;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class DirectionsBinding implements Directions {
    private final NativeObject nativeObject;

    public DirectionsBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.Directions
    @N
    public native DrivingRouter createDrivingRouter(@N DrivingRouterType drivingRouterType);

    @Override // com.yandex.mapkit.directions.Directions
    public native boolean isValid();
}
