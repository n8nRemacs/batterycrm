package com.yandex.runtime.sensors.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;

/* loaded from: classes8.dex */
public class LocationSubscription implements LocationListener {
    private static final String LOG_TAG = "com.yandex.runtime.sensors.internal.LocationSubscription";
    private final BroadcastReceiver gpsStateReceiver;
    private final LocationManager manager;
    private final float movementThreshold;
    private final NativeObject nativeLocationSubscription;
    private final Provider provider;
    private final long reportInterval;

    public enum Provider {
        GPS("gps"),
        NETWORK("network"),
        PASSIVE("passive");

        private String value;

        Provider(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public LocationSubscription(Provider provider, long j12, float f12, NativeObject nativeObject) {
        this.provider = provider;
        this.reportInterval = j12;
        this.movementThreshold = f12;
        this.nativeLocationSubscription = nativeObject;
        if (isLocationListenerStatusChangedSupported()) {
            this.gpsStateReceiver = null;
        } else {
            this.gpsStateReceiver = getGpsStateReceiver();
        }
        LocationManager locationManager = (LocationManager) Runtime.getApplicationContext().getSystemService("location");
        this.manager = locationManager;
        if (locationManager == null) {
            throw new RuntimeException("Can't get LocationManager. Missed permission?");
        }
        start();
    }

    private BroadcastReceiver getGpsStateReceiver() {
        return new BroadcastReceiver() { // from class: com.yandex.runtime.sensors.internal.LocationSubscription.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (LocationSubscription.this.manager == null) {
                    return;
                }
                LocationSubscription.statusChanged(LocationSubscription.this.nativeLocationSubscription, LocationSubscription.this.manager.isProviderEnabled("gps"));
            }
        };
    }

    public static boolean isLocationListenerStatusChangedSupported() {
        return Build.VERSION.SDK_INT < 29;
    }

    public static native void locationChanged(NativeObject nativeObject, Location location);

    public static long relativeTimeDelta(Location location) {
        if (location.getElapsedRealtimeNanos() > 0) {
            return SystemClock.elapsedRealtime() - (location.getElapsedRealtimeNanos() / 1000000);
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startImpl() {
        try {
            this.manager.requestLocationUpdates(this.provider.toString(), this.reportInterval, this.movementThreshold, this);
        } catch (IllegalArgumentException | SecurityException | RuntimeException unused) {
            statusChanged(this.nativeLocationSubscription, false);
        }
    }

    public static native void statusChanged(NativeObject nativeObject, boolean z12);

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        locationChanged(this.nativeLocationSubscription, location);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        statusChanged(this.nativeLocationSubscription, false);
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i12, Bundle bundle) {
        statusChanged(this.nativeLocationSubscription, i12 == 2);
    }

    public void start() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.sensors.internal.LocationSubscription.2
            @Override // java.lang.Runnable
            public void run() {
                if (!LocationSubscription.isLocationListenerStatusChangedSupported()) {
                    Runtime.getApplicationContext().registerReceiver(LocationSubscription.this.gpsStateReceiver, new IntentFilter("android.location.PROVIDERS_CHANGED"));
                }
                LocationSubscription.this.startImpl();
            }
        });
    }

    public void stop() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.sensors.internal.LocationSubscription.3
            @Override // java.lang.Runnable
            public void run() {
                if (!LocationSubscription.isLocationListenerStatusChangedSupported()) {
                    Runtime.getApplicationContext().unregisterReceiver(LocationSubscription.this.gpsStateReceiver);
                }
                LocationSubscription.this.manager.removeUpdates(LocationSubscription.this);
            }
        });
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }
}
