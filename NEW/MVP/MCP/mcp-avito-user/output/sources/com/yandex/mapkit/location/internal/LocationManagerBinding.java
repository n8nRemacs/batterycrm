package com.yandex.mapkit.location.internal;

import com.yandex.mapkit.location.FilteringMode;
import com.yandex.mapkit.location.LocationListener;
import com.yandex.mapkit.location.LocationManager;
import com.yandex.mapkit.location.Purpose;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import j.N;

/* loaded from: classes7.dex */
public class LocationManagerBinding implements LocationManager {
    protected Subscription<LocationListener> locationListenerSubscription = new Subscription<LocationListener>() { // from class: com.yandex.mapkit.location.internal.LocationManagerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(LocationListener locationListener) {
            return LocationManagerBinding.createLocationListener(locationListener);
        }
    };
    private final NativeObject nativeObject;

    public LocationManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createLocationListener(LocationListener locationListener);

    @Override // com.yandex.mapkit.location.LocationManager
    public native void requestSingleUpdate(@N LocationListener locationListener);

    @Override // com.yandex.mapkit.location.LocationManager
    public native void resume();

    @Override // com.yandex.mapkit.location.LocationManager
    public native void subscribeForLocationUpdates(double d12, long j12, double d13, boolean z12, @N FilteringMode filteringMode, @N Purpose purpose, @N LocationListener locationListener);

    @Override // com.yandex.mapkit.location.LocationManager
    public native void suspend();

    @Override // com.yandex.mapkit.location.LocationManager
    public native void unsubscribe(@N LocationListener locationListener);
}
