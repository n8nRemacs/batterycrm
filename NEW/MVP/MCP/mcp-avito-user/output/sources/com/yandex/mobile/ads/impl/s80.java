package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class s80 implements ea0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ga0 f389811a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final f81 f389812b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final LocationManager f389813c;

    public s80(@j.N Context context) {
        Context applicationContext = context.getApplicationContext();
        LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
        this.f389813c = locationManager;
        this.f389812b = new f81(applicationContext, locationManager);
        this.f389811a = new ga0();
    }

    @Override // com.yandex.mobile.ads.impl.ea0
    @j.P
    public final Location a() {
        LocationManager locationManager;
        try {
            locationManager = this.f389813c;
        } catch (Throwable unused) {
        }
        List<String> allProviders = locationManager != null ? locationManager.getAllProviders() : null;
        if (allProviders == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = allProviders.iterator();
        while (it.hasNext()) {
            Location locationA = this.f389812b.a(it.next());
            if (locationA != null) {
                arrayList.add(locationA);
            }
        }
        return this.f389811a.a(arrayList);
    }
}
