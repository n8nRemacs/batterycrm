package com.yandex.mapkit.location.internal;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.location.LocationSimulatorListener;
import com.yandex.mapkit.location.SimulationAccuracy;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class LocationSimulatorBinding extends LocationManagerBinding implements LocationSimulator {
    protected Subscription<LocationSimulatorListener> locationSimulatorListenerSubscription;

    public LocationSimulatorBinding(NativeObject nativeObject) {
        super(nativeObject);
        this.locationSimulatorListenerSubscription = new Subscription<LocationSimulatorListener>() { // from class: com.yandex.mapkit.location.internal.LocationSimulatorBinding.1
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(LocationSimulatorListener locationSimulatorListener) {
                return LocationSimulatorBinding.createLocationSimulatorListener(locationSimulatorListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createLocationSimulatorListener(LocationSimulatorListener locationSimulatorListener);

    @Override // com.yandex.mapkit.location.LocationSimulator
    @P
    public native Polyline getGeometry();

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native double getSpeed();

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native boolean isActive();

    @Override // com.yandex.mapkit.location.LocationSimulator
    @N
    public native PolylinePosition polylinePosition();

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void setGeometry(@P Polyline polyline);

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void setLocationSpeedProviding(boolean z12);

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void setSpeed(double d12);

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void startSimulation(@N SimulationAccuracy simulationAccuracy);

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void stopSimulation();

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void subscribeForSimulatorEvents(@N LocationSimulatorListener locationSimulatorListener);

    @Override // com.yandex.mapkit.location.LocationSimulator
    public native void unsubscribeFromSimulatorEvents(@N LocationSimulatorListener locationSimulatorListener);
}
