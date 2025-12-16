package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class DrivingSessionBinding implements DrivingSession {
    private final NativeObject nativeObject;

    public DrivingSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession
    public native void cancel();

    @Override // com.yandex.mapkit.directions.driving.DrivingSession
    public native void retry(@N DrivingSession.DrivingRouteListener drivingRouteListener);
}
