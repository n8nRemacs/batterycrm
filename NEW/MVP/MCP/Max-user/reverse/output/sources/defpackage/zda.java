package defpackage;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class zda {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
