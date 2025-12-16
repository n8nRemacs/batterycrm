package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface BicycleRouterV2 {
    @N
    Session requestRoutes(@N List<RequestPoint> list, @N TimeOptions timeOptions, @N RouteOptions routeOptions, @N Session.RouteListener routeListener);

    @N
    SummarySession requestRoutesSummary(@N RequestPoint requestPoint, @N List<RequestPoint> list, @N TimeOptions timeOptions, @N RouteOptions routeOptions, @N SummarySession.SummaryListener summaryListener);

    @N
    SummarySession requestRoutesSummary(@N List<RequestPoint> list, @N TimeOptions timeOptions, @N RouteOptions routeOptions, @N SummarySession.SummaryListener summaryListener);

    @N
    Session resolveUri(@N String str, @N TimeOptions timeOptions, @N Session.RouteListener routeListener);

    @N
    MasstransitRouteSerializer routeSerializer();
}
