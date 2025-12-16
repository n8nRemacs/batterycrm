package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class iea {
    public static final String a = cei.m("NetworkStateTracker");

    public static final gea a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesA;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilitiesA = xda.a(connectivityManager, yda.a(connectivityManager));
        } catch (SecurityException e) {
            cei.g().f(a, "Unable to validate active network", e);
        }
        boolean zB = networkCapabilitiesA != null ? xda.b(networkCapabilitiesA, 16) : false;
        return new gea(z, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
