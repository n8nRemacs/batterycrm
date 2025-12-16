package com.yandex.mapkit.transport.bicycle;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.bicycle.Session;
import com.yandex.mapkit.transport.bicycle.SummarySession;
import j.N;
import java.util.List;

@Deprecated
/* loaded from: classes7.dex */
public interface BicycleRouter {
    @N
    Session requestRoutes(@N List<RequestPoint> list, @N VehicleType vehicleType, @N Session.RouteListener routeListener);

    @N
    SummarySession requestRoutesSummary(@N List<RequestPoint> list, @N VehicleType vehicleType, @N SummarySession.SummaryListener summaryListener);

    @N
    Session resolveUri(@N String str, @N Session.RouteListener routeListener);
}
