package com.yandex.mapkit.location;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface LocationSimulator extends LocationManager {
    @P
    Polyline getGeometry();

    double getSpeed();

    boolean isActive();

    @N
    PolylinePosition polylinePosition();

    void setGeometry(@P Polyline polyline);

    void setLocationSpeedProviding(boolean z12);

    void setSpeed(double d12);

    void startSimulation(@N SimulationAccuracy simulationAccuracy);

    void stopSimulation();

    void subscribeForSimulatorEvents(@N LocationSimulatorListener locationSimulatorListener);

    void unsubscribeFromSimulatorEvents(@N LocationSimulatorListener locationSimulatorListener);
}
