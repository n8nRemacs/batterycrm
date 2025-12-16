package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.directions.driving.DrivingSummarySession;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface DrivingRouter {
    @N
    DrivingSession requestRoutes(@N List<RequestPoint> list, @N DrivingOptions drivingOptions, @N VehicleOptions vehicleOptions, @N DrivingSession.DrivingRouteListener drivingRouteListener);

    @N
    DrivingSummarySession requestRoutesSummary(@N List<RequestPoint> list, @N DrivingOptions drivingOptions, @N VehicleOptions vehicleOptions, @N DrivingSummarySession.DrivingSummaryListener drivingSummaryListener);
}
