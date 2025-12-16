package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes8.dex */
final class f81 {

    /* renamed from: c, reason: collision with root package name */
    private static final HashSet f385220c = new HashSet(Collections.singletonList("gps"));

    /* renamed from: d, reason: collision with root package name */
    private static final HashSet f385221d = new HashSet(Arrays.asList("gps", "passive"));

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final LocationManager f385222a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final fs0 f385223b;

    public f81(@j.N Context context, @j.P LocationManager locationManager) {
        this.f385222a = locationManager;
        this.f385223b = new fs0(context);
    }

    private boolean b(@j.N String str) {
        boolean zA2 = this.f385223b.a();
        boolean zB2 = this.f385223b.b();
        boolean zContains = f385220c.contains(str);
        return !f385221d.contains(str) ? zContains || !zA2 : !(!zContains && zA2 && zB2);
    }

    @j.P
    public final Location a(@j.N String str) {
        if (!b(str)) {
            return null;
        }
        try {
            LocationManager locationManager = this.f385222a;
            if (locationManager != null) {
                return locationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
