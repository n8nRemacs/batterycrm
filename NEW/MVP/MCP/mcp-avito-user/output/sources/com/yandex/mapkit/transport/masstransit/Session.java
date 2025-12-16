package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.Error;
import j.N;
import j.j0;
import java.util.List;

/* loaded from: classes7.dex */
public interface Session {

    public interface RouteListener {
        @j0
        void onMasstransitRoutes(@N List<Route> list);

        @j0
        void onMasstransitRoutesError(@N Error error);
    }

    void cancel();

    void retry(@N RouteListener routeListener);
}
