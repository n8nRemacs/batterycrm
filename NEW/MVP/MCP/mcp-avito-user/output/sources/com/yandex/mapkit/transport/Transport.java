package com.yandex.mapkit.transport;

import com.yandex.mapkit.transport.bicycle.BicycleRouter;
import com.yandex.mapkit.transport.masstransit.BicycleRouterV2;
import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.time.AdjustedClock;
import j.N;

/* loaded from: classes7.dex */
public interface Transport {
    @N
    @Deprecated
    BicycleRouter createBicycleRouter();

    @N
    BicycleRouterV2 createBicycleRouterV2();

    @N
    BicycleRouterV2 createElectricBikeRouter();

    @N
    MasstransitRouter createMasstransitRouter();

    @N
    PedestrianRouter createPedestrianRouter();

    @N
    BicycleRouterV2 createScooterRouter();

    @N
    AdjustedClock getAdjustedClock();

    boolean isValid();
}
