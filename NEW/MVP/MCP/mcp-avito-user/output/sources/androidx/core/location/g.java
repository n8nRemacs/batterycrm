package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.o1;
import j.N;
import j.P;
import j.X;
import j.a0;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: LocationManagerCompat.java */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: LocationManagerCompat.java */
    public static class a {
    }

    /* compiled from: LocationManagerCompat.java */
    @X
    public static class b {
    }

    /* compiled from: LocationManagerCompat.java */
    @X
    public static class c {
        public static boolean a(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @X
    public static class d {
    }

    /* compiled from: LocationManagerCompat.java */
    @X
    public static class e {
    }

    /* compiled from: LocationManagerCompat.java */
    /* renamed from: androidx.core.location.g$g, reason: collision with other inner class name */
    public static class C1736g {
        static {
            new o1();
            new o1();
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @X
    public static class i extends GnssStatus.Callback {
        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(int i12) {
            throw null;
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            new androidx.core.location.b(gnssStatus);
            throw null;
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
            throw null;
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
            throw null;
        }
    }

    /* compiled from: LocationManagerCompat.java */
    public static final class k implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@N Runnable runnable) {
            Looper.myLooper();
            throw null;
        }
    }

    /* compiled from: LocationManagerCompat.java */
    public static class l {
        public final boolean equals(Object obj) {
            if (!(obj instanceof l)) {
                return false;
            }
            ((l) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            return Objects.hash(null, null);
        }
    }

    /* compiled from: LocationManagerCompat.java */
    public static class m implements LocationListener {
        @Override // android.location.LocationListener
        public final void onLocationChanged(@N Location location) {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(@N List<Location> list) {
        }

        @Override // android.location.LocationListener
        public final void onFlushComplete(int i12) {
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(@N String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(@N String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i12, Bundle bundle) {
        }
    }

    static {
        new WeakHashMap();
    }

    public static boolean a(@N LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? c.a(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* compiled from: LocationManagerCompat.java */
    @X
    public static class n extends GnssStatus.Callback {
        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
        }

        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(int i12) {
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        }
    }

    /* compiled from: LocationManagerCompat.java */
    public static final class f implements LocationListener {
        @Override // android.location.LocationListener
        @a0
        public final void onLocationChanged(@P Location location) {
            synchronized (this) {
            }
        }

        @Override // android.location.LocationListener
        @a0
        public final void onProviderDisabled(@N String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(@N String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i12, Bundle bundle) {
        }
    }

    /* compiled from: LocationManagerCompat.java */
    @X
    public static class h extends GnssMeasurementsEvent.Callback {
        @Override // android.location.GnssMeasurementsEvent.Callback
        public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public final void onStatusChanged(int i12) {
        }
    }

    /* compiled from: LocationManagerCompat.java */
    public static class j implements GpsStatus.Listener {
        @Override // android.location.GpsStatus.Listener
        @a0
        public final void onGpsStatusChanged(int i12) {
        }
    }
}
