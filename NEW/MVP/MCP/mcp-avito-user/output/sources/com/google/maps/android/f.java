package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;

/* compiled from: SphericalUtil.java */
/* loaded from: classes6.dex */
public class f {
    public static LatLng a(LatLng latLng, double d12, double d13) {
        double d14 = d12 / 6371009.0d;
        double radians = Math.toRadians(d13);
        double radians2 = Math.toRadians(latLng.f354407b);
        double radians3 = Math.toRadians(latLng.f354408c);
        double dCos = Math.cos(d14);
        double dSin = Math.sin(d14);
        double dSin2 = Math.sin(radians2);
        double dCos2 = dSin * Math.cos(radians2);
        double dCos3 = (Math.cos(radians) * dCos2) + (dCos * dSin2);
        return new LatLng(Math.toDegrees(Math.asin(dCos3)), Math.toDegrees(radians3 + Math.atan2(Math.sin(radians) * dCos2, dCos - (dSin2 * dCos3))));
    }
}
