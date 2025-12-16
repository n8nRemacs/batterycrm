package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
final class ca0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f384227a = TimeUnit.MINUTES.toMillis(2);

    private static boolean a(@j.N Location location, @j.N Location location2) {
        long time = location.getTime() - location2.getTime();
        long j12 = f384227a;
        boolean z12 = time > j12;
        boolean z13 = time < (-j12);
        boolean z14 = time > 0;
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z15 = accuracy > 0;
        boolean z16 = accuracy < 0;
        boolean z17 = ((long) accuracy) > 200;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        boolean zEquals = provider == null ? provider2 == null : provider.equals(provider2);
        if (!z12) {
            if (z13) {
                return false;
            }
            if (!z16 && ((!z14 || z15) && (!z14 || z17 || !zEquals))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(@j.N Location location, @j.P Location location2) {
        return location2 == null || a(location, location2);
    }
}
