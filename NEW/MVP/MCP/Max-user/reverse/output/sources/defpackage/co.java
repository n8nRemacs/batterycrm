package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class co extends n2 {
    public final Object X;
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ ho o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(ho hoVar, jdc jdcVar) {
        super(hoVar);
        this.o = hoVar;
        this.X = jdcVar;
    }

    @Override // defpackage.n2
    public final IntentFilter E() {
        switch (this.d) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.n2
    public final int H() {
        Location location;
        boolean z;
        long j;
        switch (this.d) {
            case 0:
                return xn.a((PowerManager) this.X) ? 2 : 1;
            default:
                jdc jdcVar = (jdc) this.X;
                sof sofVar = (sof) jdcVar.d;
                LocationManager locationManager = (LocationManager) jdcVar.c;
                if (sofVar.b > System.currentTimeMillis()) {
                    z = sofVar.a;
                } else {
                    Context context = (Context) jdcVar.b;
                    Location lastKnownLocation = null;
                    if (z4j.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (z4j.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (nn0.f == null) {
                            nn0.f = new nn0();
                        }
                        nn0 nn0Var = nn0.f;
                        nn0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        nn0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = nn0Var.a == 1;
                        long j2 = nn0Var.c;
                        long j3 = nn0Var.b;
                        nn0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = nn0Var.c;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        sofVar.a = z;
                        sofVar.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.n2
    public final void b0() throws PackageManager.NameNotFoundException {
        switch (this.d) {
            case 0:
                this.o.n(true, true);
                break;
            default:
                this.o.n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(ho hoVar, Context context) {
        super(hoVar);
        this.o = hoVar;
        this.X = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
