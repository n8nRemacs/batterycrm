package coil.network;

import Y61.k;
import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import coil.n;
import coil.util.o;
import coil.util.y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkObserver.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/network/i;", "Lcoil/network/f;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
/* loaded from: classes10.dex */
final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ConnectivityManager f58578a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final y f58579b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h f58580c;

    public i(@k ConnectivityManager connectivityManager, @k y yVar) {
        this.f58578a = connectivityManager;
        this.f58579b = yVar;
        h hVar = new h(this);
        this.f58580c = hVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), hVar);
    }

    public static final void b(i iVar, Network network, boolean z12) {
        boolean z13;
        Network[] allNetworks = iVar.f58578a.getAllNetworks();
        int length = allNetworks.length;
        boolean z14 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            Network network2 = allNetworks[i12];
            if (L.f(network2, network)) {
                z13 = z12;
            } else {
                NetworkCapabilities networkCapabilities = iVar.f58578a.getNetworkCapabilities(network2);
                z13 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z13) {
                z14 = true;
                break;
            }
            i12++;
        }
        y yVar = iVar.f58579b;
        synchronized (yVar) {
            try {
                n nVar = yVar.f58803b.get();
                G0 g02 = null;
                if (nVar != null) {
                    o oVar = nVar.f58547h;
                    if (oVar != null && oVar.f58787a <= 4) {
                        oVar.a(4, "NetworkObserver", z14 ? "ONLINE" : "OFFLINE", null);
                    }
                    yVar.f58807f = z14;
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    yVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // coil.network.f
    public final boolean a() {
        ConnectivityManager connectivityManager = this.f58578a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.network.f
    public final void shutdown() {
        this.f58578a.unregisterNetworkCallback(this.f58580c);
    }
}
