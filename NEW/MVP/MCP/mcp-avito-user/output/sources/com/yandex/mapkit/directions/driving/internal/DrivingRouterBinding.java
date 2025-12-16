package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.directions.driving.DrivingSummarySession;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.runtime.NativeObject;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class DrivingRouterBinding implements DrivingRouter {
    private final NativeObject nativeObject;

    public DrivingRouterBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    @N
    public native DrivingSession requestRoutes(@N List<RequestPoint> list, @N DrivingOptions drivingOptions, @N VehicleOptions vehicleOptions, @N DrivingSession.DrivingRouteListener drivingRouteListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    @N
    public native DrivingSummarySession requestRoutesSummary(@N List<RequestPoint> list, @N DrivingOptions drivingOptions, @N VehicleOptions vehicleOptions, @N DrivingSummarySession.DrivingSummaryListener drivingSummaryListener);
}
