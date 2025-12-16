package com.yandex.mapkit.transport.bicycle.internal;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.bicycle.BicycleRouter;
import com.yandex.mapkit.transport.bicycle.Session;
import com.yandex.mapkit.transport.bicycle.SummarySession;
import com.yandex.mapkit.transport.bicycle.VehicleType;
import com.yandex.runtime.NativeObject;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class BicycleRouterBinding implements BicycleRouter {
    private final NativeObject nativeObject;

    public BicycleRouterBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.bicycle.BicycleRouter
    @N
    public native Session requestRoutes(@N List<RequestPoint> list, @N VehicleType vehicleType, @N Session.RouteListener routeListener);

    @Override // com.yandex.mapkit.transport.bicycle.BicycleRouter
    @N
    public native SummarySession requestRoutesSummary(@N List<RequestPoint> list, @N VehicleType vehicleType, @N SummarySession.SummaryListener summaryListener);

    @Override // com.yandex.mapkit.transport.bicycle.BicycleRouter
    @N
    public native Session resolveUri(@N String str, @N Session.RouteListener routeListener);
}
