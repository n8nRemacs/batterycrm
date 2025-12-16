package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.zc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39290zc implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Pc f382314a;

    public C39290zc(@j.N Pc pc2) {
        this.f382314a = pc2;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(@j.P Location location) {
        if (location != null) {
            this.f382314a.a(location);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i12, Bundle bundle) {
    }
}
