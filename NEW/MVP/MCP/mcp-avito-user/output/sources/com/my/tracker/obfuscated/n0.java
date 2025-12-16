package com.my.tracker.obfuscated;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* loaded from: classes7.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    Location f365696a;

    /* renamed from: b, reason: collision with root package name */
    int f365697b = -1;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f365698c = true;

    public void a(Context context) {
        LocationManager locationManager;
        int i12;
        Location location = null;
        this.f365696a = null;
        this.f365697b = -1;
        if (this.f365698c && w0.a("android.permission.ACCESS_FINE_LOCATION", context) && w0.a("android.permission.ACCESS_COARSE_LOCATION", context) && !w0.a() && (locationManager = (LocationManager) context.getSystemService("location")) != null) {
            long j12 = 0;
            float f12 = Float.MAX_VALUE;
            String str = null;
            for (String str2 : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(str2);
                    if (lastKnownLocation != null) {
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j12 && accuracy < f12)) {
                            str = str2;
                            location = lastKnownLocation;
                            f12 = accuracy;
                            j12 = time;
                        }
                    }
                } catch (SecurityException unused) {
                    e2.a("Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
                }
            }
            if (location != null) {
                this.f365696a = location;
                str.getClass();
                switch (str) {
                    case "passive":
                        i12 = 4;
                        break;
                    case "gps":
                        this.f365697b = 2;
                        return;
                    case "network":
                        i12 = 3;
                        break;
                    default:
                        this.f365697b = 1;
                        return;
                }
                this.f365697b = i12;
            }
        }
    }

    public void a(a1 a1Var, Context context) {
        Location location = this.f365696a;
        if (location != null) {
            a1Var.a(location, this.f365697b);
        }
    }

    public void a(boolean z12) {
        this.f365698c = z12;
    }

    public void b(Context context) {
    }
}
