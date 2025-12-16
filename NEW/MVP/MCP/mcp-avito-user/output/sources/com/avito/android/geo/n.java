package com.avito.android.geo;

import android.location.Location;
import android.location.LocationManager;
import com.avito.android.util.L6;
import j.N;
import j.P;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SimpleGeoProvider.java */
/* loaded from: classes13.dex */
class n extends b {

    /* renamed from: g, reason: collision with root package name */
    @N
    public final LocationManager f159309g;

    /* renamed from: h, reason: collision with root package name */
    @N
    public final a f159310h;

    /* renamed from: i, reason: collision with root package name */
    @N
    public final HashMap f159311i;

    /* compiled from: SimpleGeoProvider.java */
    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final WeakReference<b> f159312a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final WeakReference<Map<String, Boolean>> f159313b;

        public a(@N n nVar, @N HashMap map) {
            this.f159312a = new WeakReference<>(nVar);
            this.f159313b = new WeakReference<>(map);
        }

        @Override // com.avito.android.geo.o, android.location.LocationListener
        public final void onLocationChanged(Location location) {
            b bVar = this.f159312a.get();
            if (bVar != null) {
                bVar.c(location);
            }
        }

        @Override // com.avito.android.geo.o, android.location.LocationListener
        public final void onProviderEnabled(String str) {
            Map<String, Boolean> map = this.f159313b.get();
            if (map == null || !map.containsKey(str) || map.get(str).booleanValue()) {
                return;
            }
            map.put(str, Boolean.TRUE);
            this.f159312a.get().e(str);
        }
    }

    public n(@P GeoService geoService, @N L6 l62, @N com.avito.android.server_time.a aVar, @N LocationManager locationManager) {
        super(geoService, l62, aVar);
        HashMap map = new HashMap();
        this.f159311i = map;
        this.f159309g = locationManager;
        this.f159310h = new a(this, map);
    }

    @Override // com.avito.android.geo.b
    public final void b() {
        try {
            this.f159309g.removeUpdates(this.f159310h);
        } catch (Throwable unused) {
        }
    }

    @Override // com.avito.android.geo.b
    public final void d() {
        LocationManager locationManager = this.f159309g;
        c(locationManager.getLastKnownLocation("passive"));
        c(locationManager.getLastKnownLocation("network"));
        c(locationManager.getLastKnownLocation("gps"));
        e("passive");
        e("network");
        if (this.f159297e == 1) {
            e("gps");
        }
    }

    @Override // com.avito.android.geo.b
    public final void e(@N String str) {
        boolean zIsProviderEnabled = this.f159309g.isProviderEnabled(str);
        HashMap map = this.f159311i;
        if (!zIsProviderEnabled) {
            map.put(str, Boolean.FALSE);
        } else {
            this.f159309g.requestLocationUpdates(str, 100L, 1.0f, this.f159310h);
            map.put(str, Boolean.TRUE);
        }
    }
}
