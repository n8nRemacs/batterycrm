package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.Error;
import j.N;
import j.j0;
import java.util.List;

/* loaded from: classes7.dex */
public interface DrivingSession {

    public interface DrivingRouteListener {
        @j0
        void onDrivingRoutes(@N List<DrivingRoute> list);

        @j0
        void onDrivingRoutesError(@N Error error);
    }

    void cancel();

    void retry(@N DrivingRouteListener drivingRouteListener);
}
