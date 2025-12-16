package com.avito.android.util;

import android.location.Location;
import java.util.Locale;

/* compiled from: GeoLocations.java */
/* loaded from: classes5.dex */
public final class B1 {
    public static String a(@j.P Location location) {
        return location == null ? "{}" : String.format(Locale.ENGLISH, "%s provider [%.6f:%.6f] %.2f m; time=%d", location.getProvider(), Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), Float.valueOf(location.getAccuracy()), Long.valueOf(location.getTime()));
    }
}
