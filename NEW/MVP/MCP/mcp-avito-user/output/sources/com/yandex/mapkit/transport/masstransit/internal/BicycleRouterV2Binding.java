package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.masstransit.BicycleRouterV2;
import com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import com.yandex.runtime.NativeObject;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class BicycleRouterV2Binding implements BicycleRouterV2 {
    private final NativeObject nativeObject;

    public BicycleRouterV2Binding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.BicycleRouterV2
    @N
    public native Session requestRoutes(@N List<RequestPoint> list, @N TimeOptions timeOptions, @N RouteOptions routeOptions, @N Session.RouteListener routeListener);

    @Override // com.yandex.mapkit.transport.masstransit.BicycleRouterV2
    @N
    public native SummarySession requestRoutesSummary(@N RequestPoint requestPoint, @N List<RequestPoint> list, @N TimeOptions timeOptions, @N RouteOptions routeOptions, @N SummarySession.SummaryListener summaryListener);

    @Override // com.yandex.mapkit.transport.masstransit.BicycleRouterV2
    @N
    public native SummarySession requestRoutesSummary(@N List<RequestPoint> list, @N TimeOptions timeOptions, @N RouteOptions routeOptions, @N SummarySession.SummaryListener summaryListener);

    @Override // com.yandex.mapkit.transport.masstransit.BicycleRouterV2
    @N
    public native Session resolveUri(@N String str, @N TimeOptions timeOptions, @N Session.RouteListener routeListener);

    @Override // com.yandex.mapkit.transport.masstransit.BicycleRouterV2
    @N
    public native MasstransitRouteSerializer routeSerializer();
}
