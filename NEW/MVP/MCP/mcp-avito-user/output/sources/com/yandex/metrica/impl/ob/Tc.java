package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;

/* loaded from: classes7.dex */
class Tc extends Dc<Xb> {

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final LocationManager f379511f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final String f379512g;

    @j.k0
    public Tc(@j.N Context context, @j.N Looper looper, @j.P LocationManager locationManager, @j.N InterfaceC39291zd interfaceC39291zd, @j.N String str, @j.N LocationListener locationListener) {
        super(context, locationListener, interfaceC39291zd, looper);
        this.f379511f = locationManager;
        this.f379512g = str;
    }

    @Override // com.yandex.metrica.impl.ob.Dc
    @SuppressLint({"MissingPermission"})
    public void b() {
        Location lastKnownLocation;
        if (this.f377964b.a(this.f377963a)) {
            LocationManager locationManager = this.f379511f;
            if (locationManager != null) {
                try {
                    lastKnownLocation = locationManager.getLastKnownLocation(this.f379512g);
                } catch (Throwable unused) {
                }
            } else {
                lastKnownLocation = null;
            }
            this.f377965c.onLocationChanged(lastKnownLocation);
        }
    }

    public boolean c() {
        if (!this.f377964b.a(this.f377963a)) {
            return false;
        }
        String str = this.f379512g;
        long j12 = Dc.f377962e;
        LocationListener locationListener = this.f377965c;
        Looper looper = this.f377966d;
        LocationManager locationManager = this.f379511f;
        if (locationManager == null) {
            return false;
        }
        try {
            locationManager.requestLocationUpdates(str, j12, 0.0f, locationListener, looper);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.yandex.metrica.impl.ob.Dc
    public /* bridge */ /* synthetic */ boolean a(@j.N Xb xb2) {
        return c();
    }

    @Override // com.yandex.metrica.impl.ob.Dc
    public void a() {
        LocationManager locationManager = this.f379511f;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this.f377965c);
            } catch (Throwable unused) {
            }
        }
    }
}
