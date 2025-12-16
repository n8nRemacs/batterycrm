package com.yandex.metrica.gpllibrary;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.InterfaceC37024g;
import j.N;

/* loaded from: classes7.dex */
class GplOnSuccessListener implements InterfaceC37024g<Location> {

    @N
    private final LocationListener mLocationListener;

    public GplOnSuccessListener(@N LocationListener locationListener) {
        this.mLocationListener = locationListener;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public void onSuccess(Location location) {
        this.mLocationListener.onLocationChanged(location);
    }
}
