package com.yandex.metrica.gpllibrary;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import j.N;

/* loaded from: classes7.dex */
class GplLocationCallback extends LocationCallback {

    @N
    private final LocationListener mLocationListener;

    public GplLocationCallback(@N LocationListener locationListener) {
        this.mLocationListener = locationListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        this.mLocationListener.onLocationChanged(locationResult.h());
    }
}
